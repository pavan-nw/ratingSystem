package com.RatingSystem.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class AdbstractDao {

	@Autowired
	private SessionFactory sessionFactory;

	
	public Session getSession()
	{
		return sessionFactory.getCurrentSession();	
	}
	
	public void save(Object object)
	{
//		getSession().saveOrUpdae(object);
		getSession().persist(object);
		
	}
	
	public void delete(Object object)
	{
		getSession().delete(object);
	}
	
	public void update(Object object)
	{
		getSession().update(object);
	}
	
}
