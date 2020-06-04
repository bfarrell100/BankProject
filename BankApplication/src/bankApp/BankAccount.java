package bankApp;

import java.util.Scanner;

public class BankAccount {
	
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cName, String cId)
	{
		this.customerName=cName;
		this.customerId=cId;
	}
	
	void deposit(int amount)
	{
		if(amount != 0)
		{
			balance =balance+amount;
			previousTransaction=-amount;
		}
	}
	
	void withDraw(int amount)
	{
		if(amount != 0)
		{
			balance =balance-amount;
			previousTransaction=-amount;
		}
	}

	void getPreviousTransation()
	{
		if(previousTransaction > 0)
		{
			System.out.println("Deposited : "+previousTransaction);
			
		}
		else if(previousTransaction < 0)
		{
			System.out.println("Withdraw: "+Math.abs(previousTransaction ));
		}
		else
		{
			System.out.println("No Transaction occured");
		}
	}
	
	void showMenu()
	{
		char option='\0';
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome "+customerName);
		System.out.println("Your bank ID is  "+customerId);
		System.out.println("\n");
		System.out.println("A.Check Balance");
		System.out.println("B.Deposit");
		System.out.println("C.Withdraw");
		System.out.println("D.Previous Transaction");
		System.out.println("E.Exit");
		
		do
		{
			System.out.println("******************************");
			System.out.println("Enter an Option :");
			System.out.println("******************************");
			option =scan.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
				System.out.println("******************************");
				System.out.println("Balance  = "+balance);
				System.out.println("******************************");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("******************************");
				System.out.println("Enter an amount to deposit :");
				System.out.println("******************************");
				int amount =scan.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
			
			case 'C':
				System.out.println("******************************");
				System.out.println("Enter an amount to Withdraw :");
				System.out.println("******************************");
				int amount2 =scan.nextInt();
				withDraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("******************************");
				getPreviousTransation();
				System.out.println("******************************");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("******************************");
				System.out.println("You have just exit!");
				System.out.println("******************************");
				System.out.println("\n");
				break;
				
			default:
				System.out.println("Invalid option, please try again.");
				break;			
			}		
			
			
		}while(option != 'E');
		
		
		System.out.println("Thank you for using are banking services");
		
		
		
	}
}
