import java.util.Arrays;

public class PlusOne {

	public int[] plusOne(int[] digits) {

		int carryForward = 0;
		for (int i = digits.length - 1; i >= 0; i--) {

			if (i == digits.length - 1 ) {
			   if( digits[i] == 9 ) {
				   carryForward = 1; 
			   }
			   else {
				   digits[i] = digits[i] + 1;
				   carryForward = 0;
				   continue;
			   }
				
			}

			if (carryForward == 1) {

				if (digits[i] == 9) {
					digits[i] = 0;
					if (i == 0) {
						int[] newDigits = new int[digits.length + 1];
						newDigits[0] = 1;
						for (int j = 1, k = 0; j < newDigits.length; j++, k++) {
							newDigits[j] = digits[k];
						}
						return newDigits;
					}
				} 
				else {
					digits[i] = digits[i] + 1;
					carryForward = 0;
				}

			}
		}
		return digits;
	}


	public static void main(String[] args) {
		int digits[] = { 1, 2, 3 };
		Arrays.stream(new PlusOne().plusOne(digits)).forEach(i -> System.out.println(i));
		System.out.println("==============");
		int digits2[] = { 4, 3, 2, 1 };
		Arrays.stream(new PlusOne().plusOne(digits2)).forEach(i -> System.out.println(i));
		System.out.println("==============");
		int digits3[] = { 0 };
		Arrays.stream(new PlusOne().plusOne(digits3)).forEach(i -> System.out.println(i));
		System.out.println("==============");
		int digits4[] = { 9 };
		Arrays.stream(new PlusOne().plusOne(digits4)).forEach(i -> System.out.println(i));
		System.out.println("==============");
		int digits5[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		Arrays.stream(new PlusOne().plusOne(digits5)).forEach(i -> System.out.println(i));

	}

}
