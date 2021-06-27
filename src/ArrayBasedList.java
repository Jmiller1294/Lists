import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayBasedList<I extends Comparable<I>> implements ListInterface<I> {
	
	private int length = 0;
	private I[] list;
	
	@SuppressWarnings("unchecked")
	public ArrayBasedList() {
		   this.list = (I[]) new Comparable[0];
	       //this.comparator = comparator;
	   }
	
	public int size() {
		return this.list.length;
	}

	@Override
	public ListInterface<I> copy() {
		return this;
	}

	@Override
	public boolean isEmpty() {
		return this.list.length == 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void add(I element) {
		if(isEmpty()) {
			list = resize(this.list, 2);
			list[length] = element;
			length++;
		}
		else if(length == list.length) {
			list = resize(list, list.length + 1);
			list[length] = element;
			length++;
		}
		else {
			list[length] = element;
			length++;
		}
	}
	
	public static <I> I[] resize(I[] array, int newLength) {
	    return Arrays.copyOf(array, newLength);
	}

	@Override
	public void add(I element, int index) throws IndexOutOfBoundsException {
		if(isEmpty()) {
			list = resize(this.list, 2);
			list[length] = element;
			length++;
		}
		else if(index == list.length) {
			list = resize(list, list.length + 1);
			list[index] = element;
			length++;
		}
		else {
			list[index] = element;
			length++;
		}
	}

	@Override
	public void addSorted(I element) {
		if(isEmpty()) {
			add(element);
		}
		else {
			
			int i = 0;
		    for(I a: this.list) {
		    	if(element.compareTo(a) < 0) {
		    		break;
		    	}
		     }
		    add(element, i);
		}
	}

	@Override
	public I get(int index) throws IndexOutOfBoundsException {
		return this.list[index];
	}

	@Override
	public I replace(I element, int index) throws IndexOutOfBoundsException {
		I obj = this.list[index];
		list[index] = element;
		return obj;
	}

	@Override
	public I remove(int index) throws IndexOutOfBoundsException {
		I obj = this.list[index];
		for(int i = index; i < this.list.length - 1; i++) {
			this.list[i] = this.list[i + 1];
		}
		return obj;
	}

	@Override
	public void removeAll() {
		list = resize(this.list, 0);
		length = 0;
	}
	
	@SuppressWarnings("hiding")
	public static <Integer> void printArray(Integer[] array){
        for (Integer element: array){
            System.out.println(element);
        }
    } 


	
}