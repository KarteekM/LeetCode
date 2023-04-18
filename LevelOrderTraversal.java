package blind75.trees;

import com.sun.source.tree.*;

import java.util.*;

public class LevelOrderTraversal {

    //DFS ( Recursive )
    public List<List<Integer>> levelOrder(TreeNode root) {

        if(null == root){
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        levelDFS(res,root,0);
        return res;
    }

    private void levelDFS(List<List<Integer>> res, TreeNode root, int height) {

        if(null == root){
            return;
        }

        if(height >= res.size()){
            List<Integer> newLevelElements = new ArrayList<>();
            res.add(newLevelElements);
        }
        res.get(height).add(root.val);
        levelDFS(res,root.left,height+1);
        levelDFS(res,root.right,height+1);

    }


    //BFS ( Iterative )
    public List<List<Integer>> levelOrder2(TreeNode root) {
        if(null == root){
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> result = new ArrayList<>();
        while(!queue.isEmpty()){
            int currentSize = queue.size();
            List<Integer> nodesInALevel = new ArrayList<>();
            while(currentSize > 0){
                currentSize--;
                TreeNode treeNode =  queue.remove();
                nodesInALevel.add(treeNode.val);
                if(treeNode.left != null){
                    queue.add(treeNode.left);
                }
                if(treeNode.right != null){
                    queue.add(treeNode.right);
                }
            }
            result.add(nodesInALevel);
        }
      return result;
    }
}
