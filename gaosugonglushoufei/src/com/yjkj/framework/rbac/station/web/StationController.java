package com.yjkj.framework.rbac.station.web;




import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.station.model.Station;
import com.yjkj.framework.rbac.station.service.impl.StationServiceImpl;
import com.yjkj.framework.rbac.station.service.inte.StationService;

@Controller
@RequestMapping("/station")
public class StationController {
	
	@Autowired
	private StationService stationService = new StationServiceImpl();
	

	@RequestMapping("/informationLoad")
	public String informationLoad(Pager pager,Model model,Station Station,HttpSession session) {
		try {
		pager = this.stationService.informationLoad(pager,Station,session);
		model.addAttribute("stationList", pager);
		model.addAttribute("station", Station);
		return "jsp/StationTable";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/Failed";
		}
	}
	
	@RequestMapping("/informationLoadOne")
	public String informationLoadOne(Station Station,Model model) {
		
		try {
			Station = this.stationService.informationLoadOne(Station);
			model.addAttribute("station", Station);
			return "jsp/Station";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationAdd")
	public String informationAdd(Station Station,Model model) {
		
		try {
			
			this.stationService.informationAdd(Station);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationDelete")
	public String informationDelete(Station Station,Model model) {
		
		try {
			this.stationService.informationDelete(Station);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationUpdate")
	public String informationUpdate(Station Station,Model model) {
		
		try {
			this.stationService.informationUpade(Station);
			return "jsp/Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
}
