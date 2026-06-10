package Exceptions;

public class BankAccount {

	double balance = 5000;

	void withdraw(double amount) throws InsufficientBalanceException {

		if(balance < amount) {
			throw new InsufficientBalanceException("Less Balance");
		}

		balance = balance - amount;
		System.out.println(amount + " Withdraw Successfully");
	}
}