package com.bootdo.synonymwords.dao;

import com.bootdo.synonymwords.domain.SynonymwordsDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-05-12 12:34:57
 */
@Mapper
public interface SynonymwordsDao {

	SynonymwordsDO get(Integer id);
	
	List<SynonymwordsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SynonymwordsDO synonymwords);
	
	int update(SynonymwordsDO synonymwords);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
