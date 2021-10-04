import java.util.Arrays;

public class MaximumUnitsOnATruck {

	public int maximumUnits(int[][] boxTypes, int truckSize) {

		int totalNumberOfUnits = 0;
		Arrays.sort(boxTypes, (a,b) -> b[1]-a[1]);
		for (int i = 0; i < boxTypes.length; i++) {
				if (truckSize > boxTypes[i][0]) {
					truckSize = truckSize - boxTypes[i][0];
					totalNumberOfUnits = totalNumberOfUnits + (boxTypes[i][0] * boxTypes[i][1]);
				} else {
					totalNumberOfUnits = totalNumberOfUnits + (truckSize * boxTypes[i][1]);
					truckSize = 0;
				}

		}

		return totalNumberOfUnits;

	}

	public static void main(String[] args) {
		
		
		  int input1[][] = {{1,3},{2,2},{3,1}}; System.out.println(new
		  MaximumUnitsOnATruck().maximumUnits(input1, 4));
		 
	
		int input2[][] = {{5,10},{2,5},{4,7},{3,9}};
		System.out.println(new MaximumUnitsOnATruck().maximumUnits(input2, 10));

	}
}
