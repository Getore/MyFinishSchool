package com.bootdo.suggestwords.service;

import com.bootdo.suggestwords.domain.SuggestwordsDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-05-12 12:34:33
 */
public interface SuggestwordsService {
	
	SuggestwordsDO get(Integer id);
	
	List<SuggestwordsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SuggestwordsDO suggestwords);
	
	int update(SuggestwordsDO suggestwords);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
