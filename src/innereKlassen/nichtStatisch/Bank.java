package innereKlassen.nichtStatisch;

public class Bank {

	private double balance;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Bank(double balance) {
		super();
		this.balance = balance;
	}
	
	public void showBalance() {
		System.out.println("Aktueller Kontostand: " + this.balance);
	}
	
	public class Account {
		public void deposit(double amount) {
			Bank.this.balance += amount;
			System.out.println(amount + " Euro eingezahlt.");
		}
	}

	public static void main(String[] args) {
		Bank b = new Bank(100000);
		Account a = b.new Account();
		a.deposit(2000);
		b.showBalance();
	}
}
