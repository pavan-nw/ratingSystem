package com.RatingSystem.dao;

import java.util.List;

import com.RatingSystem.model.Rating;
import com.RatingSystem.model.User;

public interface UserDao {

	public void addUser(User user);
	
	public void deleteUser(User user);
	
	public void updateUser(User user);
	
	public User getUser(int userId);

	public User getUserByName(String name);
	
	public List<User> getAllUsers();
	
	public List<Rating> getAllRatingsForUser(int userId);
	
	public List<User> verifyUserCredentials(User user);
}
