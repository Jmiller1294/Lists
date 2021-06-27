
public class LinkedList<I extends Comparable<I>> implements ListInterface<I>{
	
	LinkedListNode<I> head;
	LinkedListNode<I> tail;
	LinkedListNode<I> curr;
	LinkedListNode<I> prev;
	int length;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.curr = null;
		this.prev = null;
		this.length = 0;
	}
	
	
	public ListInterface<I> copy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return this.length;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}
	
	@Override
	public void add(I element) {
		if(isEmpty()) {
			head = new LinkedListNode<I>(element, null);
			curr = head;
			tail = head;
			this.length++;
		}
		else {
			prev = curr;
			curr.setNext(new LinkedListNode<I>(element, null));
			curr = prev.getNext();
			tail = curr;
			this.length++;
		}
	}

	@Override
	public void add(I element, int index) throws IndexOutOfBoundsException {
		
	}

	@Override
	public void addSorted(I element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public I get(int index) throws IndexOutOfBoundsException {
		LinkedListNode<I> current = this.head;
		for(int i = 0;i < index;i++) {
			current = current.getNext();
		}
		return current.getElement();
	}

	@Override
	public I replace(I element, int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public I remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		
	}

}
