package com.RatingSystem.Service;

import java.util.List;
import java.util.Map;

import com.RatingSystem.model.AverageRating;
import com.RatingSystem.model.Rating;

public interface RatingService {

	public void addRating(Rating rating);
	
	public void deleteRating(Rating rating);
	
	public void updateRating(Rating rating);
	
	public List<Rating> getAllRatings();
	
	public Map<String,Double> getAverageRatings();
	
	public List<Rating> getAllRatingsByUserName(String userName);

	public boolean verifyUserRatings(String loginUserName, int requirementId);
}
