import java.util.HashMap;
import java.util.Scanner;
import java.math.BigInteger;

public class shortPalindrome {
	
	public static void main(String[] args) {
		
		
		//kkkkkkz
		//abbaab  == > 3c2 + 3c2 = 6
	
		
		
		
		
		
		
		
		System.out.println(getSameCharactersInSeq("abcge"));
		System.out.println(get_max_occured_char("abcga"));
		//System.out.println(shortPalindromeSubstring("kkkkkkz"));
		//System.out.println(shortPalindromeSubstring("abbaab")); //4
		System.out.println(shortPalindromeSubstring("ghhggh")); //4
		
		Scanner reader = new Scanner(System.in);  
		String s = reader.next();
		System.out.println(shortPalindromeSubstring(s));
		reader.close();
	}
	public static long nCr(int n, int r)
	{
		return (n*(n-1))/r;
	}
	
	static int getSameCharactersInSeq(String s){
		//ababaa
		int len = s.length();
		int count = 0;
		for(int i=0;i<len-1;i++){
			for(int j=i+1;j<len;j++){
				if(s.charAt(i) == s.charAt(j))count++;
			}
		}
		return count;
		
	}
	
	static long get_max_occured_char(String s){
		int digit[] = new int[30];
		int MOD = 1000000007;
		long count = 0;
		for(int k=0;k<27;k++){
			digit[k] =0;
		}
		int l =s.length();
		for(int k=0;k<l;k++){
			int p = s.charAt(k)-'a';
			digit[p]++;
		}
		for(int k=0;k<=26;k++){
			if(digit[k] >=2){
				count += nCr(digit[k], 2) % MOD;
			}
		}
		
		return count;
	}
	
	private static long shortPalindromeSubstring(String s) {
		
		int MOD = 1000000007;
		HashMap<String, Long> subStrings = new HashMap<String, Long>();
		long ans = 0;
		int len = s.length();
		for (int i=0;i<len-3;i++){			
			for(int j=len-1;j-i>=3;j--){
				if(s.charAt(i) == s.charAt(j)){
					String s1 = s.substring(i+1, j);
					if(subStrings.containsKey(s1)){
						ans += subStrings.get(s1);
						continue;
					}
					long midValues = get_max_occured_char(s1) % MOD;
					subStrings.put(s1, midValues);
					ans += midValues;
				}    
			}
		}
		return (ans%MOD);
	}
}
