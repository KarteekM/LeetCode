
public class RemoveElement {

	public int removeElement(int[] nums, int val) {
		
		int otherNumbersIndex = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] != val) {
				nums[otherNumbersIndex] = nums[i];
				otherNumbersIndex++;
			}
		}
		return otherNumbersIndex;
	}
	
	public static void main(String[] args) {
		RemoveElement removeElement = new RemoveElement();
	}

}
