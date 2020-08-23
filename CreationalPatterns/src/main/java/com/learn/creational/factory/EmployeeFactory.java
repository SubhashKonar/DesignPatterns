package com.learn.creational.factory;


/**
 * 
 * @author konar
 * Factory class which will return the object of Employee
 */
public class EmployeeFactory {

	public Employee getEmployee(EmployeeEnum args)
	{
		if(args==null)
		{
			return null;
		}
		else if(args == EmployeeEnum.GRADE_ONE)
		{
			return new GradeOneEmployee();
		}
		else if(args == EmployeeEnum.GRADE_TWO)
		{
			return new GradeTwoEmployee();
		}
		else if(args == EmployeeEnum.GRADE_THREE)
		{
			return new GradeThreeEmployee();
		}
		return null;
		
	}
}
