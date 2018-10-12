package dataStructure;

public class ArrayListExam2 {
	//private 멤버 변수로 Object를 담는 배열 elementData를 만들어라
	private int size = 0;
	private Object[] elementData = new Object[100];
	
	public boolean addLast(Object element) {
		
		elementData[size] = element;
		size++;		
		return true;
	}

	public boolean add(int index, Object element) {
		for(int i = size-1; i >= index; i--) {
			elementData[i+1] = elementData[i];
		}
		elementData[index] = element;
		size++;
		return true;
	}
	
	public boolean addFirst(Object element) {
		return add(0,element);
	}
}
