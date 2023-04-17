package blind75.trees;

import java.util.*;

public class SubTreeOfAnotherTree {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return false;
        if (isSameTree(s, t)) return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }



    public boolean isSubtree2(TreeNode s, TreeNode t) {
        if (s == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(s);
        while(!queue.isEmpty()){

            TreeNode newSubTree = queue.remove();
            if(isSameTree(newSubTree,t)){
                return true;
            }
            if(newSubTree.left != null){
                queue.add(newSubTree.left);
            }
            if(newSubTree.right != null){
                queue.add(newSubTree.right);
            }

        }
        return false;

    }

    private boolean isSameTree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;

        if (root1.val != root2.val) return false;

        return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
    }
}
