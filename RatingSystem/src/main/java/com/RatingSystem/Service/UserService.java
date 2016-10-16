package com.RatingSystem.Service;

import java.util.List;

import com.RatingSystem.model.User;
import com.RatingSystem.modelVO.LoginUser;

public interface UserService {

	public void addUser(User user);
	
	public void deleteUser(int userId);
	
	public void updateUser(User user);
	
	public User getUser(int id);
	
	public User getUserByName(String userName);
	
	public List<User> getAllUsers();
	
	public boolean verifyAuthorizedUser(LoginUser user);
	
}
