package com.bootdo.therapy.service.impl;

import com.bootdo.therapy.domain.TherapyDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.therapy.dao.TheracontentDao;
import com.bootdo.therapy.domain.TheracontentDO;
import com.bootdo.therapy.service.TheracontentService;



@Service
public class TheracontentServiceImpl implements TheracontentService {
	@Autowired
	private TheracontentDao theracontentDao;
	
	@Override
	public TheracontentDO get(Integer id){
		return theracontentDao.get(id);
	}
	
	@Override
	public List<TheracontentDO> list(Map<String, Object> map){
		return theracontentDao.list(map);
	}

	@Override
	public List<TherapyDO> therapyList(Map<String, Object> map) {
		return theracontentDao.therapyList(map);
	}

	@Override
	public int count(Map<String, Object> map){
		return theracontentDao.count(map);
	}

	@Override
	public int therapyCount(Map<String, Object> map) {
		return theracontentDao.therapyCount(map);
	}

	@Override
	public int save(TheracontentDO theracontent){
		return theracontentDao.save(theracontent);
	}
	
	@Override
	public int update(TheracontentDO theracontent){
		return theracontentDao.update(theracontent);
	}
	
	@Override
	public int remove(Integer id){
		return theracontentDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return theracontentDao.batchRemove(ids);
	}
	
}
