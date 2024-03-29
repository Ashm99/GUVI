package question3;

// ACCOUNT CLASS WITH DATA MEMBER BALANCE
public class Main3 {
	public static class Account{
		private int accountNo;
		private double balance;
		
		Account(){ //no argument constructor
			this.accountNo = -1;
			this.balance = 0;
		}
		//two argument constructor
		Account(int accNo, double bal){ 
			this.accountNo = accNo;
			this.balance = bal;
		}
		//method to deposit amount into the account
		public void deposit(double amount) {
			this.balance += amount;
			System.out.format("Deposit successful!\nCurrent balance: Rs. %.2f\n\n", balance);
		}
		
		//method to withdraw amount from the account
		public void withdraw(double amount) {
			this.balance -= amount;
			System.out.format("Withdraw successful!\nRemaining balance: Rs. %.2f\n\n", balance);
		}
		
		//display the balance of the given account
		public void displayBalance() { 
			System.out.println("Account number: " + accountNo);
			System.out.format("Balance: Rs. %.2f\n", balance);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		//A dummy account to check the execution of the no argument constructor
		Account a1 = new Account(); 
		a1.displayBalance();
		
		//Creating an object and invoking methods
		Account a2 = new Account(421001, 1000);
		a2.displayBalance();
		a2.deposit(1000);
		a2.withdraw(600);
		a2.displayBalance();
	}

}
