package com.learn.creational.abstractfactory;

public class FlyToyFactory implements ToyFactory {

	public Toy create(ToyName name) {
		switch(name)
		{
		
		case COPTER:return new BambooCopter();
		case FLYCAR:return new FlyingCar();
		case PLANE:return new Plane();
		
		}
		return null;
		
	}

}
