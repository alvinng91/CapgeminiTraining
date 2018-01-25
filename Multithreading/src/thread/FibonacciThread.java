package thread;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class FibonacciThread extends Thread
{

	private PipedOutputStream pOut;
	private DataOutputStream out;
	private int fNum;

	public FibonacciThread(int num, PipedInputStream snk)
	{
		this.fNum = num;
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
		int i0 = 0, i1 = 1;

		for (int i = 0; i <= fNum; ++i)
		{
			int iNum;
			if (i == 0)
			{
				iNum = i0;
			}
			else if (i == 1)
			{
				iNum = i1;
			}
			else
			{
				iNum = i0 + i1;
				i0 = i1;
				i1 = iNum;
			}

			try
			{
				out.writeInt(iNum);
				out.flush();
			}
			catch (IOException e)
			{
				// e.printStackTrace();
			}
		}

	}
}
