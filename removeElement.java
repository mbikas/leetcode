
public class removeElement {

	public static void main(String[] args) {
		
		//int nums[] = {3,2,2,3}; 
		//int val = 3;
		
		//int nums[] = {3};
		//int val = 3;
		
		//int nums[] = {4, 5};
		//int val = 5;
		
		//int nums[] = {2,2,3};
		//int val = 2;
		//int nums[] = {1,2,3,4};
		//int val = 		2;
		//int pos = removeElement(nums,val);
		//for(int i=0;i<pos;i++)System.out.print(nums[i] + " ");
		
		
		//int nums[] = {1,1,1,1,1,1,1,2,2,2,2,3,3,3,3,5};
		int nums[] = {};
		int pos = removeDuplicates(nums);
		System.out.println("Returned Ans " + pos);
		for(int i=0;i<pos;i++)System.out.print(nums[i] + " ");
		

	}
	
	//[1,1,1,1,1,1,1,2,2,2,2,3,3,3,3,5],
	public static int removeDuplicates(int[] nums) {
		int len = nums.length;
		if(len == 0) return 0;
		
		int cmpValue = nums[0];
		int count = 1;
		
		int currentPos = 0;
		for(int i=1;i<len;i++){
			if(nums[i] != cmpValue){
				nums[count] = nums[i];
				cmpValue = nums[i];
				count++;
				
			}
		}
		return count;
    }
	
	
	/**
	 * Given input array nums = [3,2,2,3], val = 3
	 * Your function should return length = 2, with the first two elements of nums being 2.
	 * @param nums
	 * @param val
	 * @return
	 */
	public static int removeElement(int[] nums, int val) {
		int len = nums.length;
		int count = len;
		//getting length
		for(int i=0;i<len;i++){
			if(nums[i] == val)count--;
		}
		
		int end = len-1;
		for(int start=0;start<end;start++){
			if(nums[start] == val){
				while(end > 0 && nums[end] == val)end--;
				if(start < end){
					int temp = nums[start];
					nums[start] = nums[end];
					nums[end] = temp;
				}
				
				end--;
			}
			
			
		}
		
		return count;
    }
	
	
	

}
