package com.bridgelab.logicalprograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int i,number=0,flag=0;      
		int n=193;
		number=n/2; 
		if(n==0||n==1){
			System.out.println(n+" is not prime number");      
		}
		else{  
			for(i=2;i<=number;i++){      
			if(n%i==0){      
			System.out.println(n+" is not prime number");      
			flag=1;      
			break;      
			}      
		}      
		if(flag==0){
			System.out.println(n+" is prime number"); 
			}  
		 }
	}

}
