package Exceptions;

public class MainClass {

	public static void main(String[] args) throws InsufficientBalanceException {

		BankAccount acc = new BankAccount();
		acc.withdraw(3000);

	}
}