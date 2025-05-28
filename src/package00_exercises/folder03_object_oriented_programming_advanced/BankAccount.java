package package00_exercises.folder03_object_oriented_programming_advanced;

public class BankAccount {
	private long accountNumber;
	private String accountName;
	private double accountBalance;
	
	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Cannot deposit $" + amount);
		} else {
			accountBalance += amount;
			System.out.println("Successfully deposited $" + amount);			
		}
	}
	
	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Cannot withdraw $" + amount);
		} else {
			accountBalance -= amount;
			System.out.println("Successfully withdawn $" + amount);			
		}
	}
	
	public void displayCurrentBalance() {
		System.out.println("Current balance for " + accountName + ": $" + accountBalance);
	}
	
	// Constructor
	public BankAccount(long accountNumber, String accountName, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
}