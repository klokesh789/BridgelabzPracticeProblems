package com.bridgelabz.basiccoreprograms;

public class FlipCoin {

	public static void main(String[] args) {
		int numOfFilp = 10;
		int heads = 0;
	    int tails = 0;
	    for(int i = 1; i <= numOfFilp;i++) {
	    	if(Math.random() < 0.5) {
	    		tails++;
	    	}
	    
	 	    }
	    double precentageOftails = (tails * 100)/ numOfFilp;
	    double precentageOfheads = 100 - precentageOftails;
	    System.out.println(precentage_Of_tails);
	    System.out.println(precentage_Of_heads);

	}

}
