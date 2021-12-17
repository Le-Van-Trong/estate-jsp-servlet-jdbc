package banvien;

public class Account {
	private double balance;
	public Account (double initialBalance )
	{
		if ( initialBalance > 0.0 )
			balance = initialBalance;
	}

	public void credit(double amount )
	{
		balance = balance + amount; // add amount to balance
	}

	public double getBalance()
	{
		return balance; // gives the value of balance to the calling method
	}
}
