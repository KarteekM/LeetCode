import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseOnlyLetters {

	public String reverseOnlyLetters(String s) {

		if (s == null) {
			return null;
		}
		
		if(s.length() <= 1)
			return s;

		char[] characters = null;
		char tempForSwap;
		characters = s.toCharArray();
		int forwardTracker = 0;
		int backwardTracker = characters.length-1;

		while(forwardTracker < backwardTracker) {
			
            while (forwardTracker < backwardTracker && !isAlphabet(characters[forwardTracker])) ++forwardTracker;
            while (forwardTracker < backwardTracker && !isAlphabet(characters[backwardTracker])) --backwardTracker;
            tempForSwap = characters[forwardTracker];
            characters[forwardTracker] = characters[backwardTracker];
            characters[backwardTracker] = tempForSwap;
            forwardTracker++;
            backwardTracker--;
		}
		return Stream.of(characters).map(ch -> new String(ch)).collect(Collectors.joining());
	}

	private boolean isAlphabet(char character) {

		int asciiOfCharacter = character;
		if (asciiOfCharacter >= 65 && asciiOfCharacter <= 122) {
			if (asciiOfCharacter > 90 && asciiOfCharacter < 97) {
				return false;
			}
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		ReverseOnlyLetters reverse = new ReverseOnlyLetters();
		
		  System.out.println(reverse.reverseOnlyLetters("ab-cd"));
		  System.out.println(reverse.reverseOnlyLetters("a-bC-dEf-ghIj"));
		  System.out.println(reverse.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
		  System.out.println(reverse.reverseOnlyLetters(""));
		  System.out.println(reverse.reverseOnlyLetters("ab"));
		 
		System.out.println(reverse.reverseOnlyLetters("Czyr^")); // 
	}
}
