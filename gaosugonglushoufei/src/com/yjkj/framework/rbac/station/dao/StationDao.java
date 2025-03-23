package com.yjkj.framework.rbac.station.dao;

import java.util.List;
import java.util.Map;

import com.yjkj.framework.rbac.station.model.Station;

public interface StationDao {

	public List<Station> informationLoad(Map<String,Object> map) throws Exception;
	
	public List<Station> informationLoadAll(Station Station) throws Exception;
	
	public Integer count(Station Station) throws Exception;
	
	public Station informationLoadOne(Station Station) throws Exception;
	
	public void informationDelete(Station Station) throws Exception;
	
	public void informationAdd(Station Station) throws Exception;
	
	public void informationUpdate(Station Station) throws Exception;
	
}
