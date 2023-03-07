package prettystones.reposiratory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import prettystones.model.GiftCard;
import prettystones.model.Installments;
import prettystones.model.Investments;
import prettystones.model.Store;
import prettystones.model.User;
import prettystones.service.Gold;
import prettystones.service.MenuOfServicesImpl;
import prettystones.service.Platinum;
public class TestServices {


	public static void main(String[] args) throws SQLException {
	Scanner sc=new Scanner(System.in);
	MenuOfServicesImpl menu=new MenuOfServicesImpl();
	Gold gold = new Gold();
	Platinum platinum = new Platinum();
	ArrayList cart = new ArrayList();
	ArrayList collectionCart = new ArrayList();
	ArrayList<Integer> billing = new ArrayList<>();
	int bill=0;
	int itemsBill=0;
	//int No_Of_Installments=10;
	//int Completed_Installments=0;
	char ch1;
	System.out.println("**********************************************************************************************************************");
	System.out.println("                                               PRETTY STONES                                                          ");
	System.out.println("**********************************************************************************************************************");
	System.out.println("Welcome...!");
	//Account Creation and Login Code
	
	System.out.print("Enter Contact number :");
	String contactNo=sc.next();
	System.out.println(" ------------------------- ");
	System.out.println("| 1-Create an account     |");
	System.out.println("| 2-Login                 |");
	System.out.println(" ------------------------- ");
	System.out.println("Choose an option");
	int accountOption=sc.nextInt();
	switch(accountOption) {
	case 1:
		System.out.println("Creating an account :");
		System.out.print("Enter Username :");
		String username=sc.next();
		System.out.print("Enter Password :");
		String password=sc.next();
		System.out.print("Enter Email Id :");
		String emailId=sc.next();
		System.out.print("Enter City :");
		String city=sc.next();
		System.out.print("Enter State(avoid spaces) :");
		String state=sc.next();
		System.out.print("Enter Country :");
		String country=sc.next();

		User user=new User(username,password,contactNo,emailId,city,state,country);
		try {
			menu.addUser(user);
		}catch(SQLException e) {
			System.out.println("Creating account "+e.getMessage());
		}
		break;
	case 2:
		
		try {
		  menu.findUserByContactNo(contactNo);
			}catch(SQLException e) {
		System.out.println("Credentials do not match our records");
		System.exit(0);
		}
		break;
	}
	do
	{
		try {
	System.out.println("Please press (y/Y) if you want to check the menu");
	char ch=sc.next().charAt(0);
	  if(ch=='y'||ch=='Y') {
	  System.out.println();
	  System.out.println();
	  System.out.println("                    >>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
	  System.out.println("                   |               MENU                 |");
	  System.out.println("                   |>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<|");
      System.out.println("                   |            1.My Profile            |");
	  System.out.println("                   |------------------------------------|");
	  System.out.println("                   |            2.Shop By               |");
	  System.out.println("                   |             `````````              |");
	  System.out.println("                   |             1.Metals               |");
	  System.out.println("                   |             2.Collections          |");
	  System.out.println("                   |------------------------------------|");
	  System.out.println("                   |            3.Order History         |"); 
	  System.out.println("                   |------------------------------------|");
	  System.out.println("                   |            4.Payment Mode          |");
	  System.out.println("                   |            ``````````````          |");
	  System.out.println("                   |             1.Cash                 |");
	  System.out.println("                   |             2.UPI                  |");
	  System.out.println("                   |             3.Installments         |");
	  System.out.println("                   |------------------------------------|");
	  System.out.println("                   |          5.Golden Harvest          |");
	  System.out.println("                   |          `````````````````         |");
	  System.out.println("                   |         [Investment Plans]         |");
	  System.out.println("                   |          `````````````````         |");
	  System.out.println("                   |------------------------------------|");
	  System.out.println("                   |            6.Gift Card             |");
	  System.out.println("                   |------------------------------------|");
	  System.out.println("                   |            7.Store Locator         |");
	  System.out.println("                   |------------------------------------|");
	  System.out.println("                   |       8.View InstallmentPlan       |");
	  System.out.println("                   |------------------------------------|");
	  System.out.println("                   |       9.View InvestmentPlan        |");
	  System.out.println("                   |------------------------------------|");
	  System.out.println("                   |        10.View Your GiftCards      |");
	  System.out.println("                   |------------------------------------|");
	  System.out.println("                   |            11.Logout                |");
	  System.out.println("                   |>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<|");
	 
	  System.out.println("Choose an option :");
      
	  }
	  else {
			System.out.println(">>>>Please choose correct option<<<<");
	  }
		 }catch(Exception e) {
			  System.out.println(e.getMessage());
		  }
		
		  //Menu Code
	
		int menuOption=sc.nextInt();
       switch(menuOption) {
       case 1:
    	 User user=menu.myPofile(contactNo);
    	 System.out.println(user);
    	   break;
       case 2:
    	   System.out.println("1.Metals");
    	   System.out.println("2.Collections");
    	   System.out.println("Choose an option");
    	   int shopByOption=sc.nextInt();
    	     switch(shopByOption) {
    	       case 1:
    		    System.out.println("^^^^^^^^^^^^^^^^^");
    		    System.out.println("^   1.Gold      ^");
    		    System.out.println("^   2.Platinum  ^");
    		    System.out.println("^^^^^^^^^^^^^^^^^");
    		    System.out.println("Choose a metal");
    		    int metalOption=sc.nextInt();
    		    if(metalOption==1) {
    		     System.out.println("1.Chain");
    		     System.out.println("2.Bracelet");
    		     System.out.println("3.Gold coin");
    		     System.out.println("Choose a design");
    		     int goldDesignOption=sc.nextInt();
    		        switch(goldDesignOption) {
    		        case 1:
    		    	bill= gold.goldChain();
    		    	cart.add("Gold Chain");
    		    	billing.add(bill);
    		    	 break;
    		        case 2:
    		    	 bill=gold.goldBracelet();
    		    	 cart.add("Gold Bracelet");
    		    	 billing.add(bill);
    		    	 break;
    		        case 3:
    		    	 bill=gold.goldCoin();
    		    	 cart.add("GOld Coin");
    		    	 billing.add(bill);
    		    	 break;
    		     }  
    		     
    		    }
    	        if(metalOption==2) {
    	         System.out.println("1.Chain");
       		     System.out.println("2.Bracelet");
       		     System.out.println("3.Platinum coin");
       		  System.out.println("Choose a design");
       		     int platinumDesignOption=sc.nextInt();
       		         switch(platinumDesignOption) {
       		         case 1:
       		    	 bill=platinum.platinumChain();
       		    	 cart.add("Platinum Chain");
       		    	billing.add(bill);
       		    	 break;
       		         case 2:
       		    	 bill=platinum.platinumBracelet();
       		    	 cart.add("Platinum Bracelet");
       		    	billing.add(bill);
       		    	 break;
       		        case 3:
       		    	 bill=platinum.platinumCoin();
       		    	 cart.add("Platinum Coin");
       		    	billing.add(bill);
       		    	 break;
       		     }  
    	        }
    		  	break;
    	   case 2:
    		
    			  System.out.println("*******************************************************");
    			  System.out.println("*      Welcome to our wide range of collections       *");
    			  System.out.println("*******************************************************");
    			  System.out.println("*           1.Padmaavat        = RS.220789            *");
    			  System.out.println("*           2.Mirayah          = RS.150000            *");
    			  System.out.println("*           3.Utsava           = RS.56462             *");
    			  System.out.println("*           4.Preen            = RS.91846             *");
    			  System.out.println("*           5.Swayahm          = RS.31514             *");
    			  System.out.println("*           6.Ahalya           = RS.564052            *");
    			  System.out.println("*           7.Aarambh          = RS.65144             *");
    			  System.out.println("*           8.Ekatvam          = RS.178038            *");
    			  System.out.println("*           9.Utsaah           = RS.313687            *");
    			  System.out.println("*           10.Rhythms of Rain = RS.112509            *");
    			  System.out.println("*******************************************************");
    			  System.out.println("Choose a collection :");
    			  int collectionOption=sc.nextInt();
    			  if(collectionOption==1) {
    				  bill=220789;
    				  cart.add("Padmaavat");
    				  billing.add(bill);
    			  }
    			  else if(collectionOption==2) {
    				  bill= 150000 ;
    				  cart.add("Mirayah");
    				  billing.add(bill);
    			  }
    			  else if(collectionOption==3) {
    				  bill=56462; 
    				  cart.add("Utsava");
    				  billing.add(bill);
    			  }
    			  else if(collectionOption==4) {
    				  bill=91846;
    				  cart.add("Preen");
    				  billing.add(bill);
    			  }
    			  else if(collectionOption==5) {
    				  bill=31514;
    				  cart.add("Swayahm");
    				  billing.add(bill);
    			  }
    			  else if(collectionOption==6) {
    				  bill=564052;
    				  cart.add("Ahalya");
    				  billing.add(bill);
    			  }
    			  else if(collectionOption==7) {
    				  bill=65144 ;
    				  cart.add("Aarambh");
    				  billing.add(bill);
    			  }
    			  else if(collectionOption==8) {
    				  bill=178038 ;
    				  cart.add("Ekatvam");
    				  billing.add(bill);
    			  }
    		      else if(collectionOption==9) {
    		    	  bill=313687;
    		    	  cart.add("Utsaah");
    		    	  billing.add(bill);
    		      }
    		      else if(collectionOption==10) {
    		    	  bill=112509;
    		    	  cart.add("Rhythms of Rain");
    		    	  billing.add(bill);
    		      }
    		      else {
    		    	  System.out.println("You have choosen the wrong option");
    		      }
    			
    	     break;
    	  }
    	  break;
       case 3:
    	   if(cart!=null) {
    		   System.out.println("Ordered items are :"+cart);
  
    	   }
    	   else {
    		   System.out.println("There are no items in the cart");
    	   }
    	   
    	   break;
       case 4:
    	   for(int i:billing) {
    		   itemsBill=itemsBill+i;
    	   }
    	   int billWithMakingCharges=itemsBill+1500;
    	   int instaPayment=billWithMakingCharges/10;
    	   System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    	   System.out.println(">                                                                    <");
    	   System.out.println(">                                     BILL                           <");
    	   System.out.println(">                                   ````````                         <");
    	   System.out.println(">Your Mobile number :"+contactNo+"                                   <");
    	   System.out.println(">Items you ordered  :"+cart+"                                        <");
    	   System.out.println(">Bill               :"+itemsBill+"                                   <");
    	   System.out.println(">Making Charges     :1500                                            <");
    	   System.out.println(">Total Bill         :"+billWithMakingCharges+"                       <");
    	   System.out.println(">                                                                    <");
    	   System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    	   System.out.println("PROCEED TO PAYMENT");
    	   System.out.println("Press 1 for Cash , 2 for UPI , 3 for Installments");
    	   int billOption = sc.nextInt();
    	   if(billOption==1) {
    		   System.out.println("Thankyou!...Payment Successfull");
    	   }
    	   if(billOption==2) {
    		   System.out.println("UPI Id is : prettyStones@ybl");
    		   System.out.println("Thankyou!...Payment Successfull");
    	   }
    	   if(billOption==3) {
    		   System.out.println("Your one month installment will be---"+instaPayment);
    		   System.out.println("-----You need to pay the amount in 10 months-----");
    		   System.out.println("-----You can pay cash in your nearby PRETTY STONES store-----");
    		   System.out.println("-----You can pay online to this UPI Id : prettyStones@ybl-----");
       		  int amount =billWithMakingCharges ;
    		  int noOfInstallments = 10;
    		  int amountOfInstallments = instaPayment;
    		  int completedInstallments = 0;
    		  Installments installments = new Installments(contactNo,amount,noOfInstallments,amountOfInstallments,completedInstallments);
    		  try {
    			  menu.addInstallmentOfUser(installments);
    		  }catch(SQLException ex) {
    			  System.out.println(ex.getMessage());
    		  }
    		    	   }
    	   
    	  break;
       case 5:
    	   System.out.println("---Welcome to Investments world---");
    	   System.out.println("-----Please have a look at this investment plan-----");
    	   System.out.println("<>-----It is a 10 months plan-----<>");
    	   System.out.println("<>---After completing successive 10months for every single months your amount will increase by 10%---<>");
    	   System.out.println("<>---You can withdraw whenever you need after 10months---<>");
    	   System.out.println("Press y to invest-----");
    	   char ch2=sc.next().charAt(0);
    	   if(ch2=='y'||ch2=='Y') {
    		   System.out.println("Please enter the amount");
    		   int investmentAmount=sc.nextInt();
    		   int completed_months=1;
    		   Investments investments = new Investments(contactNo,investmentAmount,completed_months);
    		   menu.addInvestment(investments);
    	   }
    	 
    	   
    	   break;
       case 6 :
    	   System.out.println("You can gift GIFT-CARDS to your loved ones");
    	   System.out.println("Please enter the amount");
    	   int giftAmount=sc.nextInt();
    	   System.out.println("Enter the contactNo of your loved ones");
    	   String giftReceiverContactNo=sc.next();
    	   GiftCard giftcard = new GiftCard(contactNo,giftReceiverContactNo,giftAmount);
    	   menu.addGiftCard(giftcard);
    	   break;
       case 7:
    	   System.out.println(" WE HAVE BRANCHES IN THESE STATES ");
    	   System.out.println("-----(KURNOOL       - 518001)-----");
    	   System.out.println("-----(HYDERABAD     - 500029)-----");
    	   System.out.println("-----(VIJAYAWADA    - 520010)-----");
    	   System.out.println("-----(GUNTUR        - 522001)-----");
    	   System.out.println("-----(RAJAHMUNDRY   - 533101)-----");
    	   System.out.println("-----(VISHAKAPATNAM - 530003)-----");
    	   System.out.println("  You can search by pincode");
    	   System.out.println("  Please Enter PINCODE");
    	   int pincode =sc.nextInt();
    	   Store store =menu.storeLocatorByPincode(pincode);
    	   System.out.println(store);
    	   break;
       case 8 :
    	   Installments installments = menu.viewInstallments(contactNo);
    	   System.out.println(installments);
    	   break;
       case 9 :
    	   Investments investments = menu.viewInvestment(contactNo);
    	   System.out.println(investments);
    	   break;
       case 10 :
    	   GiftCard giftCard = menu.viewGiftCard(contactNo);
    	   System.out.println(giftCard);
    	   break;
       case 11 :
    	   System.out.println("<<>>------------------------------Logged out------------------------------<<>>");
    	   System.exit(0);
    	   break;
       }
	System.out.println("Press y if you want to continue shopping");
	 ch1=sc.next().charAt(0);
	}while(ch1=='y'||ch1=='Y');
	
	}
}