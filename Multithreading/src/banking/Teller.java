package banking;

import java.util.Random;

public class Teller extends Thread
{
	private Bank bank;
	private int numIterations;

	public Teller(Bank bank, int numIterations)
	{
		this.bank = bank;
		this.numIterations = numIterations;
	}

	@Override
	public void run()
	{
		for (int i = 0; i < numIterations; ++i)
			PerformTransfer();
	}

	private void PerformTransfer()
	{
		Random rand = new Random();

		bank.transferAmount(bank.GetRandomAccount(), bank.GetRandomAccount(), rand.nextDouble() * 100);
	}

}
