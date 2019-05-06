package com.bootdo.treatment.dao;

import com.bootdo.therapy.domain.TheraprojectDO;
import com.bootdo.treatment.domain.TreatprojectDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-04-30 11:29:39
 */
@Mapper
public interface TreatprojectDao {

	TreatprojectDO get(Integer id);

	TreatprojectDO getPId(String pId);	// treeTable
	
	List<TreatprojectDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TreatprojectDO treatproject);
	
	int update(TreatprojectDO treatproject);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);

	String[] listParentTreatment();	// 列出治法的父节点

	int getSmallTreatmentNumber(String titleUnit);	// 计算治法的子节点的个数

}
