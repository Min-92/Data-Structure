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
	
	public Object remove(int index) {
		Object removed = elementData[index];
		
		for (int i = index; i <= size -2 ; i++) {
			elementData[i] = elementData[i+1];
		}
		
		elementData[size] = null;
		size--;
		return removed;
	}
	public Object removeFirst() {
		return remove(0);
	}
	
	public Object removeLast() {
		return remove(size-1);
	}
	
	public String toString() {
		String str = "[";
		for (int i = 0; i < size; i++) {
			str += elementData[i];
			if (i < size -1) {
				str += ",";
			}
		}
		return str + "]";
	}
	
	public Object get(int index) {
		return elementData[index];
	}
	
	public int size() {
		return size;
	}
	
	public int indexOf(Object o) {
		for (int i = 0; i < size; i++) {
			if (elementData[i] == o) {
				return i;
			}
		}
		return -1;
	}

	public ListIterator listIterator() {
		return new ListIterator();
	}
	
	public class ListIterator{
		private int nextIndex = 0;
		
		public Object next() {
			return elementData[nextIndex++];
		}
		
		public boolean hasNext() {
			return nextIndex < size();
		}
		
		public boolean hasPrevious() {
			return nextIndex > 0;
		}
		
		public Object previous() {
			return elementData[--nextIndex];
		}
		
		public void add(Object element) {
			ArrayListExam2.this.add(nextIndex++,element);
		}
		
		public void remove() {
			ArrayListExam2.this.remove(--nextIndex);
		}
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
