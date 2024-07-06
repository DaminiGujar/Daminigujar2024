package basics;

import encapsulation.Encapsulation;

public class MainClass {
	public static void main(String []args){
		
		
		 /*

		Note:- hence we can create multiple objects of same class with different properties.

		* This code also contains an example of Polymorphism .
		* here walk method is example of of it . poly means many and morphs means forms .
		* so this is also called compile time polymorphism .
		* constructor- used to create an object . so whenever we create object using new keyword it gets called.


		*/
		
		System.out.println("Hello world");
		System.out.println();
		
		//creating Obj of class person
		
		Person p1= new Person();
		p1.age= 26;
		p1.name = "Damini";
		System.out.println("A person with name: "+p1.name + " and age is : " + p1.age);
		System.out.println();
		
		
		//creating another obj of same person class with different sates and behaviors
		
		Person p2 = new Person();
		p2.age= 25;
		p2.name="Ram";
		System.out.println("Another person with name:  "+p2.name + " and age is "+ p2.age);
		System.out.println();
		
		
		// calling behaviors/methods
		
		p1.eat();
		System.out.println();
		p2.walk();
		System.out.println();
		p1.walk(100); // calling method with arg
		System.out.println();
		System.out.println("object created for "+ Person.count + " times .");
		System.out.println();
		
		
		// calling parameterizes constuctor
		Person p3= new Person(24 ,"Chirag");
		System.out.println("A person with newName :  "+p3.name + " and age of "+ p3.age);
		System.out.println();
		// after running this constructor or obj . the obj counter shows 2 counts because 
		//here we are calling param constructor
		
		
		// We can call public method from different class and package in any class and package
		System.out.println("Calling function from another package");
	
		Encapsulation obj = new Encapsulation();
		obj.eat();
		
		
	}

}


// Syntax of creating class 

class Person{
	String name;//Properties/state
	int age;
	static int count;   // means its a property of a class not object/method.
	//Check if default constuctor is called or not
	
	
	// Default constuctor
	public Person() {
		count++;
		System.out.println("Default constuctor is called.");
		System.out.println();
	}
	
	
	
	//Parameterized constructor
	public Person(int newAge , String newName) {   
		this();  // use to call another constructor in same class
		
		name= newName;
		age= newAge;
		// here we have provided the initialization
	}
	
	
	
	//Constuctor  Using this keyword
	
//	public Person(int age , String name) {   
//		this();  // use to call another constructor in same class
//		
//		this.name= name;
//		this.age= age;
//		// here we are saying that add age and name values to this class variable age and name.
//	}
	
	
	
	// creating some behaviors/methods
	// no param. arg. method
	void walk() {
		System.out.println(name +" is walking. ");
		System.out.println();
	}
	
	
	// method with param arg
	void walk(int steps) {
		System.out.println(name+ " walked "+ steps +" steps.");
		System.out.println();
	}
	
	
	void eat() {
		System.out.println(name + " is eating.");
		System.out.println();
		
	}
}



