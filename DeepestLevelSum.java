import java.util.LinkedList;
import java.util.Queue;

public class DeepestLevelSum {

	int maxLevel;
	int sum;

	public DeepestLevelSum() {
		maxLevel = 0;
		sum = 0;
	}

	public int deepestLeavesSum(TreeNode root) {

		if (null == root) {
			return 0;
		}
		deepestLeavesSum(root, 0);
		return sum;
	}

	private void deepestLeavesSum(TreeNode root, int level) {

		if (null == root) {
			return;
		}

		if (level > maxLevel) {
			maxLevel = level;
			sum = 0;
		}

		if (level == maxLevel) {
			sum = sum + root.val;
		}

		deepestLeavesSum(root.left, level + 1);
		deepestLeavesSum(root.right, level + 1);

	}
	
	public int deepestLeavesSum2(TreeNode root) {
				if(null == root) {
			return 0;
		}
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();	
		int sumOfDeepLeaveNodes = 0;
		queue.add(root);	
		
		while(!queue.isEmpty()) {
			
			int size = queue.size();
			sumOfDeepLeaveNodes = 0;
			for(int i=0;i<size;i++) {
				TreeNode node = queue.remove();
				sumOfDeepLeaveNodes = sumOfDeepLeaveNodes + node.val;
				if(node.left != null) {
					queue.add(node.left);
				}
				if(node.right != null) {
					queue.add(node.right);
				}
			}
			
		}
		return sumOfDeepLeaveNodes;
	}
}
