
public class MoveZeroes {
	
	 public int[] moveZeroes(int[] nums) {
		 
		 int elementOtherThanZeros = 0;
		 
		 for(int i=0;i< nums.length;i++) {
			 if( nums[i] != 0) {
				 nums[elementOtherThanZeros++] = nums[i];
			 }
		 }
		 
		 while(elementOtherThanZeros < nums.length) {
			 nums[elementOtherThanZeros++] = 0;
		 }
	       return nums; 
	 }
	 
	 public static void main(String[] args) {
		int nums[] = {0,1,0,3,12};
		
		int changed[] = new MoveZeroes().moveZeroes(nums);
		for(int i=0;i<changed.length;i++) {
			System.out.println(changed[i]);
		}
	}

}
