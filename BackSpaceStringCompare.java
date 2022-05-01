
public class BackSpaceStringCompare {

	public boolean backspaceCompare(String s, String t) {
		return removeBackSpace(s).equals(removeBackSpace(t));
	}

	private String removeBackSpace(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != '#') {
				sb.append(s.charAt(i));
			}
			else if(sb.length() > 0) {
				sb.deleteCharAt(sb.length()-1);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(new BackSpaceStringCompare().backspaceCompare("ab#c", "ad#c"));

	}
}
