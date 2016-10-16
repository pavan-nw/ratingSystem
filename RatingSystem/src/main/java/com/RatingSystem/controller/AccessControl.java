package com.RatingSystem.controller;

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
@RequestMapping(value = "/")
public class AccessControl {

	private String LoginUserName;
	private int requirementId;
	private static int count=0;
	
	@Autowired
	UserService userService;

	@Autowired
	RequirementService requirementService;
	
	@Autowired
	RatingService ratingService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView Login(ModelMap model, @ModelAttribute("LoginUser") LoginUser loginUser) {
		
		
		LoginUserName = loginUser.getEmailaddress();
		
		if(loginUser.getEmailaddress().equals("admin") && loginUser.getPassword().equals("admin"))
		{
			return new ModelAndView("admin");
		}
		
		else
		{
			boolean authorized = userService.verifyAuthorizedUser(loginUser);
		if (authorized)
		{
			String user =LoginUserName.split("\\.")[0];
			model.addAttribute("LoggedInUser",user);
			return new ModelAndView("rating");
		}
			else
			return new ModelAndView("error");
		}
	}
	@RequestMapping(value = "/foodRatings", method = RequestMethod.POST)
	public String foodRatingSubmission(@ModelAttribute("foodForm") FoodForm foodForm, Map<String, Object> model) {
		count++;
		Rating rating = new Rating();
		User user = userService.getUserByName(LoginUserName);
		
		rating.setUser(user);
		Requirement requirement = requirementService.getRequirement(requirementId);
		rating.setRating(foodForm.getRating());
		rating.setRequirement(requirement);
		rating.setComments(foodForm.getComments());
		ratingService.addRating(rating);
		if(count<6)
		return "rating";
		else 
		return "login";
	}

	@RequestMapping(value = "/transportRatings", method = RequestMethod.POST)
	public String transportRatingSubmission(@ModelAttribute("foodForm") FoodForm foodForm, Model model) {
		count++;
		Rating rating = new Rating();
		User user = userService.getUserByName(LoginUserName);
	
		rating.setUser(user);
		Requirement requirement = requirementService.getRequirement(requirementId);
		rating.setRating(foodForm.getRating());
		rating.setRequirement(requirement);
		rating.setComments(foodForm.getComments());
		ratingService.addRating(rating);
		
		if(count<6)
		return "rating";
		else 
		{ count=0;
			return "login";
		  
		}
		
	}

	@RequestMapping(value = "/pantryRatings", method = RequestMethod.POST)
	public String pantryRatingSubmission(@ModelAttribute("foodForm") FoodForm foodForm, Model model) {
		count++;
		Rating rating = new Rating();
		User user = userService.getUserByName(LoginUserName);
		rating.setUser(user);
		Requirement requirement = requirementService.getRequirement(requirementId);
		rating.setRating(foodForm.getRating());
		rating.setRequirement(requirement);
		rating.setComments(foodForm.getComments());
		ratingService.addRating(rating);
		if(count<6)
			return "rating";
			else 
			{ count=0;
				return "login";
			  
			}
	}

	@RequestMapping(value = "/housekeepingRatings", method = RequestMethod.POST)
	public String housekeepingRatingSubmission(@ModelAttribute("foodForm") FoodForm foodForm, Model model) {
		count++;
		Rating rating = new Rating();
		User user = userService.getUserByName(LoginUserName);
		rating.setUser(user);
		Requirement requirement = requirementService.getRequirement(requirementId);
		rating.setRating(foodForm.getRating());
		rating.setRequirement(requirement);
		rating.setComments(foodForm.getComments());
		ratingService.addRating(rating);
		if(count<6)
			return "rating";
			else 
			{ count=0;
				return "login";
			  
			}
	}

	@RequestMapping(value = "/meetingRatings", method = RequestMethod.POST)
	public String meetingRatingSubmission(@ModelAttribute("foodForm") FoodForm foodForm, Model model) {
		count++;
		Rating rating = new Rating();
		User user = userService.getUserByName(LoginUserName);
		rating.setUser(user);
		Requirement requirement = requirementService.getRequirement(requirementId);
		rating.setRating(foodForm.getRating());
		rating.setRequirement(requirement);
		rating.setComments(foodForm.getComments());
		ratingService.addRating(rating);
		if(count<6)
			return "rating";
			else 
			{ count=0;
				return "login";
			  
			}
	}

	@RequestMapping(value = "/HRRatings", method = RequestMethod.POST)
	public String HRRatingSubmission(@ModelAttribute("foodForm") FoodForm foodForm, Model model) {
		count++;
		Rating rating = new Rating();
		User user = userService.getUserByName(LoginUserName);
		rating.setUser(user);
		Requirement requirement = requirementService.getRequirement(requirementId);
		rating.setRating(foodForm.getRating());
		rating.setRequirement(requirement);
		rating.setComments(foodForm.getComments());
		ratingService.addRating(rating);
		if(count<6)
			return "rating";
			else 
			{ count=0;
				return "login";
			  
			}
	}

	@RequestMapping(value = "/users")
	public String addUser() {
		
	return "addUserForm";
		
	}

	@RequestMapping(value="/errorwhileselecting")
	public String errorWhileSelecting()
	{
		return "rating";
	}
			
	@RequestMapping(value = "/{requirementId}", method = RequestMethod.GET)
	public String HRRatingSubmission(@PathVariable("requirementId") int requirement_Id,Model model ) {
	   System.out.println("requirementId = "+requirementId);
	   String returnpage = null;
	   requirementId=requirement_Id;
	   switch(requirementId)
	   {
	   case 1:
		   if(ratingService.verifyUserRatings(LoginUserName,requirementId))
		   
		  {   
		   returnpage= "foodRating";
		  }
		   else
		   {
			   returnpage= "errorwhileselecting";
		   }
		   break;
	   case 2 :   
		   if(ratingService.verifyUserRatings(LoginUserName,requirementId))
		    returnpage="transportrating"; 
		   else
			   returnpage= "errorwhileselecting";	   
			   break; 
	   case 3 :
		   if(ratingService.verifyUserRatings(LoginUserName,requirementId))
		   returnpage="pantryrating";
		   else
			   returnpage= "errorwhileselecting";	   
		   break;
	   case 4:    
		   if(ratingService.verifyUserRatings(LoginUserName,requirementId))
		   returnpage="housekeepingrating";
		   else
			   returnpage= "errorwhileselecting";
		   break;
	   case 5:
		   if(ratingService.verifyUserRatings(LoginUserName,requirementId))
		   returnpage="meetingrating";
		   else
			   returnpage= "errorwhileselecting";
		   break;
	   case 6:
		   if(ratingService.verifyUserRatings(LoginUserName,requirementId))
		   returnpage="hrrating";
		   else
			   returnpage= "errorwhileselecting";
		   break;     
	   }
		return returnpage;
	}
}
