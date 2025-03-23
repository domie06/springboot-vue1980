package com.yjkj.framework.rbac.station.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.yjkj.framework.base.basemodel.BaseService;
import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.base.regular.Regular;
import com.yjkj.framework.base.regular.date.CreatDate;
import com.yjkj.framework.rbac.station.model.Station;
import com.yjkj.framework.rbac.station.service.inte.StationService;
@Service
public class StationServiceImpl extends BaseService implements StationService {

	
	@Override
	public Pager informationLoad(Pager pager,Station Station,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("station", Station);
		List<Station> list = this.stationDao.informationLoad(map);
		pager.setDatas(list);
		pager.setTotalCount(this.count(Station));
		return pager;
	}

	@Override
	public List<Station> informationLoadAll(Station Station) throws Exception {
		List<Station> list = this.stationDao.informationLoadAll(Station);
		return list;
	}
	

	@Override
	public Integer count(Station Station) throws Exception {
		Integer count = this.stationDao.count(Station);
		return count;
	}

	@Override
	public Station informationLoadOne(Station Station) throws Exception {
			Station = this.stationDao.informationLoadOne(Station);
		return Station;
	}

	@Override
	public void informationDelete(Station Station) throws Exception {
			this.stationDao.informationDelete(Station);

	}

	@Override
	public void informationAdd(Station Station) throws Exception {
			Station.setId(Regular.createId());
			Station.setCreatetime(CreatDate.getDate());
			this.stationDao.informationAdd(Station);

	}

	@Override
	public void informationUpade(Station Station) throws Exception {
			this.stationDao.informationUpdate(Station);
	}

}
