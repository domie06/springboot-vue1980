package com.yjkj.framework.rbac.ctype.dao;

import java.util.List;
import java.util.Map;

import com.yjkj.framework.rbac.ctype.model.Ctype;

public interface CtypeDao {

	public List<Ctype> informationLoad(Map<String,Object> map) throws Exception;
	
	public List<Ctype> informationLoadAll(Ctype Ctype) throws Exception;
	
	public Integer count(Ctype Ctype) throws Exception;
	
	public Ctype informationLoadOne(Ctype Ctype) throws Exception;
	
	public void informationDelete(Ctype Ctype) throws Exception;
	
	public void informationAdd(Ctype Ctype) throws Exception;
	
	public void informationUpdate(Ctype Ctype) throws Exception;
	
}
