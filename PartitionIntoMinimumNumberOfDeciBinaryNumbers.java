
public class PartitionIntoMinimumNumberOfDeciBinaryNumbers {

	 public int minPartitions(String n) {
		 return n.chars().map(ch -> ch - '0').max().getAsInt();
	    }
	 
	 public static void main(String[] args) {
		System.out.println(new PartitionIntoMinimumNumberOfDeciBinaryNumbers().minPartitions("82734"));
		System.out.println(new PartitionIntoMinimumNumberOfDeciBinaryNumbers().minPartitions("27346209830709182346"));
	}
}
