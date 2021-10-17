import java.util.HashMap;
import java.util.LinkedHashSet;
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

	public int lengthOfLongestSubstring2(String s) {

		LinkedHashSet<Character> repeatingSequence = new LinkedHashSet<Character>();
		int i = 0;
		int j = 0;
		int max = 0;
		if (s == null) {
			return 0;
		}

		if (s.length() <= 1) {
			return s.length();
		}

		while (i < s.length()) {

			if (repeatingSequence.contains(s.charAt(i))) {
				repeatingSequence.remove(s.charAt(j++));

			} else {
				repeatingSequence.add(s.charAt(i++));
				max = Math.max(repeatingSequence.size(), max);
			}

		}

		return max;
	}

	public static void main(String[] args) {
		String input1 = "abcabcbb";
		System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring2(input1));

		String input2 = "bbbbb";
		System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring2(input2));

		String input3 = "pwwkew";
		System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring2(input3));

		String input4 = "";
		System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring2(input4));

		String input5 = "au";
		System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring2(input5));

	}

}
