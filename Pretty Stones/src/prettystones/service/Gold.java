package prettystones.service;
import java.sql.SQLException;
import java.util.Scanner;

public class Gold {
	Scanner sc = new Scanner(System.in);
		  //gold chain bill generation
		  public int goldChain() {
			  int billOfGoldChain=0;
		  System.out.println("Please specify the carat 22 or 24");
		  System.out.println("22 carat=RS.5223");
		  System.out.println("24 carat=RS.5596");
		  int caratOption=sc.nextInt();
		  if(caratOption==22) {
			   System.out.println("How many grams of chain you want ?");
			   int goldGramOption=sc.nextInt();
			    if(goldGramOption>5) {
			    	billOfGoldChain=5223*goldGramOption;
			    }
			     else {
			    	System.out.println("Sorry! we cannot ready the chain with your requirement");
			    	}
			    }
		  if(caratOption==24) {
			   System.out.println("How many grams of chain you want ?");
			   int goldGramOption=sc.nextInt();
			    if(goldGramOption>5) {
			    	billOfGoldChain=5596*goldGramOption;
			    	}
			     else {
			    	System.out.println("Sorry! we cannot ready the chain with your requirement");
			    	}
			    } 
		   return billOfGoldChain;
		  } 
		  //gold bracelet bill generation
		  public int goldBracelet() {
			  int billOfGoldBracelet=0;
			  System.out.println("Please specify the carat 22 or 24");
			  System.out.println("22 carat=RS.5223");
			  System.out.println("24 carat=RS.5596");
			  int caratOption=sc.nextInt();
			  if(caratOption==22) {
				   System.out.println("How many grams of Bracelet you want ?");
				   int goldGramOption=sc.nextInt();
				    if(goldGramOption>5) {
				    	billOfGoldBracelet=5223*goldGramOption;
				    }
				     else {
				    	System.out.println("Sorry! we cannot ready the Bracelet with your requirement");
				    	}
				    }
			  if(caratOption==24) {
				   System.out.println("How many grams of Bracelet you want ?");
				   int goldGramOption=sc.nextInt();
				    if(goldGramOption>5) {
				    	billOfGoldBracelet=5596*goldGramOption;
				    	}
				     else {
				    	System.out.println("Sorry! we cannot ready the Bracelet with your requirement");
				    	}
				    }  
			return  billOfGoldBracelet;  
		  } 
			  
		  //gold coin bill generation
		  
		  public int goldCoin() {
			  System.out.println("Please specify the carat 22 or 24");
			  System.out.println("Please specify the carat 22 or 24");
			  System.out.println("22 carat=RS.5223");
			  System.out.println("24 carat=RS.5596");
			  int caratOption2=sc.nextInt();
			  int  billOfGoldCoin = 0;
			  if(caratOption2==22) {
				   System.out.println("How many grams of coin you want ?");
				   int goldGramOption=sc.nextInt();
			         System.out.println(billOfGoldCoin=5223*goldGramOption);
			        }
			  if(caratOption2==24) {
				   System.out.println("How many grams of coin you want ?");
				   int goldGramOption=sc.nextInt();
			         System.out.println(billOfGoldCoin=5596*goldGramOption);
			        }
			
		      
		    return billOfGoldCoin;
        }
}
