package com.yjkj.framework.rbac.pay.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.yjkj.framework.base.basemodel.BaseService;
import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.base.regular.Regular;
import com.yjkj.framework.base.regular.date.CreatDate;
import com.yjkj.framework.rbac.pay.model.Pay;
import com.yjkj.framework.rbac.pay.service.inte.PayService;
@Service
public class PayServiceImpl extends BaseService implements PayService {

	
	@Override
	public Pager informationLoad(Pager pager,Pay Pay,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("pay", Pay);
		List<Pay> list = this.payDao.informationLoad(map);
		pager.setDatas(list);
		pager.setTotalCount(this.count(Pay));
		return pager;
	}

	@Override
	public List<Pay> informationLoadAll(Pay Pay) throws Exception {
		List<Pay> list = this.payDao.informationLoadAll(Pay);
		return list;
	}
	

	@Override
	public Integer count(Pay Pay) throws Exception {
		Integer count = this.payDao.count(Pay);
		return count;
	}

	@Override
	public Pay informationLoadOne(Pay Pay) throws Exception {
			Pay = this.payDao.informationLoadOne(Pay);
		return Pay;
	}

	@Override
	public void informationDelete(Pay Pay) throws Exception {
			this.payDao.informationDelete(Pay);

	}

	@Override
	public void informationAdd(Pay Pay) throws Exception {
			Pay.setId(Regular.createId());
			Pay.setCreatetime(CreatDate.getDate());
			this.payDao.informationAdd(Pay);

	}

	@Override
	public void informationUpade(Pay Pay) throws Exception {
			this.payDao.informationUpdate(Pay);
	}

}
