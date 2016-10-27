
public class reverseWords {
	
	
	
	
	
	public static String reverseString(String s) {
        // avvvvx
		
		char a[] = s.toCharArray();
		char temp;
		int len = a.length;
        int start = 0;
        int end = len-1;
        while(start < end){
        	
        	//swap
        	temp = a[end];
        	a[end] = a[start];
        	a[start] = temp;
        	
        	start++;
        	end--;
        }
		
        //System.out.println(a);
        return String.valueOf(a);
		
		
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("=>" + reverseString("hello")+ "<=");
		
	}

}
