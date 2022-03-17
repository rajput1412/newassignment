
/**
 * Project name="NoAssignment"
 * class name=fibonicSeries
 * method name= fibonicSeries
 * Objective=   getting FibonicSeries of given  no 
 * Date: 17/03/2022 
 */
/**
 * @author Mohit Kumar Gehlod
 *
 */
package com.sebone.java.assignment;

import java.util.Scanner;
 /*
 * ClassName     :    FibonicSeries
 * UseMethods    :    fibonic 
 * ClassSpecifier:    public
 * Objective     :    Crate class for find the fibonic serise of Given Number.
 */
public class FibonicSeries {
   /*Method Name   :     fibonic 
	 * ArgumentType:     int 
	 * ReturnType  :	 int
	 * Objective   :     Mehtod for getting fibonicSeries of given  number 
	 */
    int fibonic(int number)
	{  int firstNumber=0, secondNumber=1,nextTerm;
		nextterm=firstno+secondno;
		for(int i=firstno;i<number;i++) {
			//show the  the  fibonic series
			System.out.println(firstno);
			firstno=secondno;
			secondno=nextterm;
			nextterm=firstno+secondno;
	    }
		return 0;
	}
	public static void main(String args[]) {
		//creating object of fibonicSeries
		FibonicSeries fibonicSeries= new FibonicSeries();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number=");
		int number=scanner.nextInt();
	    fibonicseries.fibonic(number);
	}

 }
