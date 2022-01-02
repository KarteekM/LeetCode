
public class JumpGame {

public boolean canJump(int[] nums) {
		
		int reachableSoFar = 0;
		for(int i=0;i<nums.length;i++) {
			
			if(reachableSoFar < nums.length-1) {
				return false;
			}
			reachableSoFar = Math.max(reachableSoFar, i + nums[i]);
			if(reachableSoFar >= nums.length-1) {
				return true;
			}
			
		}
        return true;
    }
}
