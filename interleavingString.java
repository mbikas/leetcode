
public class interleavingString {
	
	public static boolean isInterleave(String s1, String s2, String s3) {
        
		int lenS1 = s1.length();
		int lenS2 = s2.length();
		int lenS3 = s3.length();
		boolean s[] = new boolean[lenS3];
		for (int i=0;i<lenS3;i++)s[i] = false;
		
		
		int indexS1 = 0;
		int indexS2 = 0;
		for (int i=0;i<lenS3;i++){
			System.out.println(indexS1 + "== "+ indexS2 + "==>" +i);
			if (indexS1 < lenS1 && s3.charAt(i) == s1.charAt(indexS1)){
				indexS1++;
			}
			else if (indexS2 < lenS2 && s3.charAt(i) == s2.charAt(indexS2)){
				indexS2++;
			}
		}
		System.out.println(indexS2 + "TRUE"+ indexS1);
		if (indexS1 == lenS1 && indexS2 == lenS2)return true;
		return false;
    }
	public static void main(String[] args) {
		
		
		
		
		if (isInterleave("aabcc", "dbbca", "aadbbcbcac")) System.out.println("TRUE");
		else System.out.println("FALSE");
		
		//if (isInterleave("aabcc", "dbbca", "aadbbbaccc")) System.out.println("TRUE");
		//else System.out.println("FALSE");
		
		

	}

}
