import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {

		String paranthesesToEvaluate = s;
		if (null == paranthesesToEvaluate || paranthesesToEvaluate.length() < 2)
			return false;

		char parantheses[] = paranthesesToEvaluate.toCharArray();
		Stack<Character> stackOfParantheses = new Stack<Character>();
		
		for(int i=0;i<parantheses.length;i++) {
			if(parantheses[i] == '(' || parantheses[i] == '['  || parantheses[i] == '{'  ) {
				stackOfParantheses.push(parantheses[i]);
			}
			else {
					  if(parantheses[i] == ')' && !stackOfParantheses.isEmpty() && stackOfParantheses.peek() == '(')
						  stackOfParantheses.pop();
					  else if(parantheses[i] == ']' && !stackOfParantheses.isEmpty() && stackOfParantheses.peek() == '[')
						  stackOfParantheses.pop();
					  else if(parantheses[i] == '}' && !stackOfParantheses.isEmpty() && stackOfParantheses.peek() == '{')
						  stackOfParantheses.pop(); 
					  else
						  return false;
			}
		}
		return stackOfParantheses.isEmpty();
	}
	 
	public static void main(String[] args) {
		System.out.println(new ValidParentheses().isValid("]"));
		System.out.println(new ValidParentheses().isValid("()"));
		System.out.println(new ValidParentheses().isValid("()[]{}"));
		System.out.println(new ValidParentheses().isValid("(]"));
		System.out.println(new ValidParentheses().isValid("{[]}"));
	}

}
