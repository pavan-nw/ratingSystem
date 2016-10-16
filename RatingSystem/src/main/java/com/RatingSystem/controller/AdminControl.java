package com.RatingSystem.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.RatingSystem.Service.RatingService;
import com.RatingSystem.Service.RequirementService;
import com.RatingSystem.Service.UserService;
import com.RatingSystem.modelVO.LoginUser;
import com.RatingSystem.model.Rating;
import com.RatingSystem.model.Requirement;
import com.RatingSystem.model.User;
import com.RatingSystem.modelVO.FoodForm;

@Controller
@RequestMapping(value = "/admin")
public class AdminControl {
	
    static int count=1; 
	@Autowired
	UserService userService;

	@Autowired
	RequirementService requirementService;
	
	@Autowired
	RatingService ratingService;
	
	@RequestMapping(value = "/users")
	public String addUser() {
		
	return "addUserForm";
	}
	
	
	@RequestMapping(value = "/adduser", method = RequestMethod.POST)
	public ModelAndView addUser(ModelMap model, @ModelAttribute("LoginUser") LoginUser loginUser) {
	User user = new User();
	user.setUserName(loginUser.getEmailaddress());
	user.setPassword(loginUser.getPassword());
	userService.addUser(user); 
	return new ModelAndView("admin");
	}
	
	@RequestMapping(value ="/allusers")
	public String getAllUsers(ModelMap model) {
		List<User> users= userService.getAllUsers();
		model.addAttribute("users",users);
		return "allusers";
	}
	
	@RequestMapping(value ="/allratings")
	public String getAllRatings(ModelMap model) {
		List<Rating> ratings  = ratingService.getAllRatings();
		model.addAttribute("ratings",ratings);
		model.addAttribute("ratingcontent",true);
		return "allratings";
	}
	
	@RequestMapping(value ="/avgratings")
	public String getAllRatingsBasedOnUser(ModelMap model) {
		
		Map<String, Double> avgratings = ratingService.getAverageRatings();
		model.addAttribute("avgratings",avgratings);
		return "averageRatings";
	}
	
	@RequestMapping(value ="/ratingsbasedonuser")
	public String getAllerageRatings() {
		return "ratingsbasedonUser";
	}

	@RequestMapping(value="/ratingsonuser" , method = RequestMethod.GET)
	public String getAllRatingsBasedOnUser(@ModelAttribute("UserName") String UserName, Model model)
	{
		List<Rating> ratings  = ratingService.getAllRatingsByUserName(UserName);
		model.addAttribute("ratings",ratings);
		model.addAttribute("ratingcontent",true);
		return "ratingsbasedonUser";
	}
	
	@RequestMapping(value ="/back")
	public String backToAdmin() {
		return "admin";
	}
	
	
	
	
}
