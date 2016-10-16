package com.RatingSystem.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.RatingSystem.dao.RequirementDao;
import com.RatingSystem.model.Requirement;

@Repository("RequirementDao")
public class RequirementDaoImpl extends AdbstractDao implements RequirementDao {

	@Override
	public void addRequirement(Requirement requirement) {
		this.save(requirement);
	}

	@Override
	public void deleteRequirement(Requirement requirement) {
		this.delete(requirement);
	}

	@Override
	public void updateRequirement(Requirement requirement) {
			this.update(requirement);
	}

	@Override
	public List<Requirement> getAllRequirement() {
		Session session = this.getSession();
		Query query = session.getNamedQuery("AllRequirements");
		List<Requirement> requirements = query.list();
		return requirements;
	}

	@Override
	public Requirement getRequirement(int requirementId) {
		Session session = this.getSession();
		Query query = session.getNamedQuery("Requirement.ById");
	    query.setParameter("requirementId", requirementId);
		List<Requirement> requirements = query.list();
	    return requirements.get(0);
	}

}
