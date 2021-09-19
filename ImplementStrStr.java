
public class ImplementStrStr {
	 public int strStr(String haystack, String needle) {
	     
		 if(needle.isEmpty())
			 return 0;
		 
		 char haystackCharacters[] = haystack.toCharArray();
		 char needleCharacters[] = needle.toCharArray();
		 
			
			  if(needleCharacters.length > haystackCharacters.length) 
				  return -1;
			 
		 
			for (int i = 0, j = 0; i < haystackCharacters.length; i++) {

				int k = i;
				while (j < needleCharacters.length && k < haystackCharacters.length) {
					if (needleCharacters[j] == haystackCharacters[k]) {
						j++;
						k++;
					} else {
						j = 0;
						break;
					}
				}
				
				if (j == needleCharacters.length) {
					return i;
				}
			}
		 return -1;
	    }
	 
	 public static void main(String[] args) {
		System.out.println(new ImplementStrStr().strStr("hello", "ll"));
		System.out.println(new ImplementStrStr().strStr("aaaaa", "bba"));
		System.out.println(new ImplementStrStr().strStr("aaa", "aaaa"));
		System.out.println(new ImplementStrStr().strStr("aaa", "aaaa"));
		System.out.println(new ImplementStrStr().strStr("mississippi", "issippi"));
		System.out.println(new ImplementStrStr().strStr("", ""));
	}
}
