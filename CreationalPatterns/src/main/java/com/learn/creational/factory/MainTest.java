package com.learn.creational.factory;



/**
 * 
 * @author konar
 * In Factory pattern, we create object without exposing the creation logic to the client 
 * and refer to newly created object using a common interface.
 */

//Test class
public class MainTest {

	public static void main(String args[])
	{
		EmployeeFactory emf=new EmployeeFactory();
		Employee em=emf.getEmployee(EmployeeEnum.GRADE_ONE); //arguement decide which object need to be returned.
		
		
		em.calculateSal(100);
		
		
		em=emf.getEmployee(EmployeeEnum.GRADE_ONE);
	
		em.calculateSal(100);
		

		
		em=emf.getEmployee(EmployeeEnum.GRADE_ONE);
	
		em.calculateSal(100);
	}
}
