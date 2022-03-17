
/**
 * Project name="NoAssignment"
 * class name=factorial
 * method name= fact
 * Objective=   getting factoral of given  no 
 * Date: 17/03/2022 
 */
/**
 * @author Mohit Kumar Gehlod
 *
 */



package com.sebone.java.assignment;

import java.util.Scanner;

public class Factorial {
	// method for get factorial of given no
	    int fact(int n) 
	    {
		  int i ,fact=1;
		for(i=1;i<=n;i++)
		 {
			fact=fact*i;
	   	}
	     return fact;
	
	 }
	
	
	public static void main(String arg[]) {
		//creating object 
		Factorial f=new Factorial();
		
		//input from user
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number=");
		int number=scanner.nextInt();
		
		//display the result
		
		System.out.println("factorial of given no  is ="+f.fact(5));
		
	}

}
