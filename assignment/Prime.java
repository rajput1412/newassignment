/**
 * Project name="NoAssignment"
 * class name=prime
 * method name= isPrime
 * Objective=Finding  the Given no is Prime no or Not
 * Date: 17/03/2022 
 */
/**
 * @author Mohit Kumar Gehlod
 *
 */
package com.sebone.java.assignment;

import java.util.Scanner;
/*
 * ClassName     :    Prime
 * UseMethods    :    isPrime 
 * ClassSpecifier:    public
 * Objective     :    Crate class for Check  the   Given Number is Prime Number Or not Prime.
 */
public class Prime {
    /* 
     * Method Name  :     isPrime 
	 * ArgumentType:     int number
	 * ReturnType  :	 boolean
	 * Objective   :     mehtod for Checke the given  number  number is Prime No or Not 
	 */
	boolean isPrime(int number){
		boolean prime=true;
		for(int i=2;i<number/2;i++)	{
		     if(number%i==0){
		    	 prime = false;
		       }
		 }
		  return prime;
	}
    public static void main(String args[]) {
		//creating object of Prime
		Prime prime= new Prime();
		//input from keyboard
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number=");
		int number = scanner.nextInt();
		//check no is  prime or not
		if(prime.isPrime(number))
			System.out.println("given no is prime");
		else
			System.out.println("Given NO is Not Prime");
		scanner.close();
	}
}
