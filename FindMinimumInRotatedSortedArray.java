
public class FindMinimumInRotatedSortedArray {

	public int findMin(int[] nums) {
		
		int start = 0;
		int end = nums.length - 1;
		
		while(start < end) {
			
			int mid = (start + end)/2 ;
			
			if(nums[mid] > nums[end]) {
				start = mid + 1;
			}
			else {
				end = mid;
			}
		}
		
		return nums[start];
		
	}
	
	public int findMin2(int nums[]) {
		
		int start = 0;
		int end = nums.length - 1;
		return findMinRecursion(nums, start, end);
		
	}
	
	private int findMinRecursion(int[] nums, int start, int end) {
		
		if(start == end) {
			return nums[start];
		}
		
		int mid = (start + end)/2;
		
		if(nums[mid] >  nums[end]) {
			return findMinRecursion(nums, mid+1, end);
		}
		else {
			return findMinRecursion(nums, start, mid);
		}
		
		
	}

	public static void main(String[] args) {
		
		int input1[] = {4,5,6,7,0,1,2};
		System.out.println(new FindMinimumInRotatedSortedArray().findMin2(input1));
	}

}
