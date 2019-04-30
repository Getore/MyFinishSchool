package com.bootdo.treatment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.treatment.dao.TreatprojectDao;
import com.bootdo.treatment.domain.TreatprojectDO;
import com.bootdo.treatment.service.TreatprojectService;



@Service
public class TreatprojectServiceImpl implements TreatprojectService {
	@Autowired
	private TreatprojectDao treatprojectDao;
	
	@Override
	public TreatprojectDO get(Integer id){
		return treatprojectDao.get(id);
	}
	
	@Override
	public List<TreatprojectDO> list(Map<String, Object> map){
		return treatprojectDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return treatprojectDao.count(map);
	}
	
	@Override
	public int save(TreatprojectDO treatproject){
		return treatprojectDao.save(treatproject);
	}
	
	@Override
	public int update(TreatprojectDO treatproject){
		return treatprojectDao.update(treatproject);
	}
	
	@Override
	public int remove(Integer id){
		return treatprojectDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return treatprojectDao.batchRemove(ids);
	}
	
}
