package com.learn.creational.abstractfactory;

public abstract class AbstractToyFactory {

	public static ToyFactory getToyFactory(ToyTypeEnum type)
	{
		switch(type)
		{
		case BOTH:return new BothToyFactory();
		case FLY: return new FlyToyFactory();
		case RUN:return new RunToyFactory();
		}
		
		return null;
	}
}
