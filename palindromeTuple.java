import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class palindromeTuple {

	static HashSet<String> getAllSubstrings(String str){
		HashSet<String> subs = new HashSet<String>();
		for (int i = 0; i < str.length(); i++) { 
			for (int j = i+1; j <= str.length(); j++) { 
				subs.add(str.substring(i,j));
			} 
		}
		return subs;
	}
	
	public static HashSet<String> allUniqueSubstrings(String str) {
		HashSet<String> all = new HashSet<>();
		HashSet<StringBuilder> last = new HashSet<>();
 
		for (int i = 0; i < str.length(); i++) {
			for (StringBuilder sb : last) {
				sb.append(str.charAt(i));
				if (!all.contains(sb.toString())) {
					all.add(sb.toString());
				}
			}
			if (!all.contains(str.charAt(i) + "")) {
				all.add(str.charAt(i) + "");
			}
			last.add(new StringBuilder(str.charAt(i) + ""));
		}
		return all;
	}
	
	static boolean isPalindrome(String str) {    
	    int n = str.length();
	    for( int i = 0; i < n/2; i++ )
	        if (str.charAt(i) != str.charAt(n-i-1)) return false;
	    return true;    
	}
	
	static String getSmallestString(String a, String b){
		int compare = a.compareTo(b);
		if (compare < 0){
		    return a;
		}
		else if (compare > 0) {
		    return b;
		}
		else {
		    return a;
		}
	}
	
	static String getPalindromeSubstring(String str1, String str2){
		
		//HashSet<String> subStr1 = getAllSubstrings(str1);
		//HashSet<String> subStr2 = getAllSubstrings(str2);
		
		HashSet<String> subStr1 = allUniqueSubstrings(str1);
		HashSet<String> subStr2 = allUniqueSubstrings(str2);
		
		
		
		
		int maxLength = 0;
		HashMap<Integer, String> pal = new HashMap<Integer, String>();
		for (String s1 : subStr1) {
			if (maxLength > 200000)continue;
		    for (String s2 : subStr2){
		    	String s = s1 + s2;
		    	if (s.trim().length() == 0)continue;
		    	int len = s.length();
		    	if (len >= maxLength && isPalindrome(s)){
		    		if (pal.containsKey(len) == true)
		    			pal.put(len, getSmallestString(s, pal.get(len)));
		    		else
		    			pal.put(len, s);
		    		maxLength = len;
		    	}
		    }
		}
		
		if (maxLength ==0) return "-1";
		return pal.get(maxLength);
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);  
		int n = reader.nextInt();
		while(n > 0){
			String s1 = reader.next();
			String s2 = reader.next();
			System.out.println(getPalindromeSubstring(s1, s2));
			n--;
		}
		reader.close();
	}

}
