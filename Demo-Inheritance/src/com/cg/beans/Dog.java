package com.cg.beans;

import com.cg.specs.Pet;

public final class Dog extends Canine implements Pet
{
	public Dog()
	{
		System.out.println("instantiating Dog type....");
	}

	@Override
	public void sleep()
	{
		System.out.println("Dog is sleeping");
	}

	@Override
	public void eat()
	{
		System.out.println("Dog is eating");

	}

	@Override
	public void eat(String food)
	{
		System.out.println("Dog is eating " + food);
	}

	public void roamInGroups()
	{
		System.out.println("It is roaming with a group");

	}

	@Override
	public void beFriendly()
	{
		System.out.println("Dog is friendly");
	}

	@Override
	public void play()
	{
		System.out.println("Dog is playing with you");
	}

}
