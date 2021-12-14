package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;
public class HarmonicNumber {

	public static void main(String[] args) {
		System.out.print("Enter any number : ");
        Scanner m = new Scanner(System.in);
        int num = m.nextInt();
        System.out.println("The Harmonic Series is : ");
        double result = 0.0;
        while(num > 0)
          {
               result = result + (double) 1 / num;
               num--;
               System.out.print(result +"  ");
          }
           
        System.out.println(" The Nth Hormonic value: "+result);
	}

}
