
public class SmallestStringWithAGivenNumericValue {

	public String getSmallestString(int n, int k) {
		int numberOfCharacters = n;
		int residual = k;
		char[] characters = new char[numberOfCharacters];
		for (int i = 0; i < numberOfCharacters; i++) {
			characters[i] = 'a';
			residual--;
		}

		while (residual != 0) {

			if (residual < 25) {
				characters[numberOfCharacters - 1] = (char) (97 + residual);
				residual = 0;
				numberOfCharacters--;

			} else {
				characters[numberOfCharacters - 1] = 'z';
				residual = residual - 25;
				numberOfCharacters--;

			}

		}

		return String.valueOf(characters);

	}
}
