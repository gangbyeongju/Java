package ch06homework.Excercise19;

public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	private int balance;
	
	public void setBalance(int balance) {
		if(balance < MIN_BALANCE || balance > MAX_BALANCE) {
		} else {
			this.balance = balance;
		}
	}

	public int getBalance() {
		return balance;
	}
}
