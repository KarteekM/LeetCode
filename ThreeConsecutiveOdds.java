
public class ThreeConsecutiveOdds {

	 public boolean threeConsecutiveOdds(int[] arr) {
		 
		 if(arr.length < 3)
	            return false;
	        
	     for(int i=2;i<arr.length;i++){         
	          if(arr[i-2]%2 !=0 && arr[i-1]%2 != 0 && arr[i]%2 != 0)
	              return true;         
	     }
	     return false;
	 }
	 
	 public static void main(String[] args) {
		int[] arr = {1,1,1};
		System.out.println(new ThreeConsecutiveOdds().threeConsecutiveOdds(arr));
	}
}
