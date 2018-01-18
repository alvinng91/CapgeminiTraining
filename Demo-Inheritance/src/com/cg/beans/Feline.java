package com.cg.beans;

public abstract class Feline extends Animal
{
	public Feline()
	{
		System.out.println("instantiating Feline type....");
	}

	@Override
	public void roam()
	{
		System.out.println("It is not roaming in groups...");
	}

	@Override
	abstract public void eat();

	@Override
	abstract public void sleep();
}
