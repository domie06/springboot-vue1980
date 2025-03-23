package com.yjkj.framework.rbac.pay.service.inte;


import java.util.List;

import javax.servlet.http.HttpSession;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.pay.model.Pay;

public interface PayService {

	public Pager informationLoad(Pager pager,Pay Pay,HttpSession session) throws Exception;
	
	public List<Pay> informationLoadAll(Pay Pay) throws Exception;
	
	public Integer count(Pay Pay) throws Exception;
	
	public Pay informationLoadOne(Pay Pay) throws Exception;
	
	public void informationDelete(Pay Pay) throws Exception;
	
	public void informationAdd(Pay Pay) throws Exception;
	
	public void informationUpade(Pay Pay) throws Exception;
	
}
