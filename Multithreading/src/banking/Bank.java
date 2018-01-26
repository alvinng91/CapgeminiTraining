package banking;

import java.util.Random;

public class Bank
{

	private Account accounts[];

	public Bank(int numAccs)
	{
		Random rand = new Random();
		accounts = new Account[numAccs];
		for (int i = 0; i < accounts.length; ++i)
		{
			accounts[i] = new Account(rand.nextDouble() * 10000);
		}
	}

	synchronized public void transferAmount(Account toAccount, Account fromAccount, double amount)
	{
		if (fromAccount.Withdraw(amount))
		{
			toAccount.Deposit(amount);
		}
	}

	public void showTotalBalance()
	{
		double balance = 0;
		for (Account account : accounts)
		{
			if (account != null)
			{
				balance += account.getBalance();
			}
		}
		System.out.println("Total Balance : " + balance);
	}

	public Account GetRandomAccount()
	{
		Random rand = new Random();
		return accounts[rand.nextInt(accounts.length - 1)];
	}
}
