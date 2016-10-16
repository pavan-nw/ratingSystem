package com.RatingSystem.dao;

import java.util.List;

import com.RatingSystem.model.Rating;

public interface RatingDao {

	public void addRating(Rating rating);
	
	public void deleteRating(Rating rating);
	
	public void updateRating(Rating rating);
	
	public List<Rating> getAllRatings();
	
	public List<Rating> getAllRatingsForRequirement(int requirement);
	
	public List<Rating> getAllRatingsByUserName(String username);

	List<Rating> getAllRatingsByUserNameAndRequirementId(String username, int RequirementId);
	
}
