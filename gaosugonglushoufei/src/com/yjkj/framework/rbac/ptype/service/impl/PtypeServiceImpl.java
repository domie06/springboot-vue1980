package com.yjkj.framework.rbac.ptype.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.yjkj.framework.base.basemodel.BaseService;
import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.base.regular.Regular;
import com.yjkj.framework.base.regular.date.CreatDate;
import com.yjkj.framework.rbac.ptype.model.Ptype;
import com.yjkj.framework.rbac.ptype.service.inte.PtypeService;
@Service
public class PtypeServiceImpl extends BaseService implements PtypeService {

	
	@Override
	public Pager informationLoad(Pager pager,Ptype Ptype,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("ptype", Ptype);
		List<Ptype> list = this.ptypeDao.informationLoad(map);
		pager.setDatas(list);
		pager.setTotalCount(this.count(Ptype));
		return pager;
	}

	@Override
	public List<Ptype> informationLoadAll(Ptype Ptype) throws Exception {
		List<Ptype> list = this.ptypeDao.informationLoadAll(Ptype);
		return list;
	}
	

	@Override
	public Integer count(Ptype Ptype) throws Exception {
		Integer count = this.ptypeDao.count(Ptype);
		return count;
	}

	@Override
	public Ptype informationLoadOne(Ptype Ptype) throws Exception {
			Ptype = this.ptypeDao.informationLoadOne(Ptype);
		return Ptype;
	}

	@Override
	public void informationDelete(Ptype Ptype) throws Exception {
			this.ptypeDao.informationDelete(Ptype);

	}

	@Override
	public void informationAdd(Ptype Ptype) throws Exception {
			Ptype.setId(Regular.createId());
			Ptype.setCreatetime(CreatDate.getDate());
			this.ptypeDao.informationAdd(Ptype);

	}

	@Override
	public void informationUpade(Ptype Ptype) throws Exception {
			this.ptypeDao.informationUpdate(Ptype);
	}

}
