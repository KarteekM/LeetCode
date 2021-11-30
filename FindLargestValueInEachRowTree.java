import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueInEachRowTree {

	public List<Integer> largestValues(TreeNode root) {
		List<Integer> maxIntegerInEachLevel = new ArrayList<Integer>();
		if (null == root) {
			return maxIntegerInEachLevel;
		}

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		while (!queue.isEmpty()) {

			int currentQueueSize = queue.size();
			int maxValueAtThisLevel = Integer.MIN_VALUE;

			for (int i = 0; i < currentQueueSize; i++) {
				TreeNode currentNode = queue.remove();
				if (currentNode.val > maxValueAtThisLevel) {
					maxValueAtThisLevel = currentNode.val;
				}
				
				if(currentNode.left != null) {
					queue.add(currentNode.left);
				}
				
				if(currentNode.right != null) {
					queue.add(currentNode.right);
				}
			}
			maxIntegerInEachLevel.add(maxValueAtThisLevel);
		}
		return maxIntegerInEachLevel;
	}

}
