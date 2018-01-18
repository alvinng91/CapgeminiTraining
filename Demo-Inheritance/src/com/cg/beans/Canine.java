package com.cg.beans;

public abstract class Canine extends Animal
{
	public Canine()
	{
		System.out.println("instantiating Canine type....");
	}

	@Override
	public final void roam()
	{
		System.out.println("It is roaming in groups...");
	}

	@Override
	abstract public void eat();

	@Override
	abstract public void sleep();

	abstract public void eat(String food);

}
