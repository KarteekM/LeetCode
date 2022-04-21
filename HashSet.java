import java.util.ArrayList;
import java.util.List;

public class HashSet {

	List<Integer> arrayList;

	public HashSet() {
		arrayList = new ArrayList<Integer>();
	}

	public void add(int key) {
		if (!arrayList.contains(key)) {
			arrayList.add(key);
		}

	}

	public void remove(int key) {
		arrayList.remove(Integer.valueOf(key));

	}

	public boolean contains(int key) {

		return arrayList.contains(Integer.valueOf(key));
	}

	public void printList() {
		for (Integer i : arrayList) {
			System.out.println(i);
		}
		System.out.println("===================");
	}

	public static void main(String[] args) {
		HashSet myHashSet = new HashSet();
		myHashSet.add(1); // set = [1]
		myHashSet.printList();
		
		myHashSet.add(2); // set = [1, 2]
		myHashSet.printList();
		
		System.out.println(myHashSet.contains(1)); // return True
		System.out.println(myHashSet.contains(3)); // // return False, (not found)
		
		myHashSet.add(2); // set = [1, 2]
		myHashSet.printList();
		
		System.out.println(myHashSet.contains(2)); //returns true
		
		myHashSet.remove(2); // set = [1]
		myHashSet.printList();
		
		System.out.println(myHashSet.contains(2)); // return False, (already removed)
	}

}
