import java.util.HashMap;
import java.util.Map;


public class twoSum {
	
	 public int[] twoSum(int[] nums, int target) 
	 {
		 Map<Integer, Integer> map = new HashMap<>();
		 int len = nums.length;
		 for (int i=0;i<len;i++){
			 map.put(nums[i], i);
		 }
		 
		 for (int i=0;i<len;i++){
			 int diff = target - nums[i];
			 if (map.containsKey(diff)){
				 return new int[]{i, map.get(diff)};
			 }
		 }
		return null;
	 }
	 
    	
	public static void main(String[] args) {
		

	}

}
