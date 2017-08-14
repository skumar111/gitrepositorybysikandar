package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.entity.UserInfo;

@Service
public class ServiceImpl implements UserService 
{
	@Autowired
	UserDao dao;

	@Override
	public int addUser(UserInfo userInfo)
	{
		int basePremuem =5000;
		int totalPremium=0;
		
		if(userInfo.getUser_age() >= 18 && userInfo.getUser_age()< 25)
		{ 
			totalPremium += basePremuem + ((10 * basePremuem)/100);
		} 
		
		if(userInfo.getUser_age() >= 25 && userInfo.getUser_age()< 30)
		{
			totalPremium += basePremuem + ((10 * basePremuem)/100);
			totalPremium += ((10 * totalPremium)/100);
		}
		
		if(userInfo.getUser_age() >= 30 && userInfo.getUser_age() < 35)
		{
			totalPremium += basePremuem + ((10 * basePremuem)/100);
			totalPremium += ((10 * totalPremium)/100);
			totalPremium += ((10 * totalPremium)/100);
		}
		
		if(userInfo.getUser_age() >= 35 && userInfo.getUser_age() < 40)
		{
			totalPremium += basePremuem + ((10 * basePremuem)/100);
			totalPremium += ((10 * totalPremium)/100);
			totalPremium += ((10 * totalPremium)/100);
			totalPremium += ((10 * totalPremium)/100);
			
		}
		
		if(userInfo.getUser_age() >= 40) 
		{
			totalPremium += basePremuem + ((10 * basePremuem)/100);
			totalPremium += ((10 * totalPremium)/100);
			totalPremium += ((10 * totalPremium)/100);
			totalPremium += ((10 * totalPremium)/100);
			totalPremium += ((20 * totalPremium)/100);
		}
		
		if(userInfo.getUser_gender().equalsIgnoreCase("Male")) {
			totalPremium += ((2 * totalPremium)/100);
		}
		
		//--------- health condition
		if(userInfo.getHypertension_type().equalsIgnoreCase("Yes")) {
			totalPremium +=  ((1 * totalPremium)/100);
		}
		
		if(userInfo.getBlood_pressure_type().equalsIgnoreCase("Yes")) {
			totalPremium +=  ((1 * totalPremium)/100);
		}
		
		if(userInfo.getOverweight_type().equalsIgnoreCase("Yes")) {
			totalPremium +=  ((1 * totalPremium)/100);
		}
		
		if(userInfo.getBlood_suger_type().equalsIgnoreCase("Yes")) {
			totalPremium +=  ((1 * totalPremium)/100);
		}
		//--------- health condition
		
		//-------habits
		if(userInfo.getSmoking_type().equalsIgnoreCase("Yes")) {
			totalPremium += ((3 * totalPremium)/100);
		}
		
		if(userInfo.getAlcohol_type().equalsIgnoreCase("Yes")) {
			totalPremium += ((3 * totalPremium)/100);
		}
		
		if(userInfo.getDailly_exersize_type().equalsIgnoreCase("Yes")) {
			totalPremium -= ((3 * totalPremium)/100);
		}
		
		if(userInfo.getDrugs_tye().equalsIgnoreCase("Yes")) {
			totalPremium += ((3 * totalPremium)/100);
		} 
		
		userInfo.setTotalResult(totalPremium);
		System.out.println(totalPremium);
		dao.saveUser(userInfo);
		return totalPremium;
	}

	

}
