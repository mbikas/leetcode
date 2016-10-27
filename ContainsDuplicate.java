import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {
        
		Arrays.sort(nums);
		for(int i=0;i<nums.length-1;i++)
			if(nums[i] == nums[i+1])return true;
		return false;
    }
	

	public boolean containsDuplicate1(int[] nums) {
        
		HashSet<Integer>set = new HashSet<Integer>(nums.length);
		for (int x: nums) {
	        if (set.contains(x)) return true;
	        set.add(x);
	    }
	    return false;
	    
    }
	
	public static int hammingWeight(long n) {
		
		int count =0;
		while(n > 0){
			if (n % 2 != 0)count++;
			n = n/2;
		}
		return count;
		
	}

	public static void main(String[] args) {
		// 2147483648 (10000000000000000000000000000000)
		System.out.println(hammingWeight(2147483648L));

	}

}
