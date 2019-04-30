package com.bootdo.treatment.service;

import com.bootdo.treatment.domain.TreatcontentDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-04-30 11:29:39
 */
public interface TreatcontentService {
	
	TreatcontentDO get(Integer id);
	
	List<TreatcontentDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TreatcontentDO treatcontent);
	
	int update(TreatcontentDO treatcontent);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
