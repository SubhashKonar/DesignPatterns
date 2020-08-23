package com.learn.creational.abstractfactory;

public class BothToyFactory implements ToyFactory {

	public Toy create(ToyName name) {
		
		switch(name)
		{
		case FLYCAR:return new FlyingCar();
		}
		
		return null;
	}

}
