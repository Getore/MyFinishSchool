package com.bootdo.stopwords.service;

import com.bootdo.stopwords.domain.StopwordsDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-05-12 12:29:42
 */
public interface StopwordsService {
	
	StopwordsDO get(Integer id);
	
	List<StopwordsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StopwordsDO stopwords);
	
	int update(StopwordsDO stopwords);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
