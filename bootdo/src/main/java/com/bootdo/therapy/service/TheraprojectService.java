package com.bootdo.therapy.service;

import com.bootdo.common.domain.Tree;
import com.bootdo.therapy.domain.TheraprojectDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-05-04 22:46:36
 */
public interface TheraprojectService {
	
	TheraprojectDO get(Integer id);

	TheraprojectDO getPId(String parentId);		// treeTable - add（controller）
	
	List<TheraprojectDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TheraprojectDO theraproject);
	
	int update(TheraprojectDO theraproject);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);

	Tree<TheraprojectDO> getTree();	// treeTable

	boolean checkTherapyHasName(String nametpUnit);

	List<String> listChildrenIds(String parentId);
}
