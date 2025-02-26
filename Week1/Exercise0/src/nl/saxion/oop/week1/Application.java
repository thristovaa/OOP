package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {
	public static void main(String[] args) {
		SaxionApp.start(new Application(), 1000, 1000);
	}

	public void run() {
		/*
		Person p = new Person(19);
		Person p2 = new Person(30);

		p.setName("Raya");
		p.haveBirthday();

		p2.setName("Name");
		p2.haveBirthday();

		//p.setAge(19);
		//p.setAge(-19);

		SaxionApp.printLine(p.getName());
		SaxionApp.printLine(p.getAge());
		SaxionApp.printLine(p);
		*/


		// Create user account
		UserAccount account = readUserAccount();

		SaxionApp.pause();
		SaxionApp.clear();

		SaxionApp.printLine("******* HI-SECURITY LOG IN TERMINAL **********");
		SaxionApp.print("Username: ");
		String username = SaxionApp.readString();
		SaxionApp.print("Password: ");
		String password = SaxionApp.readString();
		SaxionApp.printLine();

		if (username.equals(account.getUsername()) && account.checkPassword(password)) {
			SaxionApp.printLine("******* ACCESS GRANTED **********");
			SaxionApp.setBackgroundColor(Color.GREEN);
		} else {
			SaxionApp.printLine("******* ACCESS DENIED **********");
			SaxionApp.setBackgroundColor(Color.RED);
		}
	}

	private UserAccount readUserAccount() {
		SaxionApp.print("Please enter a new user name: ");
		String username = SaxionApp.readString();

		SaxionApp.print("Please enter a password for user \"" + username + "\": ");
		String password = SaxionApp.readString();

		UserAccount newAccount = new UserAccount(password);
		newAccount.setUsername(username);

		return newAccount;
	}
}
