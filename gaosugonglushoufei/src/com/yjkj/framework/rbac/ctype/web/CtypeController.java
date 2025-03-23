package com.yjkj.framework.rbac.ctype.web;




import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.ctype.model.Ctype;
import com.yjkj.framework.rbac.ctype.service.impl.CtypeServiceImpl;
import com.yjkj.framework.rbac.ctype.service.inte.CtypeService;

@Controller
@RequestMapping("/ctype")
public class CtypeController {
	
	@Autowired
	private CtypeService ctypeService = new CtypeServiceImpl();
	

	@RequestMapping("/informationLoad")
	public String informationLoad(Pager pager,Model model,Ctype Ctype,HttpSession session) {
		try {
		pager = this.ctypeService.informationLoad(pager,Ctype,session);
		model.addAttribute("ctypeList", pager);
		model.addAttribute("ctype", Ctype);
		return "jsp/CtypeTable";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/Failed";
		}
	}
	
	@RequestMapping("/informationLoadOne")
	public String informationLoadOne(Ctype Ctype,Model model) {
		
		try {
			Ctype = this.ctypeService.informationLoadOne(Ctype);
			model.addAttribute("ctype", Ctype);
			return "jsp/Ctype";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationAdd")
	public String informationAdd(Ctype Ctype,Model model) {
		
		try {
			
			this.ctypeService.informationAdd(Ctype);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationDelete")
	public String informationDelete(Ctype Ctype,Model model) {
		
		try {
			this.ctypeService.informationDelete(Ctype);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationUpdate")
	public String informationUpdate(Ctype Ctype,Model model) {
		
		try {
			this.ctypeService.informationUpade(Ctype);
			return "jsp/Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
}
