package bankAccount;
import java.util.Scanner;
import java.util.List;

//Erase this line
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
	
		Scanner s = new Scanner(System.in);
		int i, menu_num, user_num = 0;
		boolean first_run = false;
		String[] menu = {"Main Menu","Press # corresponding the desired action: ", 
						"1 = Show number of users","2 = Create New User"};
		String[] users;
		System.out.println("*** Bank Account Example ***");
		for(i = 0; i < 4; i++){
		System.out.println(menu[i]);
	
		}
		
		menu_num = s.nextInt();
		
		if(menu_num != 0){
			
			if(menu_num == 1){
				
					if(first_run == false){
						
						BankAccount testAccount = new BankAccount();
						System.out.println("On first boot no accounts created\nOwner: "
								+ testAccount.owner + "\nBalance: " + testAccount.balance);
						
					}
				
			}
			
			if(menu_num == 2){
				System.out.println("Enter username: ");
				users[user_num] = s.nextLine();
				System.out.println("Enter Initial Balance: ");
			}
			
		}
		
		
	}
	
		/*
		BankAccount testAccount = new BankAccount();
		testAccount.deposit(100);
		testAccount.withdraw(50);
		
		System.out.println(testAccount.owner + "'s account has a balance of $" + testAccount.balance);
		BankAccount myAccount = new BankAccount(100, "JAV");
		myAccount.deposit(100);
		myAccount.withdraw(50);
		System.out.println(myAccount.owner + "'s account has a balance of $" + myAccount.balance);
	
		System.out.println("*** Bank Account Example ***");
		System.out.println("");
	
	*/
	
	
	
	
	
	
	
	

}
