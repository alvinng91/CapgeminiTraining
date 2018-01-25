package thread;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PrimeThread extends Thread
{
	private int endNum;
	private PipedOutputStream pOut;
	private DataOutputStream out;

	public PrimeThread(int num, PipedInputStream snk)
	{
		this.endNum = num;
		try
		{
			// pOut.connect(snk);
			pOut = new PipedOutputStream(snk);
			out = new DataOutputStream(pOut);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void run()
	{
		try
		{
			for (int i = 2; i < endNum; ++i)
			{
				// primeNums += isPrime(i) ? i + " " : "";
				if (isPrime(i))
				{
					out.writeInt(i);
					out.flush();
				}
			}
		}
		catch (IOException e)
		{
			// e.printStackTrace();
		}
		finally
		{
			try
			{
				if (out != null)
					out.close();
			}
			catch (IOException e)
			{
				// e.printStackTrace();
			}
		}

	}

	private boolean isPrime(int num)
	{
		for (int i = 3; i * i < num; i += 2)
		{
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
