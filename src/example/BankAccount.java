package example;
import java.util.*;


public class BankAccount {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	//constructor
	    public BankAccount(int accountNumber, String accountHolder, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		
		this.balance = balance;
	}
	    
	//getter and setter
	    public int getAccountNumber() {
			return accountNumber;
		}

	    public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}

	    
	     public String getAccountHolder() {
			return accountHolder;
		}
	    
	     public void setAccountHolder(String accountHolder) {
			this.accountHolder = accountHolder;
		}

	     public double getBalance() {
			return balance;
		}

	    public void setBalance(double balance) {
			this.balance = balance;
		}
	     
	
    //deposit method
    
    public void deposit(double amount)
    {
    	if(amount>0)
    	{
    		balance+=amount;
    		System.out.println("Deposit successful.New balance:"+balance);
    	}
    	else
    	{
    		System.out.println("Invalid deposit amount.");
    	}
    }
    
    //Withdraw method
    
    public void withdraw(double amount)
    {
    	if(amount>0 && amount<=balance)
    	{
    		balance-=amount;
    		System.out.println("Withdrawal succesful.New balance:"+balance);
    	}
    	else
    	{
    		System.out.println("Invalid withdrawal amount or insufficient funds.");
    	}
    }
    

class Main100
{
	
	public static void main(String[] args) 
	{
		//creating BankAccount object
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter account number:");
		int accountNumber=sc.nextInt();
		
		System.out.println("Enter account holder:");
		String accountHolder=sc.next();
		
		System.out.println("Enter Balance:");
		double balance=sc.nextDouble();
		
		BankAccount b=new BankAccount(accountNumber,accountHolder,balance);
   	 
		System.out.println("Initial balance:"+b.getBalance());		
		System.out.println("Enter deposit amount: ");
    	double depositAmount=sc.nextDouble();
        b.deposit(depositAmount);
  
    	System.out.println("Enter withdraw amount:");
    	double withdraw=sc.nextDouble();
    	b.withdraw(withdraw);
    	 }
     }
}

	