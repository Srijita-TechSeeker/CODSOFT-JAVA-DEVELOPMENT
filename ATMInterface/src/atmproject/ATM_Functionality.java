package atmproject;

import java.util.Scanner;
public class ATM_Functionality {

	float balance;
	int pin=1234;
	
	public void pin()
	{
		System.out.println("Enter your Pin ::");
		Scanner sc = new Scanner(System.in);
		int enteredPin = sc.nextInt();
		if(enteredPin==pin)
		{
			System.out.println("Welcome..");
			Menu();
		}else 
		{
			System.out.println("You Entered Wrong  Pin..");
		}
		pin();
		
	}
	public void Menu()
	{
		System.out.println("Choose Correct Option ::");
		System.out.println("press 1 :: Check Account Balance");
		System.out.println("press2 :: Deposit Money");
		System.out.println("press3 :: Withdraw Money");
		System.out.println("press4:: Exit");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch(option)
		{
		case 1:
			checkAccountBalance();
			Menu();
			break;
		 
		case 2:
			depositMoney();
			Menu();
			break;
		   
		case 3:
			withdrawMoney();
			Menu();
			break;
		   
		    
		case 4:
			exit();
			Menu();
			break;
		default:
			System.out.println("Choose Correct Option ::");
			Menu();
		    
		}
	}
	private void exit() {
		System.out.println("are you sure to exit (y/n)");
		
		Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    if(str.equalsIgnoreCase("y")) {
	    	System.out.println("Thank you for Visting...");
	    	sc.close();
			
	    }else {
	    	Menu();
	    }
	}
	private void withdrawMoney() {
		System.out.println("Enter Amount To Withdraw Money");
		Scanner sc = new Scanner(System.in);
	    float withdrawnAmount = sc.nextFloat();
	    if(withdrawnAmount>balance)
	    {
	    	System.out.println("You have not Sufficient Money");
	    }else {
	    	balance -= withdrawnAmount;
	    	System.out.println("Success!!");
	    }
	}
	private void depositMoney() {
		System.out.println("Enter Amount To Deposit Money");
		Scanner sc = new Scanner(System.in);
	    float depositAmount = sc.nextFloat();
	    balance += depositAmount;
	    
		
	}
	private void checkAccountBalance() {
		System.out.println("Your Current Balance is :: "+balance);
		
		
	}
	
}
