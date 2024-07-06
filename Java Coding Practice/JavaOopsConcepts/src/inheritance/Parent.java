package inheritance;

public class Parent {
	
	/*
	 * Inheritance is nothing but child class can access properties and behaviors of parent class.
	 * here we have created methods in parent class .
	 * child class is extends parent class
	 * so, we have created the obj of child class and are accessing the methods 
	 * Object class is super parent of all class
	 */
	
	String Pname;
	int Page;
	
	public Parent() {
		
		System.out.println(" Parent Default constuctor is called.");
		System.out.println();
	}
	
	public Parent(String name, int age) {
		this.Pname = name;
		this.Page = age;
		System.out.println(" Parent parameterized constuctor called.");
		System.out.println();
	}
	
	
	void walk() {
		System.out.println(Pname + " is walking. ");
		System.out.println();
	}
	
	
	void eat() {
		System.out.println(Pname + " is eating. ");
		System.out.println();
	}

}



// creating child class
class Child extends Parent{
	
	// param constructor
	public Child(String name, int age) {
		super(name,age);// super keyword calls parent class constructor.
		System.out.println(" Child's param constructor called.");
		System.out.println();
		
	}
	
	void walk() {  // this is example of run time polymorphism.
		
		System.out.println(Pname + " is walking from child only. ");
		System.out.println();
	}
	
	void run() {
		
		System.out.println(Pname +" is running.");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Child c1 = new Child("damini",27);// created obj of child
		c1.eat();
		c1.walk();
		c1.run();
		
	}

	
	
}
