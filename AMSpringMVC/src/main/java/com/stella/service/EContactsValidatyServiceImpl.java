package com.stella.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stella.dao.Dao;
import com.stella.model.EContacts;

@Service
public class EContactsValidatyServiceImpl implements EContactsValidatyService {

	@Autowired
	private Dao dao;	
	
	@Transactional
	public Map<String, Object> getEContactValidatyByMail(String mailAddress){
		String dateReport = null;
		Map<String, Object> result = new HashMap<>();
		EContacts eContacts = dao.getEContactByMail(mailAddress);
		if (eContacts != null) {
			Date date = dao.getEContactValidatyByMail(mailAddress);
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");        
			dateReport = df.format(date);
			result.put("member", eContacts);
			result.put("date", dateReport);
		} else {
			result.put("msg", "會員不存在"); 
		}
		return result;
	}
	
	
	@Transactional
	public boolean postponeValidaty(String custId, String date){
		String fullDate = date + " 00:00:00";
		return dao.postponeValidaty(custId, fullDate);
	};
	
	@Transactional
	public List<String> getAllClasses(){
		return dao.getAllClasses();
	}
	
	
	@Transactional
	public List<Object[]> getClassEcontactsAndValidaty(String className){
		
		List<Object[]> members = (List<Object[]>)dao.getClassEcontactsAndValidaty(className);
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		for(Object[] member : members) {
			Date date = (Date)member[2];
			String dateReport = df.format(date);
			member[2] = dateReport;
		}
		System.out.println(members.getClass().getName());
		return members;
	}

}
