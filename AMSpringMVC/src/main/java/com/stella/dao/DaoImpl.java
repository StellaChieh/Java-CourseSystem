package com.stella.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stella.model.EContacts;


@Repository
public class DaoImpl implements Dao {

	@Autowired
	private SessionFactory sessionFactory;
	
	Session session = null;

	
	@Override
	public EContacts getEContactByMail(String mailAddress) {
		session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from EContacts where contacterEmail = :contacterEmail");
		query.setParameter("contacterEmail", mailAddress);
		List<EContacts> result = (List<EContacts>)query.list();
		if(result.size() != 0) {
			return (EContacts)result.get(0);
		} 
		return null;
	}
	
	@Override
	public Date getEContactValidatyByMail(String mailAddress){
		session= sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("SELECT a.validaty FROM accountvalidaty as a INNER JOIN e_contacts as e on a.cust_id = e.cust_id where e.contacter_email = :contacter_email");
		query.setParameter("contacter_email", mailAddress);
		List<Date> dates = (List<Date>) query.list();
		if(dates.size() != 0) {
			return (Date)dates.get(0);
		} 
		return null;
	}

	
	@SuppressWarnings("deprecation")
	@Override
	public boolean postponeValidaty(String custId, String date){
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = null;
		try{
			d = format.parse(date);
		} catch (Exception e){
			e.printStackTrace();
		}
		
		session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("UPDATE Accountvalidaty SET validaty = :validaty WHERE custId = :custId");
		query.setParameter("validaty", d);
		query.setParameter("custId", custId);
		try{
			query.executeUpdate();
			return true;
		} catch (HibernateException e) {
			return false;
		}
		
	}
	
	@Override
	public List<String> getAllClasses(){
		session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("SELECT className FROM Classhistory group by className");
		List<String> list = (List<String>) query.list();
		return list;
	};
	
	@SuppressWarnings("deprecation")
	@Transactional
	@Override
	public List<Object[]> getClassEcontactsAndValidaty(String className){
		session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("SELECT a.cust_id, a.contacter_email, c.validaty from e_contacts as a "
				+ "inner join classhistory as b on a.cust_id = b.cust_id "
				+ "inner join accountvalidaty as c on a.cust_id = c.cust_id "
				+ "where b.class_name = :class_name");
		query.setParameter("class_name", className);
		return query.list();
	}
	
	
}