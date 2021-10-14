
public class FibonacciNumber {
	
	 //Recursion
	 public int fib(int n) {
		 	
		 if(n == 0 || n == 1)
			 return n;
		  
		 return fib(n-1) + fib(n-2);
	        
	    }
	 
	 //Iteration
	 public int fib2(int n) {
		
		 if(n < 2)
		 return n;
	     
		 int a = 0;
		 int b = 1;
		 int temp;
				
		 
		 for(int i=1;i<n;i++) {
			 temp = a;
			 a = b;
			 b = b + temp;
		 }
		 
		 return b;
	    }
	 
	 public static void main(String[] args) {
		 
		 System.out.println(new FibonacciNumber().fib2(3));
		 System.out.println(new FibonacciNumber().fib(3));
		
	}

}
