package com.RatingSystem.Service;

import java.util.List;

import com.RatingSystem.model.Requirement;

public interface RequirementService {

	public void addRequirement(Requirement requirement);
	
	public void deleteRequirement(Requirement requirement);
	
	public void updateRequirement(Requirement requirement);
	
	public Requirement getRequirement(int requirementId);
	
	public List<Requirement> getAllRequirements();
	
}
