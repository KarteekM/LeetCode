import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
	
		
		if(s.length() != t.length()) {
			return false;
		}
		
		int characters[] = new int[26];
		for(int i=0;i<s.length();i++) {
			characters[s.charAt(i) - 'a']++;
			characters[t.charAt(i) - 'a']-- ;
		}
		
		for(int i=0;i<characters.length;i++) {
			if(characters[i] != 0) {
				return false;
			}
				
		}
		
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new ValidAnagram().isAnagram("anagram", "nagaram"));
		System.out.println(new ValidAnagram().isAnagram("rat", "car"));

	}

}
