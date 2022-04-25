import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer> {

	Iterator<Integer> iterator;
	Integer next;

	public PeekingIterator(Iterator<Integer> iterator) {
		this.iterator = iterator;

		if (this.iterator.hasNext()) {
			next = this.iterator.next();
		} else {
			next = null;
		}
	}

	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		return next;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		Integer currentValue = next;
		if (this.iterator.hasNext()) {
			next = this.iterator.next();
		} else {
			next = null;
		}
		return currentValue;
	}

	@Override
	public boolean hasNext() {
		return (next != null);
	}
}