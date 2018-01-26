import banking.Bank;
import banking.Teller;

public class Entry2
{
	public static void main(String[] args) throws InterruptedException
	{
		Bank bank = new Bank(5);
		bank.showTotalBalance();

		Thread tellers[] = new Teller[2];
		for (int i = 0; i < tellers.length; ++i)
		{
			tellers[i] = new Teller(bank, 55);
			tellers[i].start();
		}

		for (int i = 0; i < tellers.length; ++i)
		{
			tellers[i].join();
		}

		bank.showTotalBalance();
		System.out.println("End of transcation");

	}

}
