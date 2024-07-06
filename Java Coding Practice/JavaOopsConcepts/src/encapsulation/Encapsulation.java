package encapsulation;

public class Encapsulation {
	// Encapsulation means binding of  data bu hiding internal implementaion .
	// provide access through getter and setter.
	
	/*   example of access modifiers
	private void doWork1() {
		System.out.println("Doing work from private method.");
		
	}*/
	
	public void eat() {
		System.out.println("Doing work from private method.");
		
	}
	

	
	

	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.setPrice(40000);
		
		

	}

}

class Laptop{
	int ram;
	private int price; // making private means hiding data.
	//to access it we need setter method
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}