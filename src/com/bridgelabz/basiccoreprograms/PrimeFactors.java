package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;
public class PrimeFactors {

	public static void main(String[] args) {
		int number;
	      Scanner pf = new Scanner(System.in);
	      System.out.println("Enter a number :");
	      number = pf.nextInt();
	     
	      for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            System.out.println("prime factors of given number are: "+i);
	            number = number/i;
	         }
	      }
	      if(number >2) {
	         System.out.println(number);
	      }

	}

}
