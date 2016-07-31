package bankaccount;
import java.util.Scanner;

/**
 * 
 * @author Javier
 *
 * A bank account has a balance and an owner who can make
 * deposits to and withdrawals from the account.
 *
 */

public class BankAccount {
	
	private double balance = 0.0; 		// Initial balance is set to zero
	private String owner = "NoName";	// Name of owner

	/**
	 *  Default constructor for a bank account with zero balance
	 */
	public BankAccount() {}
	
	/**
	 *  Construct a balance account with a given initial balance and owner's name
	 *  @param initialBalance  		the initial balance
	 *  @param name					name of owner
	 */
	
	public BankAccount(double initialBalance, String name) {
		balance = initialBalance;
		owner = name;
	}
	
	/**
	 *  Method for depositing money to the bank account
	 *  @param	dAmount		the amount to be deposited
	 */
	public void deposit(double dAmount){
		balance = balance + dAmount;
	}
	
	/**
	 *  Method for withdrawing money from the bank account
	 *  @param	wAmount		the amount to be withdrawn
	 */
	public void withdraw(double wAmount) {
		balance = balance - wAmount;
	}
	/**
	 *  Method for getting the current balance of the bank account
	 *  @return 	the current balance
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * 	Main method for testing the bank account
	 */
	public static void main(String[] args){
		BankAccount testAccount = new BankAccount();
		testAccount.deposit(100);
		testAccount.withdraw(50);
		
		System.out.println(testAccount.owner + "'s account has a balance of $" + testAccount.balance);
		BankAccount myAccount = new BankAccount(100, "JAV");
		myAccount.deposit(100);
		myAccount.withdraw(50);
		System.out.println(myAccount.owner + "'s account has a balance of $" + myAccount.balance);
	}
	
	
	
	
	
	
	
	
}
