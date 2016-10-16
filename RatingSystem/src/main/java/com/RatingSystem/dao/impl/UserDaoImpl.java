package com.RatingSystem.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.RatingSystem.dao.UserDao;
import com.RatingSystem.model.Rating;
import com.RatingSystem.model.User;

@Repository("UserDao")
public class UserDaoImpl extends AdbstractDao implements UserDao {
  	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
         this.save(user);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
         this.delete(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		this.update(user);
	}

	@Override
	public User getUser(int userId) {
		
		Session session = this.getSession();
		Query query = session.getNamedQuery("user.ById");
		List<User> users = query.list();
		return users.get(0); 
	
	}

	@Override
	public List<User> getAllUsers() {
		Session session = this.getSession();
		Query query = session.getNamedQuery("user.Allusers");
		List<User> users = query.list();
		return users;
	}

	@Override
	public List<Rating> getAllRatingsForUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> verifyUserCredentials(User user) {
	     
		Session session = this.getSession();
		Query query = session.createQuery("FROM User where userName =:userName and password =:password ");
		query.setParameter("userName", user.getUserName());
		query.setParameter("password", user.getPassword());
		List<User> users = query.list();	
		return users;
	}

	@Override
	public User getUserByName(String name) {
		Session session = this.getSession();
		Query query = session.createQuery("FROM User where userName=:userName");
		query.setParameter("userName", name);
		List<User> users = query.list();
		return users.get(0);
	}

}
