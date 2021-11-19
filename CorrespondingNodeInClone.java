
public class CorrespondingNodeInClone {

	public CorrespondingNodeInClone() {
		// TODO Auto-generated constructor stub
	}

	public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

		if (target == original || null == original) {
			return cloned;
		}

		TreeNode result = getTargetCopy(original.left, cloned.left, target);

		if (result != null) {
			return result;
		} else {
			result = getTargetCopy(original.right, cloned.right, target);
		}
		return result;
	}
}
