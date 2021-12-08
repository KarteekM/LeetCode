import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigZagLevelOrderTraversal {

	List<List<Integer>> zigZagElementlist = null;

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		
		List<List<Integer>> elementsInZigZagOrder = new ArrayList<List<Integer>>();
		
		if(null == root) {
			return elementsInZigZagOrder;
		}
		
		int level = 0;
		helper(root, elementsInZigZagOrder, level);
		return elementsInZigZagOrder;
	}
	
	private void helper(TreeNode root, List<List<Integer>> elementsInZigZagOrder, int level) {
		
		if(null == root) {
			return;
		}
		
		if(elementsInZigZagOrder.size() <= level) {
			List<Integer> newLevel = new ArrayList<Integer>();
			elementsInZigZagOrder.add(newLevel);
		}
		
		List<Integer> numbersInTheLevel = elementsInZigZagOrder.get(level);
		if(level%2 == 0) {
			numbersInTheLevel.add(root.val);
		}
		else {
			numbersInTheLevel.add(0,root.val);
		}
		
		helper(root.left, elementsInZigZagOrder, level + 1);
		helper(root.right, elementsInZigZagOrder, level + 1);
	}

	public List<List<Integer>> zigzagLevelOrder2(TreeNode root) {

		zigZagElementlist = new ArrayList<List<Integer>>();
		if (null == root) {
			return zigZagElementlist;
		}

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		boolean leftToRight = true;
		while (!queue.isEmpty()) {

			int currentSizeOfQueue = queue.size();
			List<Integer> levelElements = new ArrayList<Integer>();
			for (int i = 0; i < currentSizeOfQueue; i++) {
				TreeNode node = queue.remove();
				levelElements.add(node.val);
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			
			if(leftToRight == true) {
				leftToRight = false;
			}
			else {
				Collections.reverse(levelElements);
				leftToRight = true;
			}
			zigZagElementlist.add(levelElements);
		}

		return zigZagElementlist;
	}
	boolean leftToRight = true;
	

}
