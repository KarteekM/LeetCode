
public class ProductofArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {

		// Calculate left product
		int left[] = new int[nums.length];
		left[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			left[i] = left[i-1] * nums[i-1];
		}
		// Calculate right product
		int right[] = new int[nums.length];
		right[nums.length-1] = 1;
		for (int i = nums.length-2; i >= 0; i--) {
			right[i] = right[i+1] * nums[i+1];
		}

		// Calculate final product
		int product[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			product[i] = left[i] * right[i];
		}
		return product;

	}


	public static void main(String[] args) {
		
		int input1[] = {1,2,3,4};
		int output1[] = new ProductofArrayExceptSelf().productExceptSelf(input1);
		for(int i=0;i<input1.length;i++) {
			System.out.println(output1[i]);
		}
		
	}
}
