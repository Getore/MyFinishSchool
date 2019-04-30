package com.bootdo.treatment.dao;

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
	
	List<TreatprojectDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TreatprojectDO treatproject);
	
	int update(TreatprojectDO treatproject);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
