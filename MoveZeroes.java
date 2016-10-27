
public class MoveZeroes {
	
	
	
	
	public static void moveZeroes(int[] nums) {
        
		
		int len = nums.length;
		int pos = 0;
		for(int i=0;i<nums.length;i++){
			if(nums[i] != 0){
				nums[pos] = nums[i];
				pos++;
			}
		}
		for(int i=pos;i<len;i++)nums[i] = 0;
    }

	public static void main(String[] args) {
		int nums[] = {0, 1, 0, 3, 12};
		moveZeroes(nums);
		for(int i=0;i<nums.length;i++)System.out.print(nums[i]);
		
		
	}

}
