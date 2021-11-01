import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> completeList = new LinkedList<List<Integer>>();
		if (null == root)
			return completeList;

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		while (!queue.isEmpty()) {
			List<Integer> levelBasedList = new LinkedList<Integer>();
			int queueSize = queue.size();
			for (int i = 0; i < queueSize; i++) {
				TreeNode treeNode = queue.poll();
				levelBasedList.add(treeNode.val);
				if (treeNode.left != null) {
					queue.add(treeNode.left);
				}
				if (treeNode.right != null) {
					queue.add(treeNode.right);
				}
			}
			completeList.add(levelBasedList);
		}

		return completeList;
	}

}
