import java.util.Arrays;

public class BoatsToSavePeople {

	public int numRescueBoats(int[] people, int limit) {

		int minimumNumberOfBoats = 0;
		Arrays.sort(people);

		int firstPointer = 0;
		int lastPointer = people.length - 1;

		while (firstPointer <= lastPointer) {

			if (people[firstPointer] + people[lastPointer] > limit) {
				minimumNumberOfBoats++;
				lastPointer--;
			} else {
				minimumNumberOfBoats++;
				firstPointer++;
				lastPointer--;
			}
		}
		
		if(firstPointer == lastPointer) {
			minimumNumberOfBoats++;
		}

		return minimumNumberOfBoats;

	}
	
	public static void main(String[] args) {
		int arr[] = {1,2};
		System.out.println(new BoatsToSavePeople().numRescueBoats(arr,3));
		
		int arr2[] = {3,2,2,1};
		System.out.println(new BoatsToSavePeople().numRescueBoats(arr2,3));
		
		int arr3[] = {3,5,3,4};
		System.out.println(new BoatsToSavePeople().numRescueBoats(arr3,3));
		
		int arr4[] = {1,4,4};
		System.out.println(new BoatsToSavePeople().numRescueBoats(arr4,6));
	}

}
