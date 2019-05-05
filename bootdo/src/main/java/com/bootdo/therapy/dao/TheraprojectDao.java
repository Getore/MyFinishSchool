package com.bootdo.therapy.dao;

import com.bootdo.therapy.domain.TheraprojectDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-05-04 22:46:36
 */
@Mapper
public interface TheraprojectDao {

	TheraprojectDO get(Integer id);

	TheraprojectDO getPId(String pId);	// treeTable
	
	List<TheraprojectDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TheraprojectDO theraproject);
	
	int update(TheraprojectDO theraproject);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);

	String[] listParentTherapy();	// 列出治法的父节点

	int getSmallTherapyNumber(String nametpUnit);	// 计算治法的子节点的个数
}
