package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="userinfo")
public class UserInfo 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	private String user_name;
	private String user_gender;
	private int user_age;
	private String hypertension_type;
	private String blood_pressure_type;
	private String blood_suger_type;
	private String overweight_type;
	private String smoking_type;
	private String alcohol_type;
	private String dailly_exersize_type;
	private String drugs_tye;
	private int totalResult;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	public int getUser_age() {
		return user_age;
	}
	public void setUser_age(int user_age) {
		this.user_age = user_age;
	}
	public String getHypertension_type() {
		return hypertension_type;
	}
	public void setHypertension_type(String hypertension_type) {
		this.hypertension_type = hypertension_type;
	}
	public String getBlood_pressure_type() {
		return blood_pressure_type;
	}
	public void setBlood_pressure_type(String blood_pressure_type) {
		this.blood_pressure_type = blood_pressure_type;
	}
	public String getBlood_suger_type() {
		return blood_suger_type;
	}
	public void setBlood_suger_type(String blood_suger_type) {
		this.blood_suger_type = blood_suger_type;
	}
	public String getOverweight_type() {
		return overweight_type;
	}
	public void setOverweight_type(String overweight_type) {
		this.overweight_type = overweight_type;
	}
	public String getSmoking_type() {
		return smoking_type;
	}
	public void setSmoking_type(String smoking_type) {
		this.smoking_type = smoking_type;
	}
	public String getAlcohol_type() {
		return alcohol_type;
	}
	public void setAlcohol_type(String alcohol_type) {
		this.alcohol_type = alcohol_type;
	}
	public String getDailly_exersize_type() {
		return dailly_exersize_type;
	}
	public void setDailly_exersize_type(String dailly_exersize_type) {
		this.dailly_exersize_type = dailly_exersize_type;
	}
	public String getDrugs_tye() {
		return drugs_tye;
	}
	public void setDrugs_tye(String drugs_tye) {
		this.drugs_tye = drugs_tye;
	}
	public int getTotalResult() {
		return totalResult;
	}
	public void setTotalResult(int totalResult) {
		this.totalResult = totalResult;
	}
	
	
	
    
	
	
	

}
