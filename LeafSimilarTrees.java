	

import java.util.ArrayList;
import java.util.List;


public class LeafSimilarTrees {

	 public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		 
		 List<Integer> arrayList = new ArrayList<Integer>();
		 List<Integer> arrayList1 = findLeaves(root1, arrayList);
		 arrayList = new ArrayList<Integer>();
		 List<Integer> arrayList2 =	findLeaves(root2, arrayList);
		 if(arrayList1 == null) {
			 return arrayList1 == arrayList2;
		 }
		 return arrayList1.equals(arrayList2);
		 
	   }
	 
	 private List<Integer> findLeaves(TreeNode root, List<Integer> arrayList){
		 
		 if(null == root) {
			 return null;
		 }
		 
		 if(root.left == null && root.right == null) {
			 if(null == arrayList) {
				 arrayList = new ArrayList<Integer>();
			 }
			 arrayList.add(root.val);
		 }
		 findLeaves(root.left,arrayList);
		 findLeaves(root.right,arrayList);
		return arrayList; 
		 
	 }

}
