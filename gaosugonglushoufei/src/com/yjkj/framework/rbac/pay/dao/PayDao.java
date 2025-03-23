package com.yjkj.framework.rbac.pay.dao;

import java.util.List;
import java.util.Map;

import com.yjkj.framework.rbac.pay.model.Pay;

public interface PayDao {

	public List<Pay> informationLoad(Map<String,Object> map) throws Exception;
	
	public List<Pay> informationLoadAll(Pay Pay) throws Exception;
	
	public Integer count(Pay Pay) throws Exception;
	
	public Pay informationLoadOne(Pay Pay) throws Exception;
	
	public void informationDelete(Pay Pay) throws Exception;
	
	public void informationAdd(Pay Pay) throws Exception;
	
	public void informationUpdate(Pay Pay) throws Exception;
	
}
