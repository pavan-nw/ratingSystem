package com.RatingSystem.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.RatingSystem.dao.RatingDao;
import com.RatingSystem.model.Rating;

@Repository("RatingDao")
public class RatingDaoImpl extends AdbstractDao implements RatingDao {

	@Override
	public void addRating(Rating rating) {
		this.save(rating);
	}

	@Override
	public void deleteRating(Rating rating) {
     this.delete(rating);
	}

	@Override
	public void updateRating(Rating rating) {
		// TODO Auto-generated method stub
        this.update(rating);
	}

	@Override
	public List<Rating> getAllRatings() {
		Session session =this.getSession(); 
		Query query =  session.getNamedQuery("Rating.getAllRatings");
		List<Rating> ratings= query.list();
		return ratings;
	}
	
	public List<Rating> getAllRatingsForRequirement(int requirementId)
	{
		Session session = this.getSession();
		Query query = session.createQuery("FROM Rating where requirement.requirementId=:requirementId");
		query.setParameter("requirementId", requirementId);
		List<Rating> ratingsForRequirement = query.list();
		return ratingsForRequirement;
	}

	@Override
	public List<Rating> getAllRatingsByUserName(String username) {
		Session session = this.getSession();
		Query query = session.createQuery("FROM Rating where user.userName like :userName");
		query.setParameter("userName","%"+username+"%");
		List<Rating> ratingsForRequirement = query.list();
		return ratingsForRequirement;
	}

	@Override
	public List<Rating> getAllRatingsByUserNameAndRequirementId(String username,int RequirementId ) {
		Session session = this.getSession();
		Query query = session.createQuery("FROM Rating where user.userName like :userName and requirement.requirementId=:requirementId");
		query.setParameter("userName", username);
		query.setParameter("requirementId", RequirementId);
		List<Rating> ratingsForRequirement = query.list();
		return ratingsForRequirement;
	}
}
