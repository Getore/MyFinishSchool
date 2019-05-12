package com.bootdo.stopwords.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.stopwords.dao.StopwordsDao;
import com.bootdo.stopwords.domain.StopwordsDO;
import com.bootdo.stopwords.service.StopwordsService;



@Service
public class StopwordsServiceImpl implements StopwordsService {
	@Autowired
	private StopwordsDao stopwordsDao;
	
	@Override
	public StopwordsDO get(Integer id){
		return stopwordsDao.get(id);
	}
	
	@Override
	public List<StopwordsDO> list(Map<String, Object> map){
		return stopwordsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return stopwordsDao.count(map);
	}
	
	@Override
	public int save(StopwordsDO stopwords){
		return stopwordsDao.save(stopwords);
	}
	
	@Override
	public int update(StopwordsDO stopwords){
		return stopwordsDao.update(stopwords);
	}
	
	@Override
	public int remove(Integer id){
		return stopwordsDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return stopwordsDao.batchRemove(ids);
	}
	
}
