package blind75.trees;

import com.sun.source.tree.*;

public class ValidateBinarySearchTree {

    //Without taking help of MIN and MAX
    public boolean isValidBST(TreeNode root) {

        if(null == root){
            return false;
        }

        return isBinaryTree(root,null,null);

    }


    private boolean isBinaryTree(TreeNode root, TreeNode left, TreeNode right) {

        if(null == root){
            return true;
        }

        if(left != null && root.val <= left.val){
            return  false;
        }

        if(right != null && root.val >= right.val){
            return  false;
        }

        return isBinaryTree(root.left, left, root) && isBinaryTree(root.right, root, right);
    }

    //Taking help of MIN and MAX
    public boolean isValidBST2(TreeNode root) {

        if(null == root){
            return false;
        }

        return isBinaryTree2(root, Integer.MAX_VALUE,Integer.MIN_VALUE);

    }

    private boolean isBinaryTree2(TreeNode root, int left, int right) {
        if (root == null) return true;
        if(root.val <= left || root.val >=  right){
            return false;
        }
        return isBinaryTree2(root.left,left,root.val) && isBinaryTree2(root.right,root.val,right);
    }

    //InOrder
    private TreeNode prev;
    public boolean isValidBST3(TreeNode root) {
        prev = null;
        return inOrder(root);
    }

    private boolean inOrder(TreeNode root) {
        if (root == null) return true;

        if (!inOrder(root.left)) return false;

        // Operate on root
        if (prev != null && prev.val >= root.val) return false;
        prev = root;

        return inOrder(root.right);
    }


}
