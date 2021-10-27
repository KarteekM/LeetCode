
public class PowerOfFour {

	public boolean isPowerOfFour(int n) {

		if (n == 1) {
			return true;
		}

		else if (n < 4) {
			return false;
		}

		else if (n % 4 == 0) {
			return isPowerOfFour(n / 4);
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		System.out.println(new PowerOfFour().isPowerOfFour(16)); // true
		System.out.println(new PowerOfFour().isPowerOfFour(0)); // false
		System.out.println(new PowerOfFour().isPowerOfFour(1)); // true
		System.out.println(new PowerOfFour().isPowerOfFour(100)); // false
		System.out.println(new PowerOfFour().isPowerOfFour(123)); // false
	}

}
