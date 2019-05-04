package com.bootdo.therapy.dao;

import com.bootdo.therapy.domain.DetailtcmDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-05-04 22:46:36
 */
@Mapper
public interface DetailtcmDao {

	DetailtcmDO get(Integer id);
	
	List<DetailtcmDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DetailtcmDO detailtcm);
	
	int update(DetailtcmDO detailtcm);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
