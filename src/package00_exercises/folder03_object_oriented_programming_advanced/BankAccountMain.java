package package00_exercises.folder03_object_oriented_programming_advanced;

public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount bA1 = new BankAccount(250973185, "Nic", 12000);
		bA1.displayCurrentBalance();
		bA1.withdraw(2000);
		bA1.displayCurrentBalance();
		bA1.deposit(-10);
		bA1.displayCurrentBalance();
		bA1.deposit(1000);
		bA1.displayCurrentBalance();
	}
}