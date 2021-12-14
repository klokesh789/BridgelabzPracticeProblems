package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;
public class PowerOfTwo {

	public static void main(String[] args) {
		boolean leapCheck = false;
		Scanner exponentvalue = new Scanner(System.in); 
	    System.out.println("Enter Exponent Value:-");
	    double poweroftwo = exponentvalue.nextDouble();  
		int base = 2;
		if(poweroftwo <= 31 ) {
			for(int i = 1; i <=poweroftwo ; i++) {
				double leapYear = Math.pow(base, i);
				if(leapYear % 4 ==0) {
					
					if(leapYear % 100 == 0) {
						
						if(leapYear % 400 == 0) {
							leapCheck = true;
						}
						else {
							leapCheck = false;
						}
					}
					else {
						leapCheck = true;
					}
				}
				else {
					leapCheck = false;
				}
				if(leapCheck) {
					System.out.println(leapYear + "is the leap year");
				}
				else {
					System.out.println(leapYear +"is not leap year");
				}
				
			}
		
		}else {
			System.out.println("limit excluded(exponentvalue<31)");
		}
	}
}
