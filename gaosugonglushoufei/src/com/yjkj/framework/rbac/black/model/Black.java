package com.yjkj.framework.rbac.black.model;

import java.math.BigDecimal;

import com.yjkj.framework.base.basemodel.BaseModel;
import com.yjkj.framework.rbac.ctype.model.Ctype;
import com.yjkj.framework.rbac.station.model.Station;


public class Black extends BaseModel{
	
	private String ctype_id;
	private String station_id;
	private String code;
	private String content;
	private BigDecimal price;
	private String black_date;
	private Ctype ctype;
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
	public String getBlack_date() {
		return black_date;
	}
	public void setBlack_date(String black_date) {
		this.black_date = black_date;
	}
	public Ctype getCtype() {
		return ctype;
	}
	public void setCtype(Ctype ctype) {
		this.ctype = ctype;
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
