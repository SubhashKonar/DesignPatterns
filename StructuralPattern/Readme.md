#Structural design patterns
Structural design patterns are concerned with how classes and objects can be composed, to form larger structures.
The structural design patterns simplifies the structure by identifying the relationships.

These patterns focus on, how the classes inherit from each other and how they are composed from other classes.

##Patterns
*	Adapter Pattern 

	Adapter pattern works as a bridge between two incompatible interfaces. This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.

	In the given example we have a standard File Editor which will edit txt and doc file.
	Client requested for another file type to be added to the functionality.
	
	' AdvanceEditor ' Interface has the functionality which client requested.So we will create an AdaptorClass which will implements the FileEditor and use this Advance editors implementation to achieve the functionality requested by Client.  
	Here in our case FileEditorAdapter.class works as a bridge between two incompatible interfaces
	![](https://github.com/SubhashKonar/DesignPatterns/blob/master/StructuralPattern/target/classes/com/learn/adapter/Adapter.jpg)