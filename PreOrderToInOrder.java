package blind75.trees;

import com.sun.source.tree.*;

import java.util.*;

public class PreOrderToInOrder {

    //Recursive approach
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer,Integer> inOrderValueAndIndexMap = new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            inOrderValueAndIndexMap.put(inorder[i],i);
        }
        return buildTreeHelper(preorder,0,preorder.length-1,inorder,0,inorder.length-1,inOrderValueAndIndexMap);

    }

    private TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd,
                                     Map<Integer, Integer> inOrderValueAndIndexMap) {
        if(preStart > preEnd || inStart > inEnd){
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = inOrderValueAndIndexMap.get(root.val);
        int elementsOnTheLeft = inRoot - inStart;
        root.left = buildTreeHelper(preorder,preStart+1,preStart+elementsOnTheLeft,inorder,inStart,inRoot-1,inOrderValueAndIndexMap);
        root.right = buildTreeHelper(preorder,preStart+elementsOnTheLeft+1,preEnd,inorder,inRoot+1,inEnd,inOrderValueAndIndexMap);
        return root;
    }

    //Iterative approach
    public TreeNode buildTree2(int[] preorder, int[] inorder) {

        if(preorder.length == 0 || inorder.length == 0){
            return null;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode root = new TreeNode(preorder[0]);
        stack.push(root);
        TreeNode node = null;
        for(int i=1,j=0;i<preorder.length;i++){
            TreeNode cur = new TreeNode(preorder[i]);
            while(!stack.isEmpty() && stack.peek().val == inorder[j]){
                node = stack.pop();
                j++;
            }
            if(node != null){
                node.right = cur;
                node = null;
            }
            else{
                stack.peek().left = cur;
            }
            stack.push(cur);
        }
        return  root;
    }
}
