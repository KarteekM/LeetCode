import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftTreeValue {

	public FindBottomLeftTreeValue() {
		// TODO Auto-generated constructor stub
	}

	public int findBottomLeftValue(TreeNode root) {
		
		
		if(null == root) {
			return 0;
		}
		
		int bottomLeftValue = 0;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i=0;i<size;i++) {
				TreeNode node = queue.remove();
				if(0 == i) {
					bottomLeftValue = node.val;
				}
				if(node.left != null) {
					queue.add(node.left);
				}
				if(node.right != null) {
					queue.add(node.right);
				}
			}
		}
		return bottomLeftValue;
	}
}
