package com.bootdo.therapy.service;

import com.bootdo.therapy.domain.TheracontentDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-05-04 22:46:36
 */
public interface TheracontentService {
	
	TheracontentDO get(Integer id);
	
	List<TheracontentDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TheracontentDO theracontent);
	
	int update(TheracontentDO theracontent);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
