import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;




public class BinaryTreeLevelOrderTraversal2 {
	List<List<Integer>> totalList = null;
	public BinaryTreeLevelOrderTraversal2() {
		totalList = new ArrayList<List<Integer>>();
	}
	
	 public List<List<Integer>> levelOrderBottom(TreeNode root) {
	     
		 	if(null == root) {
		 		return new ArrayList<List<Integer>>();
		 	}
		 	
		 	Queue<TreeNode> queue = new LinkedList<TreeNode>();	
		 	queue.add(root);
		 	
			while (!queue.isEmpty()) {
				int size = queue.size();
				List<Integer> levelBasedList = null;
				for (int i = 0; i < size; i++) {
					TreeNode node = queue.remove();
					if (levelBasedList == null) {
						levelBasedList = new ArrayList<Integer>();
					}
					levelBasedList.add(node.val);
					if (node.left != null) {
						queue.add(node.left);
					}
					if (node.right != null) {
						queue.add(node.right);
					}
				}
				totalList.add(levelBasedList);
			}
				Collections.reverse(totalList);
				return totalList;
	    }

}
