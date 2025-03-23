package com.yjkj.framework.rbac.black.dao;

import java.util.List;
import java.util.Map;

import com.yjkj.framework.rbac.black.model.Black;

public interface BlackDao {

	public List<Black> informationLoad(Map<String,Object> map) throws Exception;
	
	public List<Black> informationLoadAll(Black Black) throws Exception;
	
	public Integer count(Black Black) throws Exception;
	
	public Black informationLoadOne(Black Black) throws Exception;
	
	public void informationDelete(Black Black) throws Exception;
	
	public void informationAdd(Black Black) throws Exception;
	
	public void informationUpdate(Black Black) throws Exception;
	
}
