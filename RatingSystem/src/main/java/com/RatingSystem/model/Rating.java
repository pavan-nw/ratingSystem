package com.RatingSystem.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="rating_tb")
@NamedQueries({@NamedQuery(name="Rating.getAllRatings",query="FROM Rating")})
public class Rating {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="rating_id")
	int ratingid;
	
	@Column(name="ratings")
	int rating;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	User user;
	
	@OneToOne
	@JoinColumn(name="requirement_id")
	Requirement requirement;
	
	@Column(name="comments")
	String comments;
	
	public int getRatingid() {
		return ratingid;
	}
	public void setRatingid(int ratingid) {
		this.ratingid = ratingid;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Requirement getRequirement() {
		return requirement;
	}
	public void setRequirement(Requirement requirement) {
		this.requirement = requirement;
	}
}
