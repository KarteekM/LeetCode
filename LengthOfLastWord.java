import java.util.StringTokenizer;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {

		if (s == null)
			return 0;
		StringTokenizer tokenizer = new StringTokenizer(s, " ");
		String lastelement = null;
		while (tokenizer.hasMoreTokens()) {
			lastelement = tokenizer.nextToken();
		}
		
		if(lastelement == null)
			return s.trim().length();
		
		return lastelement.length();
	}
	
	public int lengthOfLastWord2(String s) {

		if (s == null)
			return 0;
		
		if(!s.contains(" "))
		 return s.length();
		
		int j=0;
		char characters[] =  s.toCharArray();
		int i = characters.length-1;
		
		while(characters[i] == ' ')
			i--;
		while(i > 0 && characters[i] != ' ') {
			j++;
			i--;
		}
		
		if( j == 0)
		return s.length();
		return j;
	}

	public static void main(String[] args) {
		/*
		 * System.out.println(new LengthOfLastWord().lengthOfLastWord("Hello World"));
		 * System.out.println(new
		 * LengthOfLastWord().lengthOfLastWord("   fly me   to   the moon  "));
		 * System.out.println(new
		 * LengthOfLastWord().lengthOfLastWord("luffy is still joyboy"));
		 * System.out.println(new LengthOfLastWord().lengthOfLastWord(null));
		 * System.out.println(new LengthOfLastWord().lengthOfLastWord(""));
		 */
		
		System.out.println(new LengthOfLastWord().lengthOfLastWord2("a"));
		System.out.println(new LengthOfLastWord().lengthOfLastWord2("Hello World"));
		System.out.println(new LengthOfLastWord().lengthOfLastWord2("   fly me   to   the moon  "));
		System.out.println(new LengthOfLastWord().lengthOfLastWord2("luffy is still joyboy"));
		System.out.println(new LengthOfLastWord().lengthOfLastWord2(null));
		System.out.println(new LengthOfLastWord().lengthOfLastWord2(""));
	}
}
