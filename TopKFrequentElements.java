import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class TopKFrequentElements {

	public int[] topKFrequent(int[] nums, int k) {

		Map<Integer, Integer> countFrequency = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			countFrequency.put(nums[i], countFrequency.getOrDefault(nums[i], 0) + 1);
		}

		countFrequency = countFrequency.entrySet().stream().sorted(Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		int i = 0;
		List<Integer> result = new ArrayList<Integer>();
		for (Map.Entry<Integer, Integer> map : countFrequency.entrySet()) {
			if (i < k) {
				result.add(map.getKey());
			}
			i++;
			if (i >= k) {
				break;
			}
		}
		return result.stream().mapToInt(Integer::intValue).toArray();

	}
	public int[] topKFrequent2(int[] nums, int k) {

		Map<Integer,Integer> numberAndItsFrequency = new LinkedHashMap<>();

		for(int n: nums){
			numberAndItsFrequency.put(n, numberAndItsFrequency.getOrDefault(n,0)+1);
		}

		List<Integer>[] bucket = new ArrayList[nums.length+1];

		for(Map.Entry<Integer, Integer> entry: numberAndItsFrequency.entrySet()){

			if(bucket[entry.getValue()] == null){
				bucket[entry.getValue()] = new ArrayList<Integer>();
			}
			bucket[entry.getValue()].add(entry.getKey());
		}

		List<Integer> result = new ArrayList<>();

		for(int i=bucket.length-1;i>=0 && result.size()<k;i--){
			if(bucket[i]!= null){
				result.addAll(bucket[i]);
			}
		}

		return result.stream().mapToInt(i -> i).toArray();

	}

	public static void main(String[] args) {
		TopKFrequentElements elements = new TopKFrequentElements();

		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int[] result = elements.topKFrequent(nums, 2);

		int[] nums2 = { 1 };
		int[] result2 = elements.topKFrequent(nums2, 1);

		int[] nums3 = { 1, 2 };
		int[] result3 = elements.topKFrequent(nums3, 2);

		int[] nums4 = { 4, 1, -1, 2, -1, 2, 3 };
		int[] result4 = elements.topKFrequent(nums4, 2);
	}
}
