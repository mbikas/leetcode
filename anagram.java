import java.util.Arrays;


public class anagram {

	public static void main(String[] args) {
		
		

	}
	
	
	public boolean isAnagram(String s, String t) {
        
		if(s.length() != t.length()) return false;
		
		char[] s1 = s.toCharArray();
		
		char[] t1 = t.toCharArray();
		Arrays.sort(t1);
		
		for(int i=0;i<s1.length;i++){
			if(s1[i] != t1[i]) return false;
		}
		return true;
    }
}
