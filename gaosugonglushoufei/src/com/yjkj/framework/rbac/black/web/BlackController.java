package com.yjkj.framework.rbac.black.web;




import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.black.model.Black;
import com.yjkj.framework.rbac.black.service.impl.BlackServiceImpl;
import com.yjkj.framework.rbac.black.service.inte.BlackService;
import com.yjkj.framework.rbac.ctype.service.impl.CtypeServiceImpl;
import com.yjkj.framework.rbac.ctype.service.inte.CtypeService;
import com.yjkj.framework.rbac.station.service.impl.StationServiceImpl;
import com.yjkj.framework.rbac.station.service.inte.StationService;

@Controller
@RequestMapping("/black")
public class BlackController {
	
	@Autowired
	private BlackService blackService = new BlackServiceImpl();
	
	@Autowired
	private CtypeService ctypeService = new CtypeServiceImpl();
	
	@Autowired
	private StationService stationService = new StationServiceImpl();

	@RequestMapping("/informationLoad")
	public String informationLoad(Pager pager,Model model,Black Black,HttpSession session) {
		try {
		pager = this.blackService.informationLoad(pager,Black,session);
		model.addAttribute("blackList", pager);
		model.addAttribute("black", Black);
		return "jsp/BlackTable";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/Failed";
		}
	}
	
	@RequestMapping("/informationLoadOne")
	public String informationLoadOne(Black Black,Model model) {
		
		try {
			model.addAttribute("ctypeList", this.ctypeService.informationLoadAll(null));
			model.addAttribute("stationList", this.stationService.informationLoadAll(null));
			Black = this.blackService.informationLoadOne(Black);
			model.addAttribute("black", Black);
			return "jsp/Black";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationAdd")
	public String informationAdd(Black Black,Model model) {
		
		try {
			
			this.blackService.informationAdd(Black);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationDelete")
	public String informationDelete(Black Black,Model model) {
		
		try {
			this.blackService.informationDelete(Black);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationUpdate")
	public String informationUpdate(Black Black,Model model) {
		
		try {
			this.blackService.informationUpade(Black);
			return "jsp/Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
}
