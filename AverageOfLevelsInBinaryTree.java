import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {

		
	 List<Double> averageOfEachLevel;
	 public List<Double> averageOfLevels(TreeNode root) {
		 averageOfEachLevel = new ArrayList<Double>();
	      if(null == root) {
	    	  return averageOfEachLevel;
	      }
	      
	      Queue<TreeNode> queue = new LinkedList<TreeNode>();
	      queue.add(root);
	      
	      while(!queue.isEmpty()) {
	    	  
	    	  int currentSize = queue.size();
	    	  double currentSum = 0;
	    	  for(int i=0;i<currentSize;i++) {
	    		   TreeNode node = queue.remove();
	    		   currentSum= currentSum + node.val;
	    		   if(node.left != null) {
	    			   queue.add(node.left);
	    		   }
	    		   if(node.right != null) {
	    			   queue.add(node.right);
	    		   }
	    	  }
	    	   double avg = currentSum/currentSize;
	    	   averageOfEachLevel.add(avg);
	    	  
	      }
		 return averageOfEachLevel;
	    }

}
