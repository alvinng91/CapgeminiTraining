package com.cg.beans;

// Eclipse uses incremental compiler

abstract public class Animal extends Object
{
	public Animal()
	{
		System.out.println("instantiating Animal type....");
	}

	abstract public void eat();

	abstract public void sleep();

	abstract public void roam();

}
