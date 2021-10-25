
public class PowerOfTwo {

	public boolean isPowerOfTwo(int n) {
		
		if(n < 1)
			return false;
	
		if(n == 1)
			return true;
		
		if(n%2 == 0) {
			if(n/2 == 1)
				return true;
			else {
				return isPowerOfTwo(n/2);
			}
		}
		else {
			
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(new PowerOfTwo().isPowerOfTwo(6)); // false
		System.out.println(new PowerOfTwo().isPowerOfTwo(1)); // true
		System.out.println(new PowerOfTwo().isPowerOfTwo(16)); // true
		System.out.println(new PowerOfTwo().isPowerOfTwo(3)); // false
		System.out.println(new PowerOfTwo().isPowerOfTwo(4)); // true
		System.out.println(new PowerOfTwo().isPowerOfTwo(5)); // false
	}

}
