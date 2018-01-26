
public class ConferenceRoomBookingJob implements Runnable
{
	ConferenceRoom room;
	ProjectManager projectManager;

	ConferenceRoomBookingJob(ConferenceRoom room, ProjectManager projectManager)
	{
		this.room = room;
		this.projectManager = projectManager;
	}

	@Override
	public void run()
	{
		try
		{
			BookRoom();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	void BookRoom() throws InterruptedException
	{
		synchronized (room)
		{
			while (!room.isAvailable())
			{
				System.out.println(Thread.currentThread().getName() + " : Waiting for conference room to be available");
				room.wait();
			}

			room.setAvailable(false);
			room.setProjectManager(projectManager);
			System.out.println(Thread.currentThread().getName() + " : " + room);

			Thread.sleep(5000);

			room.setAvailable(true);
			System.out.println(Thread.currentThread().getName() + " : " + room);
			room.notify();
		}
	}

}
