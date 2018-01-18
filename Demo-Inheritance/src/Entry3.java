import com.cg.beans.Dog;
import com.cg.specs.Pet;

public class Entry3
{

	public static void main(String[] args)
	{
		Pet petRef = getPet();

		petRef.beFriendly();
		petRef.play();
	}

	public static Pet getPet()
	{
		return new Dog();
	}

}
