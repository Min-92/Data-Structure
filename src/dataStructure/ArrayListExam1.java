package dataStructure;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExam1 {

	public static void main(String[] args) {

		//1. ArrayList Import하라.
		//2. String 을 담는 ArrayList  my_arr_list를 만들라.
		//3. my_arr_list에 원소를 추가하라.
		//4. 2번째 원소를 삭제하라
		//5. get을 사용해 1번째 원소를 출력하라
		//6. Iterator 객체 it을 만들어라.
		//7. Iterator, while 을 이용하여 my_arr_list의 모든 원소를 출력하라
		ArrayList<String> my_arr_list = new ArrayList<String>();
		
		my_arr_list.add("hello");
		my_arr_list.add("java");
		my_arr_list.add("world!");
		System.out.println(my_arr_list);
		
		my_arr_list.remove(2);
		System.out.println(my_arr_list);
		
		System.out.println(my_arr_list.get(1));
		
		Iterator<String> it = my_arr_list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());

		}
	}

}
