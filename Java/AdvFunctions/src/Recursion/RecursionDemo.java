package Recursion;

public class RecursionDemo {
	
	//problem: print hello for 5 times
	
	void print(int n) {
		if(n==0) {
			return;
		}
		
		System.out.println("Hello");
		print(n-1);
	}
	

	public static void main(String[] args) {
		RecursionDemo r1 = new  RecursionDemo();
		r1.print(5);
	
		
		
	}
	
	
	
}
