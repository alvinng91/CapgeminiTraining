package banking;

public class Account
{
	private static int idGenerator;
	private int id;
	private double balance;

	{
		id = ++idGenerator;
	}

	public Account(double balance)
	{
		this.balance = balance;
	}

	public int getId()
	{
		return id;
	}

	public double getBalance()
	{
		return balance;
	}

	public boolean Deposit(double amount)
	{
		if (amount > 0)
		{
			this.balance += amount;
			return true;
		}

		return false;
	}

	public boolean Withdraw(double amount)
	{
		if (amount > 0 && amount <= balance)
		{
			this.balance -= amount;
			return true;
		}

		return false;
	}
}
