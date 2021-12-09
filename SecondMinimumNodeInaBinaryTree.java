import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SecondMinimumNodeInaBinaryTree {

	Set<Integer> values;
	
	public int findSecondMinimumValue(TreeNode root) {
		
		if(null == root) {
			return -1;
		}
		values = new LinkedHashSet<Integer>();
		
		helper(root);
		
		if(values.size() < 2) {
			return -1;
		}
        List<Integer> list =  new ArrayList<Integer>(values);
        Collections.sort(list);
        return list.get(1);
    }
	private void helper(TreeNode root) {
		
		if(null == root) {
			return;
		}
		values.add(root.val);
		helper(root.left);
		helper(root.right);
	}

}
