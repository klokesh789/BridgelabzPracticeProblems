package com.bridgelab.logicalprograms;

public class FibonacciSeries {
	public static void main(String[] args)
	{
		int number = 15;
		int previousNum = 0;
		int currentNum = 1;
		System.out.print("fibonacci series of " + number + " is " + previousNum + ", " + currentNum);
		for(int i =2; i < number; i++)
		{
			int nextNum = previousNum + currentNum;
			previousNum = currentNum;
			currentNum = nextNum;
			System.out.print(", " + nextNum);
		}
	}

}
