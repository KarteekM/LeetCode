import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupAnagrams {

	// Forming a key and storing it in key
	public List<List<String>> groupAnagrams1(String[] strs) {

		Map<String, ArrayList<String>> anagramMapper = new HashMap<String, ArrayList<String>>();

		for (String s : strs) {

			char charactersOfTheString[] = s.toCharArray();
			char ch[] = new char[26];
			for (int i = 0; i < charactersOfTheString.length; i++) {
				ch[charactersOfTheString[i] - 'a']++;
			}
			String keyCoded = String.valueOf(ch);

			if (!anagramMapper.containsKey(keyCoded))
				anagramMapper.put(keyCoded, new ArrayList<>());
			anagramMapper.get(keyCoded).add(s);
		}
		return new ArrayList<>(anagramMapper.values());
	}

	// Works but time limit exceeded
	public List<List<String>> groupAnagrams3(String[] strs) {

		Map<String, List<String>> anagramMapper = new HashMap<String, List<String>>();

		for (int i = 0; i < strs.length; i++) {
			while (i < strs.length && strs[i] == null) {
				i++;
			}
			if (i >= strs.length) {
				break;
			}
			anagramMapper.put(strs[i], null);
			for (int j = i + 1; j < strs.length; j++) {
				while (j < strs.length && strs[j] == null) {
					j++;
				}
				if (j >= strs.length) {
					break;
				}

				if (isAnagram(strs[i], strs[j])) {
					if (anagramMapper.get(strs[i]) == null) {
						List<String> foundAnagrams = new ArrayList<String>();
						foundAnagrams.add(strs[j]);
						anagramMapper.put(strs[i], foundAnagrams);
						strs[j] = null;
					} else {
						List<String> foundAnagrams = anagramMapper.get(strs[i]);
						foundAnagrams.add(strs[j]);
						strs[j] = null;
					}
				}
			}
			strs[i] = null;
		}

		List<List<String>> output = new ArrayList<List<String>>();
		for (Entry<String, List<String>> entry : anagramMapper.entrySet()) {

			if (entry.getValue() == null) {
				List<String> strlist = new ArrayList<String>();
				strlist.add(entry.getKey());
				output.add(strlist);
			} else {
				List<String> strlist = entry.getValue();
				strlist.add(entry.getKey());
				output.add(strlist);
			}

		}

		return output;
	}

	private boolean isAnagram(String str1, String str2) {

		Map<Character, Integer> checkAnagram = new HashMap<Character, Integer>();
		char characters[] = str1.toCharArray();
		for (int i = 0; i < characters.length; i++) {
			if (checkAnagram.get(characters[i]) != null) {
				int count = checkAnagram.get(characters[i]);
				checkAnagram.put(characters[i], ++count);
			} else {
				checkAnagram.put(characters[i], 1);
			}
		}

		char characters2[] = str2.toCharArray();
		for (int i = 0; i < characters2.length; i++) {
			if (checkAnagram.get(characters2[i]) != null) {
				int count = 0;
				count = checkAnagram.get(characters2[i]);
				checkAnagram.put(characters2[i], --count);
			} else {
				return false;
			}
		}

		for (Integer i : checkAnagram.values()) {
			if (i != 0)
				return false;
		}

		return true;
	}
	
	public List<List<String>> groupAnagrams(String[] strs) {
	
		return null;
	}

	public static void main(String[] args) {

		String[] input4 = { "", "" };
		System.out.println(new GroupAnagrams().groupAnagrams(input4));

		String[] input1 = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(new GroupAnagrams().groupAnagrams(input1));

		String[] input2 = { "" };
		System.out.println(new GroupAnagrams().groupAnagrams(input2));
		String[] input3 = { "a" };
		System.out.println(new GroupAnagrams().groupAnagrams(input3));

	}

}
