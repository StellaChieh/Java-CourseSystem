package com.stella.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.stella.model.EContacts;

public interface Dao {

	public EContacts getEContactByMail(String mailAddress);
	
	public Date getEContactValidatyByMail(String mailAddress);
	
	public boolean postponeValidaty(String custId, String date);
	
	public List<String> getAllClasses();
	
	public List<Object[]> getClassEcontactsAndValidaty(String className);
}
