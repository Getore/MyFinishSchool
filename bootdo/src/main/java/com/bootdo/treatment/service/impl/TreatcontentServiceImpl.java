package com.bootdo.treatment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.treatment.dao.TreatcontentDao;
import com.bootdo.treatment.domain.TreatcontentDO;
import com.bootdo.treatment.service.TreatcontentService;



@Service
public class TreatcontentServiceImpl implements TreatcontentService {
	@Autowired
	private TreatcontentDao treatcontentDao;
	
	@Override
	public TreatcontentDO get(Integer id){
		return treatcontentDao.get(id);
	}
	
	@Override
	public List<TreatcontentDO> list(Map<String, Object> map){
		return treatcontentDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return treatcontentDao.count(map);
	}
	
	@Override
	public int save(TreatcontentDO treatcontent){
		return treatcontentDao.save(treatcontent);
	}
	
	@Override
	public int update(TreatcontentDO treatcontent){
		return treatcontentDao.update(treatcontent);
	}
	
	@Override
	public int remove(Integer id){
		return treatcontentDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return treatcontentDao.batchRemove(ids);
	}
	
}
