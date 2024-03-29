public class LinkedListNode<I> {
	
	private I element;
	private LinkedListNode<I> next;
	
	public LinkedListNode(I element) {
		this.element = element;
		this.next = null;
	}
	
	public LinkedListNode(I element, LinkedListNode<I> next) {
		this.element = element;
		this.next = next;
	}
	
	public I getElement() {
		return this.element;
	}
	
	public void setElement(I element) {
		this.element = element;
	}
	
	public LinkedListNode<I> getNext() {
		return this.next;
	}
	
	public void setNext(LinkedListNode<I> next) {
		this.next = next;
	}
	
	
	
}
