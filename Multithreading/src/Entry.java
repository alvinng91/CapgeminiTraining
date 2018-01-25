import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.PipedInputStream;

import thread.FibonacciThread;
import thread.PrimeThread;

public class Entry
{

	public static void main(String[] args)
	{
		PipedInputStream piStream1 = new PipedInputStream();
		PipedInputStream piStream2 = new PipedInputStream();

		DataInputStream diStream1 = new DataInputStream(piStream1);
		DataInputStream diStream2 = new DataInputStream(piStream2);

		int threshold = Integer.MAX_VALUE / 8;
		Thread primeThread = new PrimeThread(threshold, piStream1);
		primeThread.start();

		Thread fiboThread = new FibonacciThread(threshold, piStream2);
		fiboThread.start();

		try
		{
			int data1 = diStream1.readInt();
			int data2 = diStream2.readInt();

			while (true)
			{
				if (data1 == data2)
				{
					System.out.print(data1 + " ");
					data1 = diStream1.readInt();
					data2 = diStream2.readInt();
				}
				else if (data1 < data2)
				{
					data1 = diStream1.readInt();
				}
				else
				{
					data2 = diStream2.readInt();
				}
			}
		}
		catch (EOFException eof)
		{

		}
		catch (IOException e)
		{
			// e.printStackTrace();
		}
		finally
		{
			try
			{
				diStream1.close();
				diStream2.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("\nend of main thread running");
	}

}
