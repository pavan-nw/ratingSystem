package com.RatingSystem.dao;

import java.util.List;

import com.RatingSystem.model.Requirement;

public interface RequirementDao {

	public void addRequirement(Requirement requirement);
	
	public void deleteRequirement(Requirement requirement);
	
	public void updateRequirement(Requirement requirement);
	
	public List<Requirement> getAllRequirement();
	
	public Requirement getRequirement(int requirementId);
	
}
