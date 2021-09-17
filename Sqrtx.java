
public class Sqrtx {

	public int mySqrt(int x) {

		if( x == 0 || x == 1) return x;
		for (int i = 1; i < x; i++) {
			
			if( (i*i) == x )
				return i;
			
			if( i > (x/i) )
				return (i-1);
			
		}
		return -1;
	}
	
	public int mySqrt2(int x) {

		if (x == 0 || x == 1)
			return x;
		for (int i = 1; i <= x; i++) {
			if (i <= (x / i) && (i + 1) > x / (i + 1))
				return i;
		}
		return -1;

	}

	 public static void main(String[] args) {
		 

	        
		
		 int i = 2147395600;
		 System.out.println(i);
		System.out.println(new Sqrtx().mySqrt(8));
		System.out.println(new Sqrtx().mySqrt(4));
	}
	
}
