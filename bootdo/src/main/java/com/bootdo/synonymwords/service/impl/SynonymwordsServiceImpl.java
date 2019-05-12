package com.bootdo.synonymwords.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.synonymwords.dao.SynonymwordsDao;
import com.bootdo.synonymwords.domain.SynonymwordsDO;
import com.bootdo.synonymwords.service.SynonymwordsService;



@Service
public class SynonymwordsServiceImpl implements SynonymwordsService {
	@Autowired
	private SynonymwordsDao synonymwordsDao;
	
	@Override
	public SynonymwordsDO get(Integer id){
		return synonymwordsDao.get(id);
	}
	
	@Override
	public List<SynonymwordsDO> list(Map<String, Object> map){
		return synonymwordsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return synonymwordsDao.count(map);
	}
	
	@Override
	public int save(SynonymwordsDO synonymwords){
		return synonymwordsDao.save(synonymwords);
	}
	
	@Override
	public int update(SynonymwordsDO synonymwords){
		return synonymwordsDao.update(synonymwords);
	}
	
	@Override
	public int remove(Integer id){
		return synonymwordsDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return synonymwordsDao.batchRemove(ids);
	}
	
}
