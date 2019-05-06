package com.bootdo.treatment.service.impl;

import com.bootdo.common.domain.Tree;
import com.bootdo.common.utils.BuildTree;
import com.bootdo.therapy.domain.TheraprojectDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bootdo.treatment.dao.TreatprojectDao;
import com.bootdo.treatment.domain.TreatprojectDO;
import com.bootdo.treatment.service.TreatprojectService;



@Service
public class TreatprojectServiceImpl implements TreatprojectService {
	@Autowired
	private TreatprojectDao treatprojectDao;
	
	@Override
	public TreatprojectDO get(Integer id){
		return treatprojectDao.get(id);
	}

	@Override
	public TreatprojectDO getPId(String parentId) {
		return treatprojectDao.getPId(parentId);
	}

	@Override
	public List<TreatprojectDO> list(Map<String, Object> map){
		return treatprojectDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return treatprojectDao.count(map);
	}
	
	@Override
	public int save(TreatprojectDO treatproject){
		return treatprojectDao.save(treatproject);
	}
	
	@Override
	public int update(TreatprojectDO treatproject){
		return treatprojectDao.update(treatproject);
	}
	
	@Override
	public int remove(Integer id){
		return treatprojectDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return treatprojectDao.batchRemove(ids);
	}

	@Override
	public Tree<TreatprojectDO> getTree() {
		List<Tree<TreatprojectDO>> trees = new ArrayList<Tree<TreatprojectDO>>();
		List<TreatprojectDO> theraprojectDOS = treatprojectDao.list(new HashMap<String, Object>(16));
		for (TreatprojectDO treatprojectDO : theraprojectDOS){
			Tree<TreatprojectDO> tree = new Tree<TreatprojectDO>();
			tree.setId(treatprojectDO.getTitleUnit());
			tree.setParentId(treatprojectDO.getParentId());
			tree.setText(treatprojectDO.getTitle());

			Map<String, Object> state = new HashMap<>(16);
			state.put("opened", true);
			tree.setState(state);
			trees.add(tree);
		}
		// 默认顶级菜单为０
		Tree<TreatprojectDO> t = BuildTree.build(trees);
		return t;
	}

	@Override
	public boolean checkTreatmentHasName(String titleUnit) {
		//查询治法以及此治法的下级治法
		int result = treatprojectDao.getSmallTreatmentNumber(titleUnit);
		return result == 0 ? true : false;
	}

	@Override
	public List<String> listChildrenIds(String parentId) {
		List<TreatprojectDO> treatprojectDOS = list(null);
		return treeMenuList(treatprojectDOS, parentId);
	}

	List<String> treeMenuList(List<TreatprojectDO> menuList, String pid) {
		List<String> childIds = new ArrayList<>();
		for (TreatprojectDO mu : menuList){
			//遍历出父pid等于参数的unit，add进子节点集合
			if (mu.getParentId() == pid){
				//递归遍历下一级
				treeMenuList(menuList, mu.getTitleUnit());
				childIds.add(mu.getTitleUnit());
			}
		}

		return childIds;
	}
}
