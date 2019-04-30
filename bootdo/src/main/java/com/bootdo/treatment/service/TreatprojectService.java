package com.bootdo.treatment.service;

import com.bootdo.treatment.domain.TreatprojectDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-04-30 11:29:39
 */
public interface TreatprojectService {
	
	TreatprojectDO get(Integer id);
	
	List<TreatprojectDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TreatprojectDO treatproject);
	
	int update(TreatprojectDO treatproject);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
