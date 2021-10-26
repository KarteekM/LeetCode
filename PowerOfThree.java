
public class PowerOfThree {

	public boolean isPowerOfThree(int n) {
		
		if(n < 1 || n == 2)
			return false;
	
		if(n == 1)
			return true;

		if(n%3 == 0) {
			if(n/3 == 1)
				return true;
			else {
				return isPowerOfThree(n/3);
			}
		}
		else {
			return false;
		}
		
	}
	
public boolean isPowerOfThree2(int n) {
	return (n<1 || n == 2)?false:(n%3 == 0?((n/3 == 1?true:isPowerOfThree2(n/3))):false);
	
}
	
	public static void main(String[] args) {
		
		System.out.println(new PowerOfThree().isPowerOfThree2(27)); // true
		System.out.println(new PowerOfThree().isPowerOfThree2(0)); // false
		System.out.println(new PowerOfThree().isPowerOfThree2(9)); // true
		System.out.println(new PowerOfThree().isPowerOfThree2(45)); // false
		System.out.println(new PowerOfThree().isPowerOfThree2(2)); // false
		System.out.println(new PowerOfThree().isPowerOfThree2(-9)); // false
	}

}
