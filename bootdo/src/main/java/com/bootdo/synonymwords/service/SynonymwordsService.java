package com.bootdo.synonymwords.service;

import com.bootdo.synonymwords.domain.SynonymwordsDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-05-12 12:34:57
 */
public interface SynonymwordsService {
	
	SynonymwordsDO get(Integer id);
	
	List<SynonymwordsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SynonymwordsDO synonymwords);
	
	int update(SynonymwordsDO synonymwords);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
