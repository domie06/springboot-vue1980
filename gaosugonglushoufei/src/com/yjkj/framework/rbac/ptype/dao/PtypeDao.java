package com.yjkj.framework.rbac.ptype.dao;

import java.util.List;
import java.util.Map;

import com.yjkj.framework.rbac.ptype.model.Ptype;

public interface PtypeDao {

	public List<Ptype> informationLoad(Map<String,Object> map) throws Exception;
	
	public List<Ptype> informationLoadAll(Ptype Ptype) throws Exception;
	
	public Integer count(Ptype Ptype) throws Exception;
	
	public Ptype informationLoadOne(Ptype Ptype) throws Exception;
	
	public void informationDelete(Ptype Ptype) throws Exception;
	
	public void informationAdd(Ptype Ptype) throws Exception;
	
	public void informationUpdate(Ptype Ptype) throws Exception;
	
}
