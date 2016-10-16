package com.RatingSystem.Service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.RatingSystem.Service.RatingService;
import com.RatingSystem.dao.RatingDao;
import com.RatingSystem.dao.RequirementDao;
import com.RatingSystem.dao.UserDao;
import com.RatingSystem.model.AverageRating;
import com.RatingSystem.model.Rating;
import com.RatingSystem.model.Requirement;
@Transactional
@Service("RatingService")
public class RatingServiceImpl implements RatingService {

	@Autowired
	RatingDao ratingDao;
	
	@Autowired
	RequirementDao requirementDao;
	
	@Override
	public void addRating(Rating rating) {
		// TODO Auto-generated method stub
		ratingDao.addRating(rating);
		
	}

	@Override
	public void deleteRating(Rating rating) {
		// TODO Auto-generated method stub
		ratingDao.deleteRating(rating);
	}

	@Override
	public void updateRating(Rating rating) {
		// TODO Auto-generated method stub
		ratingDao.updateRating(rating);
	}

	@Override
	public List<Rating> getAllRatings() {
		// TODO Auto-generated method stub
		return ratingDao.getAllRatings();
	}

	@Override
	public Map<String,Double> getAverageRatings() {
		List<Requirement> requirements = requirementDao.getAllRequirement();
		int sum=0;
		int count=0;
		int k=0;
		Map<String,Double> avgRatings = new HashMap<>();
		
		for(int i=1;i<=requirements.size();i++)
		{
		   List<Rating>ratings = ratingDao.getAllRatingsForRequirement(i);
		   
		   for(int j=0;j<ratings.size();j++)
		   {
			   sum+=ratings.get(j).getRating();
			   
			   count++;
		   }
		  k=i-1;
		   double avg = sum/count;
		   count=0;
		   sum=0;
		   avgRatings.put(requirements.get(k).getRequirementName(),avg);
		}
		return avgRatings;
	}

	@Override
	public List<Rating> getAllRatingsByUserName(String userName) {
				
		return ratingDao.getAllRatingsByUserName(userName);
	}

	@Override
	public boolean verifyUserRatings(String loginUserName, int requirementId) {
		
		List<Rating> ratings = ratingDao.getAllRatingsByUserNameAndRequirementId(loginUserName , requirementId);
		if(ratings.size()>0)
			return false;
		else
			return true;
	}
	
 
}
