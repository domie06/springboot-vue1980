package com.yjkj.framework.rbac.ctype.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.yjkj.framework.base.basemodel.BaseService;
import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.base.regular.Regular;
import com.yjkj.framework.base.regular.date.CreatDate;
import com.yjkj.framework.rbac.ctype.model.Ctype;
import com.yjkj.framework.rbac.ctype.service.inte.CtypeService;
@Service
public class CtypeServiceImpl extends BaseService implements CtypeService {

	
	@Override
	public Pager informationLoad(Pager pager,Ctype Ctype,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("ctype", Ctype);
		List<Ctype> list = this.ctypeDao.informationLoad(map);
		pager.setDatas(list);
		pager.setTotalCount(this.count(Ctype));
		return pager;
	}

	@Override
	public List<Ctype> informationLoadAll(Ctype Ctype) throws Exception {
		List<Ctype> list = this.ctypeDao.informationLoadAll(Ctype);
		return list;
	}
	

	@Override
	public Integer count(Ctype Ctype) throws Exception {
		Integer count = this.ctypeDao.count(Ctype);
		return count;
	}

	@Override
	public Ctype informationLoadOne(Ctype Ctype) throws Exception {
			Ctype = this.ctypeDao.informationLoadOne(Ctype);
		return Ctype;
	}

	@Override
	public void informationDelete(Ctype Ctype) throws Exception {
			this.ctypeDao.informationDelete(Ctype);

	}

	@Override
	public void informationAdd(Ctype Ctype) throws Exception {
			Ctype.setId(Regular.createId());
			Ctype.setCreatetime(CreatDate.getDate());
			this.ctypeDao.informationAdd(Ctype);

	}

	@Override
	public void informationUpade(Ctype Ctype) throws Exception {
			this.ctypeDao.informationUpdate(Ctype);
	}

}
