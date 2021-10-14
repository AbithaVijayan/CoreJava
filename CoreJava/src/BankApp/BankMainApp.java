package BankApp;


import java.util.*;

public class BankMainApp {
	static int cursor = 1;
	static List<Users> users = new ArrayList<Users>();

	public static void main(String[] args) {
		users.add(new Users("Abitha", "Bangalore", "7892884110", "abitha123", "Abi@123", 20000, "05-10-2021"));
		users.add(new Users("Nancy", "Mysore", "9632199898", "nancy123", "Nancy@123", 10000, "05-09-2021"));
		
		selectOpt();
	}

	static void selectOpt() {
		EnterBOption Eo = new EnterBOption();
		int option = Eo.selectOption();
		switch (option) {
		case 1:
			RegisterAccount rg = new RegisterAccount(users);
			rg.enterDetails();
			selectOpt();
			break;
		case 2:
			 Login lg = new Login(users);
			 lg.loginAcc();
			break;
		case 3:

			break;
		case 4:
			System.out.println("Your exit from application");
			break;
		}

	}
}

