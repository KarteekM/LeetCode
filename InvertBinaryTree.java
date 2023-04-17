import java.util.*;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {

        if(null == root){
            return root;
        }
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return  root;

    }

    //With DFS ( stack ) - iterative
    public TreeNode invertTree2(TreeNode root) {

        if(null == root){
            return null;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode currentNode = stack.pop();
            TreeNode temp = currentNode.left;
            currentNode.left = currentNode.right;
            currentNode.right = temp;
            if(currentNode.left != null){
                stack.push(currentNode.left);
            }
            if(currentNode.right != null){
                stack.push(currentNode.right);
            }
        }
        return root;
    }

    //With BFS ( queue ) - iterative
    public TreeNode invertTree3(TreeNode root) {

        if(null == root){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode currentNode = queue.remove();
            TreeNode temp = currentNode.left;
            currentNode.left = currentNode.right;
            currentNode.right = temp;
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        return root;

    }

}
