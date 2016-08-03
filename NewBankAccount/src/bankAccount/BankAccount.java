package bankAccount;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.Writer;

/** 
 * @author Javier
 * @version 0.5
 */

/*
 * First attempt of using the Array List to create an Array of unknown size.
 * 
 * http://stackoverflow.com/questions/15423483/how-to-create-an-arraylist-class-that-can-store-multiple-objects
 */
public class BankAccount {

	private double balance = 0.0; 		// Initial balance is set to zero
	private String owner = "NoName";	// Name of owner

	static List<BankAccount> users_obj = new ArrayList<BankAccount>();
	private static Scanner input;
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
	 *  Method for Checking the user data base for duplicates
	 * @param a 	The user input
	 * @return		Value indicating if the user already exist(1) or don't(0) 
	 */
	public static int CheckUsername(String a)  
	{    
		for (int i=0; i <users_obj.size(); i++) {
			if (users_obj.get(i).owner.equals(a)){
				System.out.println("User already exist");
				return 1;
			}
		}
		return 0; // no Customer found with this ID; maybe throw an exception
	}
	public static void userInternalDatabase (BankAccount info) {

		System.out.println("--- User Information ---\nName: " + info.owner);
		System.out.println("Balance: $" + info.balance);

	}

	public static void addUser(double initialBalance, String name) {

		BankAccount NewBankAccount = new BankAccount();
		NewBankAccount.owner = name;
		NewBankAccount.balance = initialBalance;
		users_obj.add(NewBankAccount);

	}

	public static String test_io_str(){

		input = new Scanner(System.in);
		String menu_sel = "0";
		boolean successfulinput = false;
		while(!successfulinput) { 
			try { 
				menu_sel = input.nextLine();
				successfulinput=true;
			}catch(java.util.InputMismatchException ex) { 
				input.nextLine();
				System.out.println("Error Code: " + ex + "\nYou must enter a valid action");  
			}  
		}
		return menu_sel;
	}
	public static int test_io(){

		input = new Scanner(System.in);
		int menu_sel = 0;
		boolean successfulinput = false;
		while(!successfulinput) { 
			System.out.println("Enter the # for desired action");
			try { 
				menu_sel = input.nextInt();
				successfulinput=true;
			}catch(java.util.InputMismatchException ex) { 
				input.nextLine();
				System.out.println("Error Code: " + ex + "\nYou must enter a valid action");  
			}  
		}
		return menu_sel;
	}
	public static int test_io_dw(){

		input = new Scanner(System.in);
		int menu_sel = 0;
		boolean successfulinput = false;
		while(!successfulinput) { 
			try { 
				menu_sel = input.nextInt();
				successfulinput=true;
			}catch(java.util.InputMismatchException ex) { 
				input.nextLine();
				System.out.println("Error Code: " + ex + "\nYou must enter a valid action");  
			}  
		}
		return menu_sel;
	}

	public static void menu(){
		String[] menu = {"*** Bank Account Managing Example ***","Main Menu", "1 = Create New User","2 = List Created Users",
				"3 = Edit User","4 = Show User Info", "0 = Quit"};
		int i;

		for(i = 1; i < menu.length; i++){
			System.out.println(menu[i]);	
		}	
	}

	public static Object findUsername(String a)  
	{    
		for (int i=0; i <users_obj.size(); i++) {
			if (users_obj.get(i).owner.equals(a)){
				return users_obj.get(i).owner;
			}
		}
		System.out.println("User Don't Exist");
		return null;
	}

	public static Object findUsername_Balance(String a)  
	{    
		for (int i=0; i <users_obj.size(); i++) {
			if (users_obj.get(i).owner.equals(a)){
				return users_obj.get(i).balance;
			}
		}
		System.out.println("User Don't Exist");
		return null;
	}

	public static Object findUsername_obj(String a)  
	{    
		for (int i=0; i <users_obj.size(); i++) {
			if (users_obj.get(i).owner.equals(a)){

				return users_obj.get(i);
			}
		}
		return null;
	}

	public static int findUsername_num(String a)  
	{    
		for (int i=0; i <users_obj.size(); i++) {
			if (users_obj.get(i).owner.equals(a)){

				return i;
			}
		}
		return 0;
	}


	public static void main(String[] args){


		Scanner s = new Scanner(System.in);

		String[] menu = {"*** Bank Account Managing Examp ***"};
		String[] op1 = {"Enter name of New User: "};
		int i, menu_sel = 0, num_user_created = 0, duplicate = 0, action_sel = 0, User_Check_num;
		String user_name, force_duplicate;
		Object User_Check, User_Check_Obj, User_Check_Balance;
		double balance, deposit, withdraw;

		List<String> users = new ArrayList<String>();

		System.out.println(menu[0] + "\n---------");

		menu();

		menu_sel = test_io();

		while(menu_sel != 0){

			if(menu_sel == 1){

				System.out.print(op1[0]);
				user_name = test_io_str();
				duplicate = CheckUsername(user_name);
				if(duplicate != 1){
					System.out.print("Enter Initial Balance: $" );
					balance = s.nextDouble();
					addUser(balance, user_name);
					userInternalDatabase (users_obj.get(num_user_created));
					num_user_created++;
				}
				else{
					System.out.print("Force Duplicate (Y/N): ");
					force_duplicate = test_io_str();
					if(force_duplicate.equals("Y")){
						System.out.println(op1[0]);
						user_name = test_io_str();
						System.out.println("Enter Initial Balance: " );
						balance = s.nextDouble();
						addUser(balance, user_name);
						userInternalDatabase (users_obj.get(num_user_created));
						num_user_created++;
					}	
					else System.out.println("Returning to previous Menu");
				}
				System.out.println("-------------");
			}

			else if(menu_sel == 2){

				for(i = 0; i < users_obj.size(); i++){
					System.out.println("User" + (i+1) + ": " + users_obj.get(i).owner);
				}

				System.out.println("Total Users: " + users_obj.size());
			}

			else if(menu_sel == 3){

				System.out.print("Enter UserName: ");
				user_name = s.next();

				User_Check = findUsername(user_name);

				if(User_Check != null){

					User_Check_Obj = findUsername_obj(user_name);
					User_Check_num = findUsername_num(user_name);
					User_Check_Balance = findUsername_Balance(user_name);
					System.out.println("User " + User_Check + " Identified");
					System.out.println("Balance: $"+ User_Check_Balance);
					System.out.println("1 = Deposit\n2 = Withdrawn\n0 = Return");
					action_sel = test_io_dw();
					while(action_sel != 0){
						if(action_sel == 1){
							System.out.println("** Make a Deposit to account ***");
							System.out.print("Enter the money to be deposited: $");
							deposit = s.nextDouble();
							users_obj.get(User_Check_num).deposit(deposit);			
						}
						if(action_sel == 2){
							System.out.println("** Withdrawn Money from account ***");
							System.out.print("Enter the money to be withdrawn: $");
							withdraw = s.nextDouble();
							users_obj.get(User_Check_num).withdraw(withdraw);	
						}
						else System.out.println("Retunring to previous menu");
					}
				}
				else System.out.println("Returning to previous menu");

			}

			else if(menu_sel == 4){

				System.out.print("Enter UserName: ");
				user_name = s.next();

				if( users.contains(user_name) == true){

					System.out.println("User" + (users.indexOf(user_name)+1) + " Identified" );
					System.out.println("User: "+ (users.get(users.indexOf(user_name)))  ) ;
					System.out.println("Balance: " + (users.get(users.indexOf(user_name))));

				}

				else System.out.println("User not found");
			}
			else {
				System.out.println("Error: Command Not Found");
			}

			System.out.println("");
			menu();
			menu_sel = test_io();
		}

		System.out.print("Ending Application...");
		s.close();
		System.out.print("Done!");
	}
}

