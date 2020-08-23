# Design Patterns in Java
Design patterns represent the best practices used by experienced object-oriented software developers. Design patterns are solutions to general problems that software developers faced during software development.

## Creational Design Pattern
1. Singleton Pattern.
2. Factory Pattern.
3. Builder Pattern.
4. Abstract Factory Pattern.
5. Prototype Pattern.

### Singleton Pattern
Singleton Pattern says that just "define a class that has only one instance 
and provides a global point of access to it".

In Simple words.

*  Create an Object once and use it where ever required. Eg- Logging,Session etc
	
![](https://github.com/SubhashKonar/DesignPatterns/blob/master/CreationalPatterns/target/classes/com/learn/creational/single/SingleTon.jpg)

---
### Factory Pattern.
A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class.
The Factory Method Pattern is also known as Virtual Constructor.

![](https://github.com/SubhashKonar/DesignPatterns/blob/master/CreationalPatterns/target/classes/com/learn/creational/factory/FactoryPattern.jpg)
---
### Abstract Factory Pattern.
Abstract Factory Pattern says that just define an interface or abstract class for creating families of related (or dependent) objects but without specifying their concrete sub-classes.That means Abstract Factory lets a class returns a factory of classes. So, this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern.
An Abstract Factory Pattern is also known as Kit.

![](https://github.com/SubhashKonar/DesignPatterns/blob/master/CreationalPatterns/target/classes/com/learn/creational/abstractfactory/AbstractFactory.jpg)
---
### Builder Pattern.
Builder Pattern says that "construct a complex object from simple objects using step-by-step approach"

![](https://github.com/SubhashKonar/DesignPatterns/blob/master/CreationalPatterns/target/classes/com/learn/creational/builder/Builder.jpg)
---
### Prototype Pattern.
Prototype Pattern says that cloning of an existing object instead of creating new one and can also be customized as per the requirement.

![](https://github.com/SubhashKonar/DesignPatterns/blob/master/CreationalPatterns/target/classes/com/learn/creational/prototype/Prototype.jpg)
---

## Structural design patterns
Structural design patterns are concerned with how classes and objects can be composed, to form larger structures.
The structural design patterns simplifies the structure by identifying the relationships.

These patterns focus on, how the classes inherit from each other and how they are composed from other classes.

1. Adapter Pattern
<!-- 2. Bridge Pattern
3. Composite Pattern
4. Decorator Pattern
5. Facade Pattern
6. Fly-weight Pattern
7. Proxy Pattern -->

### Adapter Pattern 
Adapter pattern works as a bridge between two incompatible interfaces. This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.

In the given example we have a standard File Editor which will edit txt and doc file.
Client requested for another file type to be added to the functionality.

`AdvanceEditor` Interface has the functionality which client requested.So we will create an AdaptorClass which will implements the FileEditor and use this Advance editors implementation to achieve the functionality requested by Client.  
Here in our case FileEditorAdapter.class works as a bridge between two incompatible interfaces

![](https://github.com/SubhashKonar/DesignPatterns/blob/master/StructuralPattern/target/classes/com/learn/adapter/Adapter.jpg)

[Reference](https://www.javatpoint.com/design-patterns-in-java)
