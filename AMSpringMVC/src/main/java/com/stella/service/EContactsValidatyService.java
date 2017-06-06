package com.stella.service;

import java.util.List;
import java.util.Map;


public interface EContactsValidatyService {
		
	public Map<String, Object> getEContactValidatyByMail(String mailAddress);

	public boolean postponeValidaty(String custId, String date);

	public List<String> getAllClasses();
	
	public List<Object[]> getClassEcontactsAndValidaty(String className);
}

