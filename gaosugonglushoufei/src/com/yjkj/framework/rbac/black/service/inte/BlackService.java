package com.yjkj.framework.rbac.black.service.inte;


import java.util.List;

import javax.servlet.http.HttpSession;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.black.model.Black;

public interface BlackService {

	public Pager informationLoad(Pager pager,Black Black,HttpSession session) throws Exception;
	
	public List<Black> informationLoadAll(Black Black) throws Exception;
	
	public Integer count(Black Black) throws Exception;
	
	public Black informationLoadOne(Black Black) throws Exception;
	
	public void informationDelete(Black Black) throws Exception;
	
	public void informationAdd(Black Black) throws Exception;
	
	public void informationUpade(Black Black) throws Exception;
	
}
