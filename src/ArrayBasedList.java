import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayBasedList<I extends Comparable<I>> implements ListInterface<I> {
	public static void main(String[] args) {
		ArrayBasedList<Integer> lis = new ArrayBasedList<Integer>();
		lis.add(1);
		System.out.println(lis.isEmpty());
		lis.removeAll();
		System.out.println(lis.isEmpty());
	}
	private int index = 0;
	private I[] list;
	//private Comparator<I> comparator;
	
	//ArrayList<I> list = new ArrayList<I>(10);
	
	@SuppressWarnings("unchecked")
	public ArrayBasedList() {
		   list = (I[]) new Comparable[0];
	       //this.list = (I[]) new Object[size];
	       //this.comparator = comparator;
	   }
	
	public int size() {
		return list.length;
	}

	@Override
	public ListInterface<I> copy() {
		return null;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSorted(I element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public I get(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
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
		list = resize(list, 0);
		index = 0;
	}
	
	public static < E > void printArray(E[] elements) {  
        for (E element : elements){          
            System.out.println(element );  
         }  
         System.out.println();  
    }  


	
}