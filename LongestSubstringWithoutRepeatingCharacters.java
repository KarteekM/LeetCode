import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {

		if (s == null || s.length() == 0)
			return 0;

		if (s.length() == 1)
			return 1;

		char[] input = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int maxSizeOfStringWithoutRepeatingCharacters = 0;

		for (int i = 0; i < input.length; i++) {
			map.clear();
			map.put(input[i], 1);
			for (int j = i + 1; j < input.length; j++) {
				if (map.get(input[j]) != null) {
					if (maxSizeOfStringWithoutRepeatingCharacters < map.size()) {
						maxSizeOfStringWithoutRepeatingCharacters = map.size();
					}
					break;
				} else {
					map.put(input[j], 1);
					if (maxSizeOfStringWithoutRepeatingCharacters < map.size()) {
						maxSizeOfStringWithoutRepeatingCharacters = map.size();
					}
				}

			}
		}

		return maxSizeOfStringWithoutRepeatingCharacters;
	}
	
	public static void main(String[] args) {
		String input1 = "abcabcbb";
		System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(input1));
		
		String input2 = "bbbbb";
		System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(input2));
		
		String input3 = "pwwkew";
		System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(input3));
		
		String input4 = "";
		System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(input4));
		
		String input5 = "au";
		System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(input5));
		
	}

}
