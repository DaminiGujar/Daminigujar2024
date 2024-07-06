package lambdaDemo;

import java.util.function.Consumer;

public class LambdaDemo {
	
	    public static void main(String[] args) {
	    	
	    	
	    	LambdaInterface data = ()-> "Printing data using Lambda function with interface." ;
	    	
	    	System.out.println(data.printData());
	    	System.out.println();
	    	
	    	
//	    	Consumer<String >printName = name -> System.out.println(name); 
//	    	printName.accept("Damini");
//	    	System.out.println();
//	    	
	    	
	    	
	    	//Using Predefined interface(Runnable)
	    	
	    	Runnable runnable = () -> {
	    		
	    		for(int i =1; i<=5; i++) {
	    			System.out.println("Hello " + i);
	    		}
	    	};
	    	
	    	Thread thread = new Thread(runnable);
	    	thread.run();
	    	System.out.println();
	    	
	    	Thread t1 = new Thread(runnable);
	    	t1.run();
	    	
	   
	       
	}
	    
	   
}
