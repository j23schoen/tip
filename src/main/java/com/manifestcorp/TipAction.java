package com.manifestcorp;

import com.opensymphony.xwork2.ActionSupport;

public class TipAction extends ActionSupport {

	private final static int NO_TIP = -1;
	private double tipAmount = NO_TIP;
	private double mealAmount;
	private double tipPercentage;
	
	public String execute(){
		calculate();
		return SUCCESS;
	}
	
	public void calculate(){
		tipAmount = mealAmount * tipPercentage;
	}
	
	public double getTipAmount(){
		return tipAmount;
	}
	
	public double getMealAmount(){
		return mealAmount;
	}
	
	public void setMealAmount(double mealAmount){
		this.mealAmount = mealAmount;
	}
	
	public double getTipPercentage(){
		return tipPercentage;
	}
	
	public void setTipPercentage(double tipPercentage){
		this.tipPercentage = tipPercentage;
	}
	
}
