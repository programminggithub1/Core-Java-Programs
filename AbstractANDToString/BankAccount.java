package AbstractANDToString;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

abstract class BankAccount
{
	int accnumber;
	String holdername;
	double currentBalance;

	BankAccount() // default constructor
	{
		System.out.println("BankAccount default constructor");
		this.accnumber = 111;
		this.holdername = "shruti";
		this.currentBalance = 10000;
	}

	BankAccount(int accnumber, String holdername, double currentBalance) // parameterized constructor
	{
		System.out.println("BankAccount parameterized constructor");
		this.accnumber = accnumber;
		this.holdername = holdername;
		this.currentBalance = currentBalance;
	}

	abstract void withdraw(double currentBalance);  // same as calSalary()

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

	public String toString()
	{
		return "\nAccount Number::" + this.accnumber +
			   " Holder Name::" + this.holdername +
			   " Current Balance::" + this.currentBalance;
	}

}// BankAccount ends here


class SavingAccount extends BankAccount
{
	double minBalance;

	SavingAccount() // default constructor
	{
		super();
		System.out.println("SavingAccount default constructor");
		this.minBalance = 5000;
	}

	SavingAccount(int accnumber, String holdername, double currentBalance, double minBalance)
	{
		super(accnumber, holdername, currentBalance);
		System.out.println("SavingAccount parameterized constructor");
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
		if(minBalance > 5000)
			System.out.println("Withdraw successful by min balance condition");
		else
			System.out.println("Cannot withdraw");
	}

	public String toString()
	{
		return super.toString() + " MinBalance::" + this.minBalance;
	}

}// SavingAccount ends here


class CurrentAccount extends BankAccount
{
	double overdraft;

	CurrentAccount() // default constructor
	{
		super();
		System.out.println("CurrentAccount default constructor");
		this.overdraft = 20000;
	}

	CurrentAccount(int accnumber, String holdername, double currentBalance, double overdraft)
	{
		super(accnumber, holdername, currentBalance);
		System.out.println("CurrentAccount parameterized constructor");
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
		if(overdraft < 12000)
			System.out.println("Withdraw successful by overdraft limit");
		else
			System.out.println("Cannot withdraw");
	}

	public String toString()
	{
		return super.toString() + " Overdraft::" + this.overdraft;
	}

}// CurrentAccount ends here


class SalaryAccount extends BankAccount
{
	LocalDate lasttransaction;

	SalaryAccount() // default constructor
	{
		super();
		System.out.println("SalaryAccount default constructor");
		this.lasttransaction = LocalDate.now();
	}

	SalaryAccount(int accnumber, String holdername, double currentBalance, LocalDate lasttransaction)
	{
		super(accnumber, holdername, currentBalance);
		System.out.println("SalaryAccount parameterized constructor");
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
		LocalDate today = LocalDate.now();
		long diff = ChronoUnit.MONTHS.between(lasttransaction, today);

		if(diff >= 2)
			System.out.println("Withdraw successful (2-month condition passed)");
		else
			System.out.println("Cannot withdraw (2-month condition failed)");
	}

	public String toString()
	{
		return super.toString() + " LastTransaction::" + this.lasttransaction;
	}

}// SalaryAccount ends here


class TestBankAccount
{
	public static void main(String[] args)
	{
		BankAccount b1;

		b1 = new SavingAccount(12, "viraj", 20000, 6000);
		System.out.println(b1);
		System.out.println(b1.toString());
		System.out.println();

		b1 = new CurrentAccount(13, "rutuja", 23000, 10000);
		System.out.println(b1);
		System.out.println(b1.toString());
		System.out.println();

		b1 = new SalaryAccount(14, "pratiksha", 24000, LocalDate.of(2025, 10, 10));
		System.out.println(b1);
		System.out.println(b1.toString());
	}

}
