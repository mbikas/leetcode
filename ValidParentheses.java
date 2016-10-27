
public class ValidParentheses {

	//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
	//The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

	public static boolean isValid(String s) {
        int len = s.length();
        
		if (len ==0)return true;
        if (len ==1)return false;
        
        int head = 1;
		char brackets[] = new char[len];
		brackets[0] = s.charAt(0);
		
		for (int i=1;i<len;i++){
			char ch = s.charAt(i);
			if (ch == ')' || ch == '}' || ch == ']'){
			    if (head == 0)return false;
				if (ch == ')' && brackets[head-1] != '(')return false;
				if (ch == '}' && brackets[head-1] != '{')return false;
				if (ch == ']' && brackets[head-1] != '[')return false;
				head--;
			}
			else{
				brackets[head] = ch;
				head++;
			}
		}
		if (head > 0)return false;
		return true;
    }

	public static void main(String[] args) {
		/*
		System.out.println(isValid("([])"));
		System.out.println(isValid("()"));
		System.out.println(isValid("()[]{}"));
		*/
		System.out.println(isValid("["));
		//System.out.println(isValid("([)]"));


	}

}
