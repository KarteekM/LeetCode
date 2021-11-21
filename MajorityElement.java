import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public MajorityElement() {
		// TODO Auto-generated constructor stub
	}

	public int majorityElement(int[] nums) {

		Map<Integer, Integer> countOfElements = new HashMap<Integer, Integer>();

		int majorityCount = nums.length / 2;
		for (int i = 0; i < nums.length; i++) {

			if (countOfElements.get(nums[i]) != null) {

				int count = countOfElements.get(nums[i]);

				if (count > majorityCount) {
					return nums[i];
				} else {

					countOfElements.put(nums[i], ++count);
				}

			} else {
				countOfElements.put(nums[i], 1);
			}

		}

		for(Map.Entry<Integer,Integer> entry : countOfElements.entrySet()) {
			//System.out.println("Entry is " + entry.getKey() + "and " + entry.getValue());
			if(entry.getValue() > majorityCount) {
				return entry.getKey();
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int input1[] = {3,2,3};
		System.out.println("Answer is " + new MajorityElement().majorityElement(input1));
	}

}
