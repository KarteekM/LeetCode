import java.util.LinkedList;
import java.util.Queue;

public class MaxLevelSum {

	public MaxLevelSum() {
		// TODO Auto-generated constructor stub
	}

	public int maxLevelSum(TreeNode root) {

		if (null == root) {
			return 0;
		}

		int minLevel = 0;
		int level = 0;
		int maxSum = Integer.MIN_VALUE;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int currentQueueSize = queue.size();
			int levelSum = 0;
			for (int i = 0; i < currentQueueSize; i++) {
				TreeNode node = queue.remove();
				levelSum = levelSum + node.val;
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			level++;
			if (maxSum < levelSum) {
				maxSum = levelSum;
				minLevel = level;
			}
			
		}
		return minLevel;
	}
}
