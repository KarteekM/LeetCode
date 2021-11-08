
public class UniqueBinarySearchTrees {
	
	public int numTrees(int n) {
		
		 int [] storedCountOfUniqueBST = new int[n+1];
		    storedCountOfUniqueBST[0]= 1;
		    storedCountOfUniqueBST[1] = 1;
		    for(int level = 2; level <=n; level++)
		        for(int root = 1; root<=level; root++)
		            storedCountOfUniqueBST[level] += storedCountOfUniqueBST[level-root]*storedCountOfUniqueBST[root-1];
		    return storedCountOfUniqueBST[n];
	}
	
}


