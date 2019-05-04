package com.bootdo.therapy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.therapy.dao.TheraprojectDao;
import com.bootdo.therapy.domain.TheraprojectDO;
import com.bootdo.therapy.service.TheraprojectService;



@Service
public class TheraprojectServiceImpl implements TheraprojectService {
	@Autowired
	private TheraprojectDao theraprojectDao;
	
	@Override
	public TheraprojectDO get(Integer id){
		return theraprojectDao.get(id);
	}
	
	@Override
	public List<TheraprojectDO> list(Map<String, Object> map){
		return theraprojectDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return theraprojectDao.count(map);
	}
	
	@Override
	public int save(TheraprojectDO theraproject){
		return theraprojectDao.save(theraproject);
	}
	
	@Override
	public int update(TheraprojectDO theraproject){
		return theraprojectDao.update(theraproject);
	}
	
	@Override
	public int remove(Integer id){
		return theraprojectDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return theraprojectDao.batchRemove(ids);
	}
	
}
