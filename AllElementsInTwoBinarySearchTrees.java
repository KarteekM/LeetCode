import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllElementsInTwoBinarySearchTrees {

	List<Integer> elementsInAscendingOrder;
	public AllElementsInTwoBinarySearchTrees() {
		elementsInAscendingOrder = new ArrayList<Integer>();
	}

	 public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
		 
		 inOrder(root1);
		 inOrder(root2);
		 Collections.sort(elementsInAscendingOrder);
		 return elementsInAscendingOrder;
	 }

	private void inOrder(TreeNode root) {
		
		if(null == root) {
			return;
		}
		inOrder(root.left);
		elementsInAscendingOrder.add(root.val);
		inOrder(root.right);
	}
	
}
