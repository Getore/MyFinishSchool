package com.bootdo.therapy.service.impl;

import com.bootdo.common.domain.Tree;
import com.bootdo.common.utils.BuildTree;
import com.bootdo.system.domain.DeptDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bootdo.therapy.dao.TheraprojectDao;
import com.bootdo.therapy.domain.TheraprojectDO;
import com.bootdo.therapy.service.TheraprojectService;



@Service
public class TheraprojectServiceImpl implements TheraprojectService {
	@Autowired
	private TheraprojectDao theraprojectDao;
	
	@Override
	public TheraprojectDO get(Integer id){
		return theraprojectDao.get(id);
	}

	@Override
	public TheraprojectDO getPId(String parentId) {
		return theraprojectDao.getPId(parentId);
	}

	@Override
	public List<TheraprojectDO> list(Map<String, Object> map){
		return theraprojectDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return theraprojectDao.count(map);
	}
	
	@Override
	public int save(TheraprojectDO theraproject){
		return theraprojectDao.save(theraproject);
	}
	
	@Override
	public int update(TheraprojectDO theraproject){
		return theraprojectDao.update(theraproject);
	}
	
	@Override
	public int remove(Integer id){
		return theraprojectDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return theraprojectDao.batchRemove(ids);
	}

	@Override
	public Tree<TheraprojectDO> getTree() {
		List<Tree<TheraprojectDO>> trees = new ArrayList<Tree<TheraprojectDO>>();
		List<TheraprojectDO> theraprojectDOS = theraprojectDao.list(new HashMap<String, Object>(16));
		for (TheraprojectDO theraprojectDO : theraprojectDOS){
			Tree<TheraprojectDO> tree = new Tree<TheraprojectDO>();
			tree.setId(theraprojectDO.getNametpUnit());
			tree.setParentId(theraprojectDO.getParentId());
			tree.setText(theraprojectDO.getNametp());

			Map<String, Object> state = new HashMap<>(16);
			state.put("opened", true);
			tree.setState(state);
			trees.add(tree);
		}
		// 默认顶级菜单为０
		Tree<TheraprojectDO> t = BuildTree.build(trees);
		return t;
	}

	@Override
	public boolean checkTherapyHasName(String nametpUnit) {
		//查询治法以及此治法的下级治法
		int result = theraprojectDao.getSmallTherapyNumber(nametpUnit);
		return result == 0 ? true : false;
	}

	@Override
	public List<String> listChildrenIds(String parentId) {
		List<TheraprojectDO> theraprojectDOS = list(null);
		return treeMenuList(theraprojectDOS, parentId);
	}

	List<String> treeMenuList(List<TheraprojectDO> menuList, String pid) {
		List<String> childIds = new ArrayList<>();
		for (TheraprojectDO mu : menuList){
			//遍历出父pid等于参数的unit，add进子节点集合
			if (mu.getParentId() == pid){
				//递归遍历下一级
				treeMenuList(menuList, mu.getNametpUnit());
				childIds.add(mu.getNametpUnit());
			}
		}

		return childIds;
	}

}
