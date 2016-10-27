
public class reverseString {
	
	
	
	public static String reverseWords(String s) 
	{
		int i;
		String sNew = "";
		String s1[] = s.split(" ");
		int len = s1.length;
		boolean first = true;
		for(i=len-1;i>=0;i--){
			boolean isWhitespace = s1[i].matches("^\\s*$");
			if(isWhitespace)continue;
			if(first){
				sNew += s1[i].trim();
				first = false;
			}
			else sNew += " " + s1[i];
		}	
		return sNew;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("=>" + reverseWords("the sky    is blue")+ "<=");
		//System.out.println("=>" + reverseWords("") + "<=");
		//System.out.println("=>" + reverseWords("a") + "<=");
		//System.out.println("=>" + reverseWords("   a   b ") + "<=");
		
	}

}
