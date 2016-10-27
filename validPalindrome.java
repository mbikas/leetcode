
public class validPalindrome {

	//determine if it is a palindrome, 
	//considering only alphanumeric characters and ignoring cases.
	//"A man, a plan, a canal: Panama" is a palindrome.
	//"race a car" is not a palindrome.
	
	public static char toLower(char ch){
		if (ch >='A' && ch<='Z')ch = (char)(ch + 32);
		return ch;
	}
	
	public static boolean isPalindrome(String s) {
		
		if (s.trim().length() == 0)return true;
		
		//        a asdasdasd ddddd d                                    
		int len = s.length();
		int lastIndex = len-1;
		
		int i = 0;
		while (i < len && lastIndex >= i){
			
			
			while (i < len && isAlphaNumeric(s.charAt(i)) == false){
				i++;
			}
			while (lastIndex >=0 && isAlphaNumeric(s.charAt(lastIndex)) == false){
				lastIndex--;
			}
			
			//System.out.println(i + " " + lastIndex);
			if (i >=len || lastIndex < 0) break;
			char charFirst = toLower(s.charAt(i));
			char charLast = toLower(s.charAt(lastIndex));
			
			//System.out.println(i + " " + charFirst + " ==> " + charLast + " " + lastIndex);
			
			if (charLast != charFirst)return false;
			i++;
			lastIndex--;
		}
		return true;
    }
	
	public static boolean isAlphaNumeric(char ch){
		if (ch >='A' && ch<='Z')return true;
		if (ch >='a' && ch<='z')return true;
		if (ch >='0' && ch<='9')return true;
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
		System.out.println(isPalindrome("a."));
		System.out.println(isPalindrome("   , "));
		System.out.println(isPalindrome("a   a                    "));
		System.out.println(isPalindrome("."));

	}

}
