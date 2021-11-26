
public class SearchInsertPosition {

	public SearchInsertPosition() {
		// TODO Auto-generated constructor stub
	}

	 public int searchInsert(int[] nums, int target) {
		 if(nums == null || nums.length == 0) return 0;
		 int high = nums.length - 1;
		 int low = 0;
		 
		 while(low < high) {
			 int mid = low + (high - low)/2;
			 if(nums[mid] == target) {
				 return mid;
			 }
			 else if(target < nums[mid]) {
				 high = mid;
			 }
			 else if(target > nums[mid]) {
				 low = mid + 1;
			 }
			 
		 }
		 
		 if(target < nums[low]) {
			 return low;
		 }
		 else {
			 return low + 1;
		 }
		 
	    }
}
