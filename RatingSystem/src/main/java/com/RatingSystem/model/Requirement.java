package com.RatingSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="requirement_tb")
@NamedQueries({@NamedQuery(name="Requirement.ById",query="FROM Requirement where requirementId=:requirementId"),
		@NamedQuery(name="AllRequirements",query="FROM Requirement")})
public class Requirement {

@Id
@Column(name="requirement_id")
private int requirementId;


@Column(name="requirement_name")
private String requirementName;

public int getRequirementId() {
	return requirementId;
}

public void setRequirementId(int requirementId) {
	this.requirementId = requirementId;
}

public String getRequirementName() {
	return requirementName;
}

public void setRequirementName(String requirementName) {
	this.requirementName = requirementName;
}


}
