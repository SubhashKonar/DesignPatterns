package com.learn.creational.factory;

abstract class Employee {

	private String name;
	private String qualification;
	private double incentivePer;




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getQualification() {
		return qualification;
	}




	public void setQualification(String qualification) {
		this.qualification = qualification;
	}




	public double getIncentivePer() {
		return incentivePer;
	}




	public void setIncentivePer(double incentivePer) {
		this.incentivePer = incentivePer;
	}




	public void calculateSal(int units){  
		System.out.println(units*incentivePer);  
	}  

}
