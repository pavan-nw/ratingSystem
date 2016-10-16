package com.RatingSystem.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.RatingSystem.Service.UserService;
import com.RatingSystem.dao.UserDao;
import com.RatingSystem.model.User;
import com.RatingSystem.modelVO.LoginUser;
@Transactional
@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
       userDao.addUser(user);
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
	User user =this.getUser(userId);	
      userDao.deleteUser(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
       userDao.updateUser(user);
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return userDao.getUser(id);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDao.getAllUsers();
	}

	@Override
	public boolean verifyAuthorizedUser(LoginUser loginUser) {
      
		User user = new User();
	    user.setUserName(loginUser.getEmailaddress());
	    user.setPassword(loginUser.getPassword());
		List<User> users = userDao.verifyUserCredentials(user);
        boolean verified = false;
        if(!users.isEmpty())
        {
        	verified=true;
        }
		return verified;
	}

	@Override
	public User getUserByName(String userName) {
		
		User user = userDao.getUserByName(userName);
		return user;
	}

	
}
