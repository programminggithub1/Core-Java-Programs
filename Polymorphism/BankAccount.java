package Polymorphism;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

class BankAccount 
{
	int accnumber;
	String holdername;
	double currentBalance;

	BankAccount() 
	{
		super();
		System.out.println("BankAccount default constructor");
		this.accnumber =111;
		this.holdername ="shruti";
		this.currentBalance = 10000;
	}

	BankAccount(int accnumber, String holdername, double currentBalance) 
	{
		System.out.println("BankAccount parameterized constructor");
		this.accnumber = accnumber;
		this.holdername = holdername;
		this.currentBalance = currentBalance;
	}

	int getAccnumber() {
		return accnumber;
	}

	void setAccnumber(int accnumber) {
		this.accnumber = accnumber;
	}

	String getHoldername() {
		return holdername;
	}

	void setHoldername(String holdername) {
		this.holdername = holdername;
	}

	double getCurrentBalance() {
		return currentBalance;
	}

	void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	
	void withdraw(double currentBalance)
	{
		System.out.println("\nWithdraw amount successfully\n");
	}
	
	void display()
	{
		System.out.println("\nAccount number is : "+this.accnumber);
		System.out.println("Holder Name : "+this.holdername);
		System.out.println("Current Balance : "+this.currentBalance);
	}
	
	
}//BankAccount ends here

class SavingAccount extends BankAccount
{
	
	double minBalance;

	SavingAccount()
	{
		super();
		System.out.println("SavingAccount default constructor");
		this.accnumber = 1111;
		this.holdername = "aniket";
		this.currentBalance = 12000;
		this.minBalance = 5000;
	}

	SavingAccount(int accnumber, String holdername, double currentBalance, double minBalance) 
	{
		super(accnumber,holdername,currentBalance);
		System.out.println("SavingAccount parameterized constructor");
		this.accnumber = accnumber;
		this.holdername = holdername;
		this.currentBalance = currentBalance;
		this.minBalance = minBalance;
	}

	double getMinBalance() {
		return minBalance;
	}

	void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	void withdraw(double currentBalance)
	{
		if(minBalance >5000)
		{
			System.out.println("Withdraw amount successfully by checking min balance\n");
		}
		else
		{
			System.out.println("Can't Withdraw\n");
		}
	}
	
	void display()
	{
		super.display();
		System.out.println("\nMinimum Balance : "+this.minBalance);
	}
}//SavingAccount class ends here

class CurrentAccount extends BankAccount
{
	
	double overdraft;

	CurrentAccount() 
	{
		super();
		System.out.println("CurrentAccount default constructor");
		this.accnumber = 121;
		this.holdername = "Sanket";
		this.currentBalance = 15000;
		this.overdraft = 20000;
	}

	CurrentAccount(int accnumber, String holdername, double currentBalance, double overdraft) 
	{
		super(accnumber,holdername,currentBalance);
		System.out.println("CurrentAccount parameterized constructor");
		this.accnumber = accnumber;
		this.holdername = holdername;
		this.currentBalance = currentBalance;
		this.overdraft = overdraft;
	}

	double getOverdraft() {
		return overdraft;
	}

	void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	void withdraw(double currentBalance)
	{
		if(overdraft<12000)
		{
			System.out.println("Withdraw amount successfully by checking overdraft limit\n");
		}
		else
		{
			System.out.println("Can't Withdraw\n");
		}
	}
	
	void display()
	{
		super.display();
		System.out.println("\nOverDraft is : "+this.overdraft);
	}
	
	
}//CurrentAccount ends here

class SalaryAccount extends BankAccount
{
	
	LocalDate lasttransaction;

	SalaryAccount() 
	{
		super();
		System.out.println("SalaryAccount default constructor");
		this.accnumber = 110;
		this.holdername = "nikita";
		this.currentBalance = 25000;
		this.lasttransaction = LocalDate.now();
	}

	SalaryAccount(int accnumber, String holdername, double currentBalance, LocalDate lasttransaction)
	{
		super(accnumber,holdername,currentBalance);
		System.out.println("SalaryAccount parameterized constructor");
		this.accnumber = accnumber;
		this.holdername = holdername;
		this.currentBalance = currentBalance;
		this.lasttransaction = lasttransaction;
	}

	LocalDate getLasttransaction() {
		return lasttransaction;
	}

	void setLasttransaction(LocalDate lasttransaction) {
		this.lasttransaction = lasttransaction;
	}
	
	void withdraw(double currentBalance)
	{
		LocalDate today=LocalDate.now();
		long diff = ChronoUnit.MONTHS.between(lasttransaction, today);
		//Period diff=Period.between(lasttransaction, today);
		if(diff>=2)
		{
			System.out.println("Withdraw amount successfully by checking difference between two date 2 month");
		}
		else
		{
			System.out.println("Can't Withdraw difference between two date not 2 month");
		}
	}
	
	void display()
	{
		super.display();
		System.out.println("\nLast transaction date : "+this.lasttransaction);
	}
		
}//SalaryAccount ends here

class TestBankAccount
{
	public static void main(String[]args)
	{
		BankAccount b1;
		b1=new BankAccount(11,"prathmesh",10000);
		b1.display();
		b1.withdraw(10000);
		
		b1=new SavingAccount(12,"viraj",20000,6000);
		b1.display();
		b1.withdraw(20000);
		
		b1=new CurrentAccount(13,"rutuja",23000,10000);
		b1.display();
		b1.withdraw(10000);
		
//		LocalDate today=LocalDate.now();
//		LocalDate lasttransaction=LocalDate.of(2025,9, 10);
//		
//		Period diff=Period.between(today, lasttransaction);
		
		b1=new SalaryAccount(14,"pratiksha",24000,LocalDate.of(2025, 10, 10));
		b1.display();
		b1.withdraw(24000);
	}
	
}