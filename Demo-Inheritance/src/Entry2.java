import com.cg.beans.Animal;
import com.cg.beans.Dog;

public class Entry2
{

	public static void main(String[] args)
	{
		Animal animal = getAnimal();

		animal.eat();
		animal.sleep();
		animal.roam();
	}

	public static Animal getAnimal()
	{
		return new Dog();
	}

}
