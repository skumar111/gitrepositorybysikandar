package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.entity.UserInfo;
import com.service.UserService;


@Controller
public class TestController
{
	@Autowired
	UserService userService;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String displayHomePage(HttpServletRequest request,HttpServletResponse response)
	{	
 		return "home"; 
	}
	//this is upendra
    ///Hi this is my first commit 
	@RequestMapping(value="/check", method = RequestMethod.POST)
	public ModelAndView getQuato(HttpServletRequest req,HttpServletResponse resp)
	{	
		UserInfo user=new UserInfo();
 	  user.setUser_name(req.getParameter("user_name"));
 	  user.setUser_gender(req.getParameter("user_gender"));
 	  user.setUser_age(Integer.parseInt(req.getParameter("user_age")));
 	  user.setHypertension_type(req.getParameter("hypertension_type"));
 	  user.setBlood_pressure_type(req.getParameter("blood_pressure_type"));
 	  user.setBlood_suger_type(req.getParameter("blood_suger_type"));
 	  user.setOverweight_type(req.getParameter("overweight_type"));
 	  user.setSmoking_type(req.getParameter("smoking_type"));
 	  user.setAlcohol_type(req.getParameter("alcohol_type"));
 	  user.setDailly_exersize_type(req.getParameter("dailly_exersize_type"));
 	  user.setDrugs_tye(req.getParameter("drugs_tye"));
      
 	  int result=userService.addUser(user);
	  String output="Health Insurance Premium for Mr. "+ user.getUser_name() +": Rs. "+ result;
 	  return new ModelAndView("home","result",output);
		
 	  
	}
}
