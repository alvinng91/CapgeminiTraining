
public class ConferenceRoom
{
	private boolean isAvailable;
	private ProjectManager projectManager;

	{
		isAvailable = true;
	}

	synchronized public boolean isAvailable()
	{
		return isAvailable;
	}

	synchronized public void setAvailable(boolean isAvailable)
	{
		this.isAvailable = isAvailable;
	}

	public ProjectManager getProjectManager()
	{
		return projectManager;
	}

	synchronized public void setProjectManager(ProjectManager projectManager)
	{
		this.projectManager = projectManager;
	}

	@Override
	synchronized public String toString()
	{
		if (isAvailable())
		{
			return "Conference room is currently available.";
		}
		else
		{
			return "Conference room is currently booked by " + projectManager.getFirstName() + " "
					+ projectManager.getLastName();
		}
	}

}
