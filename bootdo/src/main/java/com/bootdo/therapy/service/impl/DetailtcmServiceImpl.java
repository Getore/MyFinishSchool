package com.bootdo.therapy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.therapy.dao.DetailtcmDao;
import com.bootdo.therapy.domain.DetailtcmDO;
import com.bootdo.therapy.service.DetailtcmService;



@Service
public class DetailtcmServiceImpl implements DetailtcmService {
	@Autowired
	private DetailtcmDao detailtcmDao;
	
	@Override
	public DetailtcmDO get(Integer id){
		return detailtcmDao.get(id);
	}
	
	@Override
	public List<DetailtcmDO> list(Map<String, Object> map){
		return detailtcmDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return detailtcmDao.count(map);
	}
	
	@Override
	public int save(DetailtcmDO detailtcm){
		return detailtcmDao.save(detailtcm);
	}
	
	@Override
	public int update(DetailtcmDO detailtcm){
		return detailtcmDao.update(detailtcm);
	}
	
	@Override
	public int remove(Integer id){
		return detailtcmDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return detailtcmDao.batchRemove(ids);
	}
	
}
