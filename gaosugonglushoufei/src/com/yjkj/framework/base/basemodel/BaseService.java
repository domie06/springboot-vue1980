package com.yjkj.framework.base.basemodel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yjkj.framework.rbac.black.dao.BlackDao;
import com.yjkj.framework.rbac.ctype.dao.CtypeDao;
import com.yjkj.framework.rbac.notice.dao.NoticeDao;
import com.yjkj.framework.rbac.pay.dao.PayDao;
import com.yjkj.framework.rbac.ptype.dao.PtypeDao;
import com.yjkj.framework.rbac.station.dao.StationDao;
@Service
public class BaseService {
	
	
	
	
	
	@Autowired
	public NoticeDao noticeDao;
	
	@Autowired
	public CtypeDao ctypeDao;
	
	@Autowired
	public PtypeDao ptypeDao;
	
	@Autowired
	public StationDao stationDao;
	
	@Autowired
	public BlackDao blackDao;
	
	@Autowired
	public PayDao payDao;
	

}
