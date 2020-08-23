package com.learn.creational.abstractfactory;

public class AbstractToyExample {
	public static void main(String args[])
	{
		ToyFactory tf=AbstractToyFactory.getToyFactory(ToyTypeEnum.BOTH);
		Toy t= tf.create(ToyName.FLYCAR);
		t.description();
		
		 tf=AbstractToyFactory.getToyFactory(ToyTypeEnum.FLY);
		 t= tf.create(ToyName.PLANE);
		t.description();
		
		 tf=AbstractToyFactory.getToyFactory(ToyTypeEnum.RUN);
		 t= tf.create(ToyName.CAR);
		t.description();
	}

}
