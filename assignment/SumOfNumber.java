/**
 * Project name="NoAssignment"
 * class name=sumOfNo
 * method name= sumOfNo
 * Objective=   getting sum of given   n no 
 * Date: 17/03/2022 
 */
/**
 * @author Mohit Kumar Gehlod
 *
 */
package com.sebone.java.assignment;

import java.util.Scanner;
/*
 * ClassName      :    SumOfNumber
 * UseMethods    :    sumNumber Argument Type int 
 * ClassSpecifier:    public
 * Objective     :    Crate class for Return the Sum of Number till give Number
 * 
 */
public class SumOfNumber {
	/*Method Name  :     sumNumber 
	 * ArgumentType:     int 
	 * ReturnType  :	 int
	 * Objective   :     mehtod for getting sum of given  number input number from user and sum till number and return sum
	 */
	int sumNumber(int number){
		int sum=0 ;
		for(int i=1;i<=number;i++)
			sum=sum+i;
	       return sum ;
   }
	public static void main( String args[]) {
		//creating object
		SumOfNumber sumofnumber= new SumOfNumber();
		//input from user
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number=");
		int number=scanner.nextInt();
		//display the sum of seires
		System.out.println("Sum Of Given N no is="+sumofnumber.sumNumber(number));
  }
}
