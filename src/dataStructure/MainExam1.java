package dataStructure;

public class MainExam1 {

	public static void main(String[] args) {
		ArrayListExam2 arrayList = new ArrayListExam2();
		
		arrayList.addLast(10);
		arrayList.addLast(20);
		arrayList.addLast(30);
		arrayList.addLast(40);
		
//		arrayList.addLast(3);
//		arrayList.addLast(5);
//		arrayList.add(1,4);
//		arrayList.addFirst(10);
		
		System.out.println(arrayList);
		
		ArrayListExam2.ListIterator li = arrayList.listIterator();
		
		
		while(li.hasNext()) {
			int number = (int)li.next();
			if(number == 30) {
				li.remove();
			}
		}
		
		System.out.println(arrayList);

		
		
		
		
		
		
		
		
		
		
		
		
//		while(li.hasNext()) {
//			System.out.println(li.next());
//		}
//		
//		while(li.hasPrevious()) {
//			System.out.println(li.previous());
//		}
		
//		System.out.println(arrayList);
//		
//		System.out.println(arrayList.size());
//		
//		System.out.println(arrayList.indexOf(10));
		
		
		
//		System.out.println(arrayList.removeFirst());
//		System.out.println(arrayList);
		
	}

}
 