import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayBasedList<I extends Comparable<I>> implements ListInterface<I> {
	
	public static void main(String[] args) {
		ArrayBasedList<Integer> lis = new ArrayBasedList<Integer>();
		lis.add(1);
		lis.add(2);
		lis.add(3);
		lis.add(4);
		lis.add(5);
		lis.add(6);
		lis.add(7);
		lis.remove(3);
		System.out.println(lis.get(0));
		System.out.println(lis.get(1));
		System.out.println(lis.get(2));
		System.out.println(lis.get(3));
		System.out.println(lis.get(4));
		System.out.println(lis.get(5));
		System.out.println(lis.get(6));
	}
	
	private int index = 0;
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
		if(index == 0) {
			list = resize(list, 2);
			list[index] = element;
			index++;
		}
		else if(index == list.length) {
			list = resize(list, list.length + 1);
			list[index] = element;
			index++;
		}
		else {
			list[index] = element;
			index++;
		}
	}
	
	public static <I> I[] resize(I[] array, int newLength) {
	    return Arrays.copyOf(array, newLength);
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
		index = 0;
	}
	
	@SuppressWarnings("hiding")
	public static <Integer> void printArray(Integer[] array){
        for (Integer element: array){
            System.out.println(element);
        }
    } 


	
}