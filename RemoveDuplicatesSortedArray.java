
public class RemoveDuplicatesSortedArray {
	public int removeDuplicates(int[] nums) {
		
		int uniqueNumberIndex = 1;
		
		for(int i=1;i<nums.length;i++) {
			if(nums[i-1] != nums[i]) {
				nums[uniqueNumberIndex] = nums[i];
				uniqueNumberIndex++;
			}
		}
		return uniqueNumberIndex;
	}
	
	public static void main(String[] args) {
	 RemoveDuplicatesSortedArray object = new RemoveDuplicatesSortedArray();
		
		 int arr[] = {1,1,1}; System.out.println(object.removeDuplicates(arr));
			
			  int arr2[] = {0,0,1,1,1,2,2,3,3,4};
			  System.out.println(object.removeDuplicates(arr2));
			 
	}
}
