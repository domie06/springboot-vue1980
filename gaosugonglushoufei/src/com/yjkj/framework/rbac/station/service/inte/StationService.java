package com.yjkj.framework.rbac.station.service.inte;


import java.util.List;

import javax.servlet.http.HttpSession;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.station.model.Station;

public interface StationService {

	public Pager informationLoad(Pager pager,Station Station,HttpSession session) throws Exception;
	
	public List<Station> informationLoadAll(Station Station) throws Exception;
	
	public Integer count(Station Station) throws Exception;
	
	public Station informationLoadOne(Station Station) throws Exception;
	
	public void informationDelete(Station Station) throws Exception;
	
	public void informationAdd(Station Station) throws Exception;
	
	public void informationUpade(Station Station) throws Exception;
	
}
