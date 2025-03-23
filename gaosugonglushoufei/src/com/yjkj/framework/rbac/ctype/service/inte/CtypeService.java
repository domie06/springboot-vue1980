package com.yjkj.framework.rbac.ctype.service.inte;


import java.util.List;

import javax.servlet.http.HttpSession;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.ctype.model.Ctype;

public interface CtypeService {

	public Pager informationLoad(Pager pager,Ctype Ctype,HttpSession session) throws Exception;
	
	public List<Ctype> informationLoadAll(Ctype Ctype) throws Exception;
	
	public Integer count(Ctype Ctype) throws Exception;
	
	public Ctype informationLoadOne(Ctype Ctype) throws Exception;
	
	public void informationDelete(Ctype Ctype) throws Exception;
	
	public void informationAdd(Ctype Ctype) throws Exception;
	
	public void informationUpade(Ctype Ctype) throws Exception;
	
}
