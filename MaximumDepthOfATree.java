
import java.util.*;

public class MaximumDepthOfATree {

    //Recursive
    public int maxDepth(TreeNode root) {

        if (null == root) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

    }

    //Iterative - DFS
    public int maxDepth2(TreeNode root) {
        int max = 0;
        if (root == null) {return 0;}
        Stack<TreeNode> nodes = new Stack<>();
        Stack<Integer> heightOfANode = new Stack<>();
        nodes.push(root);
        heightOfANode.push(1);
        while (!nodes.isEmpty()) {
            TreeNode temp = nodes.pop();
            int tempVal = heightOfANode.pop();
            if (temp.left == null && temp.right == null) {
                max = Math.max(max, tempVal);
            }
            else {
                if (temp.left != null) {
                    nodes.push(temp.left);
                    heightOfANode.push(tempVal + 1);
                }
                if (temp.right != null) {
                    nodes.push(temp.right);
                    heightOfANode.push(tempVal + 1);
                }
            }
        }
        return max;
    }

    //Iterative - BFS
    public int maxDepth3(TreeNode root) {

        if (null == root) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = 0;
        while(!queue.isEmpty()){
            int currentSize = queue.size();
            while(currentSize > 0){
                currentSize--;
                TreeNode currNode = queue.remove();
                if(currNode.left != null){
                    queue.offer(currNode.left);
                }
                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = null;
        root.left.right = null;
        TreeNode rightNode = root.right;
        rightNode.left = new TreeNode(15);
        rightNode.right = new TreeNode(7);

        new MaximumDepthOfATree().maxDepth3(root);
    }
}
