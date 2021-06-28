
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
		LinkedListNode<I> current = this.head;
		for(int i = 0;i < index;i++) {
			current = current.getNext();
		}
		current.setElement(element);
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
		LinkedListNode<I> current = this.head;
		I prev = get(index);
		if(index == 0) {
			current.setElement(element);
			return prev;
		}
			for(int i = 0;i < index;i++) {
				current = current.getNext();
			}
			current.setElement(element);
			return prev;
	}

	@Override
	public I remove(int index) throws IndexOutOfBoundsException {
		LinkedListNode<I> foundNode = this.head;
		LinkedListNode<I> previous = null;
		LinkedListNode<I> afterNode = null;
	
		if(index == 0) {
			previous = this.head;
			this.head = this.head.getNext();
			return previous.getElement();	
		}
		if(index == length - 1) {
			previous = this.tail;
			this.tail = this.prev;
			this.curr = this.tail;
			return previous.getElement();
		}
		for(int i = 0;i < index;i++) {
			previous = foundNode;
			foundNode = foundNode.getNext();
			afterNode = foundNode.getNext();
		}
		
		previous.setNext(afterNode);
		this.length--;
		return foundNode.getElement();
	}

	@Override
	public void removeAll() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

}
