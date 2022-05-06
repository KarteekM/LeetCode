import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString2 {

	public String removeDuplicates(String s, int k) {
		/*
		 * 
		 * String result = new String(s); int startIndex = -1; if (false ==
		 * duplicatesExist(s, k)) { return result; } else { int count = 0; for (int i =
		 * 0, j = 1; j < s.length(); j++) { if (s.charAt(i) == s.charAt(j)) {
		 * if(startIndex == -1) { startIndex = i; } count++; if (count == k - 1) {
		 * StringBuilder builder = new StringBuilder(s); for(int n=0;n<k;n++) {
		 * builder.deleteCharAt(startIndex); } result = builder.toString(); return
		 * removeDuplicates(result,k);
		 * 
		 * } } else { count = 0; startIndex = -1; } i = j; } } return result;
		 */
		
	
		  Stack<int[]> stack = new Stack<int[]>();
		  char chars[] = s.toCharArray();
		  for(int i=0;i<chars.length;i++) {
			  if(!stack.isEmpty() && stack.peek()[0] == chars[i] && stack.peek()[1] == (k-1)) {
					  stack.pop();
			  }
			  
			  else {
				  if(stack.isEmpty() || stack.peek()[0] != chars[i] ) {
					  int ch[] = {chars[i],1};
					  stack.push(ch);
				  }
				  else {
					  if(stack.peek()[0] == chars[i]) {
						  int ch[] =   stack.pop();
						  ch[1] = ch[1] + 1;
						  stack.push(ch);
					  }
					  
				  }
			  }
			  
		  }
		  
		  StringBuilder sb = new StringBuilder();
		  int size = stack.size();
		  for(int i=0;i<size;i++) {
			  int[] ch = stack.pop();
			  for(int j=0;j<ch[1];j++) {
				  String str = Character.toString((char) ch[0]);
				  sb.append(str);
			  }
		  }
		  String result = sb.reverse().toString();
		  return result;
	}



	public static void main(String[] args) {
		System.out.println(new RemoveAllAdjacentDuplicatesInString2().removeDuplicates("abcd", 2));
		System.out.println(new RemoveAllAdjacentDuplicatesInString2().removeDuplicates("deeedbbcccbdaa", 3));
	  System.out.println(new RemoveAllAdjacentDuplicatesInString2().removeDuplicates("pbbcggttciiippooaais", 2));

	}

}
