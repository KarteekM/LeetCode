import java.util.ArrayList;
import java.util.List;

public class NaryTreePreOrderTraversal {

	List<Integer> preOrderList = null;
	public NaryTreePreOrderTraversal() {
		preOrderList = new ArrayList<Integer>();
	}

	 public List<Integer> preorder(Node root) {
	        
		 if(null == root) {
			 return preOrderList;
		 }
		 
		  preOrderList.add(root.val);
		  for(Node childNode: root.children) {
			  preorder(childNode);
		  }
		 
		  return preOrderList;
	    }
}
