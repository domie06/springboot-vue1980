package com.yjkj.framework.rbac.ptype.service.inte;


import java.util.List;

import javax.servlet.http.HttpSession;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.ptype.model.Ptype;

public interface PtypeService {

	public Pager informationLoad(Pager pager,Ptype Ptype,HttpSession session) throws Exception;
	
	public List<Ptype> informationLoadAll(Ptype Ptype) throws Exception;
	
	public Integer count(Ptype Ptype) throws Exception;
	
	public Ptype informationLoadOne(Ptype Ptype) throws Exception;
	
	public void informationDelete(Ptype Ptype) throws Exception;
	
	public void informationAdd(Ptype Ptype) throws Exception;
	
	public void informationUpade(Ptype Ptype) throws Exception;
	
}
