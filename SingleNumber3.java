import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumber3 {
	public int[] singleNumber(int[] nums) {

		List<Integer> resultList = new ArrayList<Integer>();
		Map<Integer, Integer> numberCountMapper = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			if (numberCountMapper.get(nums[i]) != null) {
				numberCountMapper.put(nums[i], 1);
			} else {
				int count = numberCountMapper.get(nums[i]);
				numberCountMapper.put(nums[i], ++count);
			}

		}
		
		for(Map.Entry<Integer, Integer> entry: numberCountMapper.entrySet()) {
			if(entry.getValue() == 1) {
				resultList.add(entry.getKey());
			}
		}

		return resultList.stream().mapToInt(i->i).toArray();
	}

}
