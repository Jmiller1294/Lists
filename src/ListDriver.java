
public class ListDriver implements ListDriverInterface{
	
	public static void main(String[] args) {
    //	ArrayBasedList<Integer> lis = new ArrayBasedList<Integer>();
	//	lis.add(0);
	//	lis.add(3);
	//	lis.add(4);
	//	lis.add(7);
	//	lis.add(10);
	//	lis.add(12);
	//	lis.add(11);
	//	lis.add(9);
	//	lis.add(16);
	//	lis.addSorted(2);
	//	System.out.println(lis.get(0));
	//	System.out.println(lis.get(0));
	//	System.out.println(lis.get(2));
	//	System.out.println(lis.get(3));
	//	System.out.println(lis.get(4));
	//	System.out.println(lis.get(5));
	//	System.out.println(lis.get(6));
	//	System.out.println(lis.get(7));
	//	//System.out.println(lis.get(8));
		
	LinkedList<Integer> list = new LinkedList<Integer>();
//	list.add(2);
//	list.add(3);
//	list.add(4);
//	list.add(5);
//	list.add(6);
//	list.add(7);
	//System.out.println(list.head.getNext().getElement());
//	System.out.println(list.head.getElement());
//	System.out.println(list.tail.getElement());
//	System.out.println(list.get());
	}
	
	
	
	
	@Override
	public ListInterface<Integer> createList(ListDriverInterface.ListType listType,
			ListDriverInterface.TestType forTestType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListInterface<Integer> initializeList(ListInterface<Integer> list, int firstNumber, int lastNumber,
			int increment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double memoryUsage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] runTestCase(ListDriverInterface.ListType listType, ListDriverInterface.TestType testType,
			int numberOfTimes) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
