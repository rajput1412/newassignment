/**
 * Project name="StringAssignment"
 * class name=ReverseString
 * method name= reversString
 * Objective=   counting the digit of given  no 
 * Date: 17/03/2022 
 */
/**
 * @author Mohit Kumar Gehlod
 *
 */
package com.sebone.java.stringassignment;

import java.util.Scanner;
/*
 *  class name ReverseString
 *  creating class for given string change into revrse string
 *  output reverse string
 */

public class ReverseString {
	/*Merhod:reverseString
	 *Objective: method creating for reverseString
	 *take a string and give his reverse string
	 *usemethod= tocharArray()
	 *swaping index each ohter
	 *return reverse string
	 */
	public String reversString(String string){
		char[] rev=string.toCharArray();
	    char temp;
	    int i,j ;
	    j=string.length();
	    for(i=0,j=j-1;i<j;i++,j--){
	    	temp=rev[i];
	    	rev[i]=rev[j];
	    	rev[j]=temp;
	    }
	// creating String object
	    String result=new String(rev);
	    return result;
	}
	public static void main(String arg[]) {
		// creating object ReverseString class
		ReverseString reversestring1 = new ReverseString();
		//creating scanner class
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String=");
		// input from user
		String str=scanner.next();
		// show the reverse string 
		System.out.println(reversestring1.reversString(str));
		scanner.close();
	}
}
