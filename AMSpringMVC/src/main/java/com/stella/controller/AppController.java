package com.stella.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stella.service.EContactsValidatyService;

@Controller
@RequestMapping("/validaty")
public class AppController {

	@Autowired
	private EContactsValidatyService eContactsValidatyService;
	
	@RequestMapping("/inspect")
	public String inspectValidatyController(@RequestParam("mailAddress") String mailAddress, Model theModel){
		Map<String, Object> result = eContactsValidatyService.getEContactValidatyByMail(mailAddress);
		theModel.addAttribute("result", result);	
		return "main";
	}
	
	@RequestMapping("/postpone")
	public String postponeValidatyController(@RequestParam("id") String custId, @RequestParam("postponeDate") String date, Model theModel) {
		boolean state = eContactsValidatyService.postponeValidaty(custId, date); 
		String stateMsg;
		if (state) {
			stateMsg = "延長成功!";
		} else {
			stateMsg = "延長失敗";
		}
		theModel.addAttribute("stateMsg", stateMsg);
		return "result";
	}
	
	@RequestMapping(value="/class", produces={"application/json;charset=UTF-8"})
	public @ResponseBody List<String> inspectClassController(Model model){
		return eContactsValidatyService.getAllClasses();
	}
	
	@RequestMapping(value="/classmembers", produces={"application/json;charset=UTF-8"})
	public @ResponseBody List<Map<String, Object>> showClassValidatyController(@RequestParam("class") String theClass){
		List<Object[]> members = eContactsValidatyService.getClassEcontactsAndValidaty(theClass); 
		List<Map<String, Object>> modifiedMembers = new ArrayList<>();
		for(Object[] member:members){
			Map<String, Object> membersMap = new HashMap<>();
			membersMap.put("id",(member[0]));
			membersMap.put("account",(String)member[1]);
			membersMap.put("validaty",(String)member[2]);
			modifiedMembers.add(membersMap);
			membersMap = null;
		}
		return modifiedMembers; 
	}
}
