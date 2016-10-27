
public class StrStr {

	/**
	 * 
	 * @param haystack  abcdebd
	 * @param needle    bd
	 * @return
	 */
	public static int strStr(String haystack, String needle) {
        
		if (haystack.length() == 0 && needle.length()==0)return 0;
        if (haystack.length() == 0 && needle.length()>0)return -1;
        if (needle.length() == 0 && haystack.length()>0)return -1;
        
        
		int len1 = haystack.length();
		char startChar = needle.charAt(0);
		for (int i=0;i<len1;i++){
			if (haystack.charAt(i) == startChar){
				if (check(haystack, needle, i))return i;
			}
		}
		return -1;
		
		
		
    }
	
	public static boolean check(String haystack, String needle, int startIndex){
		
		int len1 = haystack.length();
		int len2 = needle.length();
		
		int j = 0;
		for (int i=startIndex;i<len1;i++){
			if (haystack.charAt(i) != needle.charAt(j)){
				return false;
			}
			j++;
			if (j == len2)return true;
		}
		if (j != len2)return false;
		return true;
	}
	public static void main(String[] args) {
		System.out.println(strStr("aaaaaaaaaa", "aaaaaaaaaac"));

	}

}
