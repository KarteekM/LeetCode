
public class LemonadeChange {
	public boolean lemonadeChange(int[] bills) {

		int tens = 0;
		int fives = 0;
		
		if(bills.length <= 0 || bills[0] > 5 )
			return false;
		
		for (int i = 0; i < bills.length; i++) {
			if (bills[i] == 5) {
				fives++;
			}

			else if (bills[i] == 10) {
				fives--;
				tens++;
				if (fives < 0) {
					return false;
				}
			}

			else {
				// Try to be greedy
				if (tens > 0 && fives > 0) {
					tens--;
					fives--;
				} else if (fives > 3) {
					fives = fives - 3;
				} else {
					return false;
				}

			}
		}

		return true;
	}

	public static void main(String[] args) {

		int input1[] = { 5, 5, 5, 10, 20 };
		System.out.println(new LemonadeChange().lemonadeChange(input1));

		int input2[] = { 5, 5, 10, 10, 20 };
		System.out.println(new LemonadeChange().lemonadeChange(input2));

	}
}
