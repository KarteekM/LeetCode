
public class ValidPalindrome {
 
public boolean isPalindrome(String s) {
		
	 if(s == null)
	 return false;
	 
	  s = s.replaceAll("[^a-zA-Z0-9]", "");
	  s = s.toLowerCase();

		char stringAsCharacters[] = s.toCharArray();
		for (int i = 0, j = stringAsCharacters.length - 1; i < stringAsCharacters.length / 2; i++, j--) {
			if(stringAsCharacters[i] != stringAsCharacters[j])
				return false;
		}
		return true;
	
    }

public static void main(String[] args) {
	System.out.println(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
	System.out.println(new ValidPalindrome().isPalindrome("race a car"));
}
}
