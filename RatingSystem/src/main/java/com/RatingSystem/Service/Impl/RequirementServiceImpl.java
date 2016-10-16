package com.RatingSystem.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.RatingSystem.Service.RequirementService;
import com.RatingSystem.dao.RequirementDao;
import com.RatingSystem.model.Requirement;
@Transactional
@Service("RequirementService")
public class RequirementServiceImpl implements RequirementService {

	@Autowired
	RequirementDao requirementDao;
	
	@Override
	public void addRequirement(Requirement requirement) {
		// TODO Auto-generated method stub
      requirementDao.addRequirement(requirement); 
	}

	@Override
	public void deleteRequirement(Requirement requirement) {
		// TODO Auto-generated method stub
      requirementDao.deleteRequirement(requirement);
	}

	@Override
	public void updateRequirement(Requirement requirement) {
		// TODO Auto-generated method stub
       requirementDao.updateRequirement(requirement);
	}

	@Override
	public Requirement getRequirement(int requirementId) {
		return requirementDao.getRequirement(requirementId);
		
	}

	@Override
	public List<Requirement> getAllRequirements() {
		// TODO Auto-generated method stub
		return requirementDao.getAllRequirement();
	}

}
