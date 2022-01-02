import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class DeleteNodeAndReturnForest {

	public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

		Set<Integer> integersTobeDeletedFromTree = new HashSet<Integer>();
		for (int number : to_delete) {
			integersTobeDeletedFromTree.add(number);
		}
		List<TreeNode> result = new ArrayList<TreeNode>();

		delNodes(root, integersTobeDeletedFromTree, result);
		if (!integersTobeDeletedFromTree.contains(root.val)) {
			result.add(root);
		}

		return result;
	}

	private TreeNode delNodes(TreeNode node, Set<Integer> integersTobeDeletedFromTree, List<TreeNode> result) {

		if (null == node) {
			return null;
		}

		node.left = delNodes(node.left, integersTobeDeletedFromTree, result);
		node.right = delNodes(node.right, integersTobeDeletedFromTree, result);

		if (integersTobeDeletedFromTree.contains(node.val)) {
			if (node.left != null) {
				result.add(node.left);
			}
			if (node.right != null) {
				result.add(node.right);
			}

			return null;
		}

		return node;

	}

	public List<TreeNode> delNodes2(TreeNode root, int[] to_delete) {

		Set<Integer> integersTobeDeletedFromTree = new HashSet<Integer>();
		for (int number : to_delete) {
			integersTobeDeletedFromTree.add(number);
		}

		List<TreeNode> result = new ArrayList<TreeNode>();
		if (null == root) {
			return result;
		}

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		result.add(root);
		while (!queue.isEmpty()) {
			TreeNode currentNode = queue.remove();
			if (integersTobeDeletedFromTree.contains(currentNode.val)) {
				result.remove(currentNode);
				if (currentNode.left != null) {
					result.add(currentNode.left);
				}
				if (currentNode.right != null) {
					result.add(currentNode.right);
				}
			}

			if (currentNode.left != null) {
				queue.add(currentNode.left);
				if (integersTobeDeletedFromTree.contains(currentNode.left.val)) {
					currentNode.left = null;
				}
			}

			if (currentNode.right != null) {
				queue.add(currentNode.right);
				if (integersTobeDeletedFromTree.contains(currentNode.right.val)) {
					currentNode.right = null;
				}
			}
		}
		return result;
	}
}
