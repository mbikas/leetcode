import java.util.HashMap;


public class containsDuplicateII {

	//1 2 3 4 1 6 1
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        if (len == 0)return false;
        
        HashMap<Integer, Integer>map = new  HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++){
            
            if (map.containsKey(nums[i])){
                int diff = i - map.get(nums[i]);
                if (diff <= k) return true;
                map.put(nums[i], i);
                continue;
            }
            map.put(nums[i], i);
        }
        
        return false;
        
    }
    
	public static void main(String[] args) {
		int nums[] = {1, 2, 3, 4, 1, 6, 1};
		System.out.println(containsNearbyDuplicate(nums,2));

	}

}
