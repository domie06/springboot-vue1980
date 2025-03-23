package com.yjkj.framework.rbac.ptype.web;




import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.ptype.model.Ptype;
import com.yjkj.framework.rbac.ptype.service.impl.PtypeServiceImpl;
import com.yjkj.framework.rbac.ptype.service.inte.PtypeService;

@Controller
@RequestMapping("/ptype")
public class PtypeController {
	
	@Autowired
	private PtypeService ptypeService = new PtypeServiceImpl();
	

	@RequestMapping("/informationLoad")
	public String informationLoad(Pager pager,Model model,Ptype Ptype,HttpSession session) {
		try {
		pager = this.ptypeService.informationLoad(pager,Ptype,session);
		model.addAttribute("ptypeList", pager);
		model.addAttribute("ptype", Ptype);
		return "jsp/PtypeTable";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/Failed";
		}
	}
	
	@RequestMapping("/informationLoadOne")
	public String informationLoadOne(Ptype Ptype,Model model) {
		
		try {
			Ptype = this.ptypeService.informationLoadOne(Ptype);
			model.addAttribute("ptype", Ptype);
			return "jsp/Ptype";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationAdd")
	public String informationAdd(Ptype Ptype,Model model) {
		
		try {
			
			this.ptypeService.informationAdd(Ptype);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationDelete")
	public String informationDelete(Ptype Ptype,Model model) {
		
		try {
			this.ptypeService.informationDelete(Ptype);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationUpdate")
	public String informationUpdate(Ptype Ptype,Model model) {
		
		try {
			this.ptypeService.informationUpade(Ptype);
			return "jsp/Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
}
