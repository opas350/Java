package bankAccount;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Javier
 * 
 * First attempt of using the Array List to create an Array of unknown size.
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
	
	



	public static void main(String[] args){


		Scanner s = new Scanner(System.in);

		String[] menu = {"*** Array List Experiment ***","Main Menu", "1 = Create New User","2 = List Created Users",
						 "3 = Edit User","4 = Show User Info", "0 = Quit"};
		String[] op1 = {"Enter name of New User: "};
		int i, menu_sel = 0, num_user_created = 0;
		String user_name;

		List<String> users = new ArrayList<String>();
		List<Object> users_obj = new ArrayList<Object>();
		
		System.out.println(menu[0] + "\n---------");

		for(i = 1; i < menu.length; i++){
			System.out.println(menu[i]);	
		}
		menu_sel = s.nextInt();

		while(menu_sel != 0){
			
			if(menu_sel == 1){

				System.out.println(op1[0]);
				user_name = s.next();
				BankAccount user_created= new BankAccount( 0.0 , user_name);
				users_obj.add(user_created);
				users.add(user_name);
				System.out.println("User " + users_obj.get(num_user_created) + " Created");
				System.out.println("User " + users.get(num_user_created) + " Created");
				System.out.println("-------------");
				num_user_created++;
			}

			else if(menu_sel == 2){

				for(i = 0; i < users.size(); i++){
					System.out.println("User" + (i+1) + ": " +users.get(i));
					System.out.println("User" + (i+1) + ": " +users_obj.get(i));
				}
				
				System.out.println("Total Users: " + users.size());
			}
			
			else if(menu_sel == 3){
				
				System.out.print("Enter UserName: ");
				user_name = s.next();
				
				if( users.contains(user_name) == true){
					
					System.out.println("User" + (users.indexOf(user_name)+1) + " Identified" );
					

				}
				
				else System.out.println("User not found");
			}
			
			else {
				System.out.println("Error: Command Not Found");
			}

			System.out.println("");
			for(i = 1; i < menu.length; i++){
				System.out.println(menu[i]);	
			}	
			menu_sel = s.nextInt();



		}
	}
}

