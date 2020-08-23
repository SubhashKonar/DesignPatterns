package com.learn.creational.abstractfactory;

public class RunToyFactory implements ToyFactory{

	public Toy create(ToyName name) {
		switch(name)
		{
		case CAR:return new Car();
		
		case FLYCAR:return new FlyingCar();
		
		case TRAIN:return new Train();
		}
		return null;
	}

}
