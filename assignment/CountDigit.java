/**
 * Project name="NoAssignment"
 * class name=countDigit
 * method name= countdigit
 * Objective=   counting the digit of given  no 
 * Date: 17/03/2022 
 */
/**
 * @author Mohit Kumar Gehlod
 *
 */
package com.sebone.java.assignment;
import java.util.Scanner;
/*
 * ClassName     :    CountDigit
 * UseMethods    :    countdigit 
 * ClassSpecifier:    public
 * Objective     :    Crate class for Count The Digit of given Number.
 */
public class CountDigit {
	/*Method Name   :     countdigit 
	 * ArgumentType :     int 
	 * ReturnType   :	 int
	 * Objective    :    Crate Method for Count The Digit of given Number. 
	 */
	public int coundigit(int number){
		 int count=0;
		 while(number!=0){
			 count++;
			 number=number/10;
		}
		//return count
		return count;
	 }
	
	public static void main(String args[]) {
		CountDigit countdigit= new CountDigit();
		//print the total digit in no
		//input from user
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number=");
		int number=scanner.nextInt();
		System.out.println("Totoal Digit is = "+countdigit.coundigit(number));
	}
}
