public class RevereString {

	public void reverseString(char[] s) {

		if (s == null) {
			return;
		}

		int start = 0;
		int end = s.length - 1;
		char temp;

		while (start <= end) {
			temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start++;
			end--;
		}
		// IntStream.range(0, s.length).mapToObj(i ->
		// s[i]).forEach(System.out::println);
	}

	public void reverseString2(char[] s) {

		s = reverseString(String.valueOf(s)).toCharArray();
	}

	private String reverseString(String stringToBeReversed) {

		if (stringToBeReversed == null)
			return null;

		if (stringToBeReversed.length() <= 1) {
			return stringToBeReversed;

		}

		int mid = stringToBeReversed.length() / 2;

		return reverseString(stringToBeReversed.substring(mid, stringToBeReversed.length()))
				+ reverseString(stringToBeReversed.substring(0, mid));

	}

	public static void main(String[] args) {

		char input1[] = { 'h', 'e', 'l', 'l', 'o' };
		new RevereString().reverseString2(input1);
	}
}
