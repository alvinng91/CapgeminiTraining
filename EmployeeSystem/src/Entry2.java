public class Entry2
{

	public static void main(String[] args) throws InterruptedException
	{
		ConferenceRoom room = new ConferenceRoom();

		int numManagers = 3;

		Thread t[] = new Thread[numManagers];

		for (int i = 0; i < numManagers; ++i)
		{
			t[i] = new Thread(new ConferenceRoomBookingJob(room,
					new ProjectManager("pm", new Integer(i).toString(), 1000, 'A', new Date(1991, 12, 1))));
		}

		for (int i = 0; i < numManagers; ++i)
		{
			t[i].start();
		}

		for (int i = 0; i < numManagers; ++i)
		{
			t[i].join();
		}

		System.out.println("End of main...");
	}

}
