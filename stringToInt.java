
public class stringToInt {

	//1234
	public static int stringToInteger(String s) {
        
		int end = 0;
		boolean negative = false;
		if(s.charAt(0) == '-'){
			negative = true;
			end = 1;
		}
		int ans = 0;
		int p = 1, len = s.length();
		
		for(int i=len-1;i>=end;i--){
			ans +=   p*(s.charAt(i)-'0');
			p = p*10;
		}
		
		if(negative) return ans *-1;
		return ans;
        
    }
	
	public static void main(String[] args) {
		
		int a = stringToInteger("-12311234");
		System.out.println(a+"");
		

	}

}
