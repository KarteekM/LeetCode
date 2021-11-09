import java.util.LinkedList;
import java.util.Queue;

public class CompleteBinaryTreeInserter {

	TreeNode root;

	public CompleteBinaryTreeInserter(TreeNode root) {
		this.root = root;
	}

	public int insert(int val) {

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode current = queue.remove();
			if (current.left == null) {
				TreeNode newNode = new TreeNode(val, null, null);
				current.left = newNode;
				return current.val;
			} else {
				queue.add(current.left);
			}

			if (current.right == null) {
				TreeNode newNode = new TreeNode(val, null, null);
				current.right = newNode;
				return current.val;
			} else {
				queue.add(current.right);
			}
		}

		return 0;

	}

	public TreeNode get_root() {
		return root;
	}
	
	public void printList(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if(root == null) {
			return;
		}
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
			TreeNode current = queue.remove();
			System.out.println(current.val);
			if(current.left == null) {
				continue;
			}
			else {
				queue.add(current.left);
			}
			
			if(current.right == null) {
				continue;
			}
			else {
				queue.add(current.right);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		TreeNode treeNode = new TreeNode(30, null, null);
		CompleteBinaryTreeInserter objectCompleteBinaryTree = new CompleteBinaryTreeInserter(treeNode);
		System.out.println("Root is "+objectCompleteBinaryTree.get_root().val);
		
		objectCompleteBinaryTree.insert(40);
		objectCompleteBinaryTree.insert(50);
		objectCompleteBinaryTree.insert(60);
		objectCompleteBinaryTree.insert(70);
		objectCompleteBinaryTree.insert(80);
		objectCompleteBinaryTree.insert(90);
		
		objectCompleteBinaryTree.printList(objectCompleteBinaryTree.get_root());
		
	}

}
