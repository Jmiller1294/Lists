import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayBasedList<I extends Comparable<I>> implements ListInterface<I> {
	
	public static void main(String[] args) {
		ArrayBasedList<Integer> lis = new ArrayBasedList<Integer>();
		lis.add(2);
		lis.add(4);
		lis.add(7);
		lis.add(10);
		lis.add(12);
		lis.add(11);
		lis.add(9);
		lis.add(16);
		lis.addSorted(8);
		System.out.println(lis.get(0));
		System.out.println(lis.get(1));
		System.out.println(lis.get(2));
		System.out.println(lis.get(3));
		System.out.println(lis.get(4));
		System.out.println(lis.get(5));
		System.out.println(lis.get(6));
		System.out.println(lis.get(7));
		//System.out.println(lis.get(8));
	}
	
	private int length = 0;
	private I[] list;
	
	@SuppressWarnings("unchecked")
	public ArrayBasedList() {
		   list = (I[]) new Comparable[0];
	       //this.comparator = comparator;
	   }
	
	public int size() {
		return list.length;
	}

	@Override
	public ListInterface<I> copy() {
		return this;
	}

	@Override
	public boolean isEmpty() {
		return list.length == 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void add(I element) {
		if(isEmpty()) {
			list = resize(list, 2);
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
			list = resize(list, 2);
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
		    for(I a: list) {
		    	if(element.compareTo(a) >= 0) {
		    		System.out.println("greater");
		    		i++;
		    	}
		    	else if(element.compareTo(a) < 0) {
		    		System.out.println("less");
		    		break;
		    	}
		     }
		    System.out.println(i);
		    add(element, i);
		}
	}

	@Override
	public I get(int index) throws IndexOutOfBoundsException {
		return list[index];
	}

	@Override
	public I replace(I element, int index) throws IndexOutOfBoundsException {
		I obj = list[index];
		list[index] = element;
		return obj;
	}

	@Override
	public I remove(int index) throws IndexOutOfBoundsException {
		I obj = list[index];
		for(int i = index; i < list.length - 1; i++) {
			list[i] = list[i + 1];
		}
		return obj;
	}

	@Override
	public void removeAll() {
		list = resize(list, 0);
		length = 0;
	}
	
	@SuppressWarnings("hiding")
	public static <Integer> void printArray(Integer[] array){
        for (Integer element: array){
            System.out.println(element);
        }
    } 


	
}