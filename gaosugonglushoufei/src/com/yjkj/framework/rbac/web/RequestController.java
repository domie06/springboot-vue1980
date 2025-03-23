package com.yjkj.framework.rbac.web;



import java.io.IOException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yjkj.framework.rbac.ctype.service.impl.CtypeServiceImpl;
import com.yjkj.framework.rbac.ctype.service.inte.CtypeService;
import com.yjkj.framework.rbac.functionInfo.service.impl.FunctionServiceImpl;
import com.yjkj.framework.rbac.functionInfo.service.inte.FunctionService;
import com.yjkj.framework.rbac.notice.model.Notice;
import com.yjkj.framework.rbac.notice.service.impl.NoticeServiceImpl;
import com.yjkj.framework.rbac.notice.service.inte.NoticeService;
import com.yjkj.framework.rbac.ptype.service.impl.PtypeServiceImpl;
import com.yjkj.framework.rbac.ptype.service.inte.PtypeService;
import com.yjkj.framework.rbac.roleInfo.model.RoleInfo;
import com.yjkj.framework.rbac.roleInfo.service.impl.RoleInfoServiceImpl;
import com.yjkj.framework.rbac.roleInfo.service.inte.RoleInfoService;
import com.yjkj.framework.rbac.station.service.impl.StationServiceImpl;
import com.yjkj.framework.rbac.station.service.inte.StationService;



@Controller
@RequestMapping("/request")
public class RequestController {
	
	@Autowired
	private RoleInfoService ris = new RoleInfoServiceImpl();

	@Autowired
	private FunctionService fs = new FunctionServiceImpl();
	
	@Autowired
	private NoticeService noticeService = new NoticeServiceImpl();
	
	@Autowired
	private CtypeService ctypeService = new CtypeServiceImpl();
	
	@Autowired
	private PtypeService ptypeService = new PtypeServiceImpl();
	
	@Autowired
	private StationService stationService = new StationServiceImpl();
	
	@RequestMapping("/login")
	public String login() throws IOException {
		return "jsp/Login";
		
	}
	@RequestMapping("/index")
	public String main(Model model) {
		return "jsp/iframemain";
	}
	
	@RequestMapping("/passUpdate")
	public String passUpdate(String id,Model model) {
		model.addAttribute("id", id);
		return "jsp/PassUpdate";
	}
	@RequestMapping("/right")
	public String index(Model model) {
		try {
			Notice notice = new Notice();
			notice.setId("1");
				model.addAttribute("notice", this.noticeService.informationLoadOne(notice));
			} catch (Exception e) {
				e.printStackTrace();
			}
		return "jsp/index";
	}
	
	@RequestMapping("/top")
	public String top() {
		return "jsp/top";
	}
	
	@RequestMapping("/userAdd")
	public String userAdd(Model model){
		try{
		List<RoleInfo> list = this.ris.query();
		model.addAttribute("role", list);
		}catch (RuntimeException e) {
			model.addAttribute("message", e.getMessage());
		}
		return "jsp/UserAdd";
	}
	
	@RequestMapping("/functionAdd")
	public String functionAdd(){
		return "jsp/FunctionAdd";
	}
	@RequestMapping("/roleAdd")
	public String roleAdd(Model model){
		model.addAttribute("function", this.fs.query());
		return "jsp/RoleAdd";
	}
	@RequestMapping("/ctypeAdd")
	public String ctypeAdd(){
		return "jsp/CtypeAdd";
	}
	@RequestMapping("/ptypeAdd")
	public String ptypeAdd(){
		return "jsp/PtypeAdd";
	}
	@RequestMapping("/stationAdd")
	public String stationAdd(){
		return "jsp/StationAdd";
	}
	@RequestMapping("/blackAdd")
	public String blackAdd(Model model){
		try {
			model.addAttribute("ctypeList", this.ctypeService.informationLoadAll(null));
			model.addAttribute("stationList", this.stationService.informationLoadAll(null));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "jsp/BlackAdd";
	}
	@RequestMapping("/payAdd")
	public String payAdd(Model model){
		try {
			model.addAttribute("ptypeList", this.ptypeService.informationLoadAll(null));
			model.addAttribute("ctypeList", this.ctypeService.informationLoadAll(null));
			model.addAttribute("stationList", this.stationService.informationLoadAll(null));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "jsp/PayAdd";
	}
	
	
	
	
	
	
	
	
}
