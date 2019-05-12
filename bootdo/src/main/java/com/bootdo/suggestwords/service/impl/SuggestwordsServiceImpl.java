package com.bootdo.suggestwords.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.suggestwords.dao.SuggestwordsDao;
import com.bootdo.suggestwords.domain.SuggestwordsDO;
import com.bootdo.suggestwords.service.SuggestwordsService;



@Service
public class SuggestwordsServiceImpl implements SuggestwordsService {
	@Autowired
	private SuggestwordsDao suggestwordsDao;
	
	@Override
	public SuggestwordsDO get(Integer id){
		return suggestwordsDao.get(id);
	}
	
	@Override
	public List<SuggestwordsDO> list(Map<String, Object> map){
		return suggestwordsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return suggestwordsDao.count(map);
	}
	
	@Override
	public int save(SuggestwordsDO suggestwords){
		return suggestwordsDao.save(suggestwords);
	}
	
	@Override
	public int update(SuggestwordsDO suggestwords){
		return suggestwordsDao.update(suggestwords);
	}
	
	@Override
	public int remove(Integer id){
		return suggestwordsDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return suggestwordsDao.batchRemove(ids);
	}
	
}
