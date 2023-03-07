package prettystones.service;

import java.util.Scanner;

public class Platinum {
	Scanner sc = new Scanner(System.in);
	 //platinum chain bill generation
	  public int platinumChain() {
		  int billOfPlatinumChain=0;
		   System.out.println("How many grams of chain you want ?");
		   int platinumGramOption=sc.nextInt();
		    if(platinumGramOption>5) {
		    	billOfPlatinumChain=5596*platinumGramOption;
		    }
		    else {
		    	System.out.println("Sorry! we cannot ready the chain in your requirements");
		    }
		    return billOfPlatinumChain;
	  
	  } 
	  //platinum bracelet bill generation
	  public int platinumBracelet() {
		  int billOfPlatinumBracelet=0;
			   System.out.println("How many grams of Bracelet you want ?");
			   int platinumGramOption=sc.nextInt();
			    if(platinumGramOption>5) {
			    	billOfPlatinumBracelet=5596*platinumGramOption;
			    }
			     else {
			    	System.out.println("Sorry! we cannot ready the Bracelet with your requirement");
			    	}
			    return billOfPlatinumBracelet;
			    
		  } 
		  
	  //platinum coin bill generation
	  
	  public int platinumCoin() {
		  int  billOfPlatinumCoin = 0;
			   System.out.println("How many grams of coin you want ?");
			   int platinumGramOption=sc.nextInt();
		         System.out.println(billOfPlatinumCoin=5223*platinumGramOption);
		        return billOfPlatinumCoin;
		}

}

