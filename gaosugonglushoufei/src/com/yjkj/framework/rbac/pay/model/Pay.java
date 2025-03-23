package com.yjkj.framework.rbac.pay.model;

import java.math.BigDecimal;

import com.yjkj.framework.base.basemodel.BaseModel;
import com.yjkj.framework.rbac.ctype.model.Ctype;
import com.yjkj.framework.rbac.ptype.model.Ptype;
import com.yjkj.framework.rbac.station.model.Station;


public class Pay extends BaseModel{
	
	private String ctype_id;
	private String ptype_id;
	private String station_id;
	private String code;
	private BigDecimal price;
	private String content;
	private Ctype ctype;
	private Ptype ptype;
	private Station station;
	public String getCtype_id() {
		return ctype_id;
	}
	public void setCtype_id(String ctype_id) {
		this.ctype_id = ctype_id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPtype_id() {
		return ptype_id;
	}
	public void setPtype_id(String ptype_id) {
		this.ptype_id = ptype_id;
	}
	public Ctype getCtype() {
		return ctype;
	}
	public void setCtype(Ctype ctype) {
		this.ctype = ctype;
	}
	public Ptype getPtype() {
		return ptype;
	}
	public void setPtype(Ptype ptype) {
		this.ptype = ptype;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getStation_id() {
		return station_id;
	}
	public void setStation_id(String station_id) {
		this.station_id = station_id;
	}
	public Station getStation() {
		return station;
	}
	public void setStation(Station station) {
		this.station = station;
	}
	
	
}
