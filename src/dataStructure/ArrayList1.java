package dataStructure;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		//ArrayList 사용법
		//Craet 생성	
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		//Add 데이터 추가
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println(numbers);
//		[10, 20, 30, 40]
		
		numbers.add(1,50);
		System.out.println(numbers);
//		[10, 50, 20, 30, 40]
		
		
		//Remove 삭제
		
		numbers.remove(2);
		System.out.println(numbers);
//		[10, 50, 30, 40]
		 
		
		//Get 가져오기
		
		System.out.println(numbers.get(2));
//		30
		
		//Size 크기
		
		System.out.println(numbers.size());
		
		//Iteration 반복
		
		Iterator it = numbers.iterator();
		System.out.println("\n while");
		while(it.hasNext()) {
			int value = (int)it.next();
			if(value == 30) {
				it.remove();
			}
			System.out.println(value);
		}
		System.out.println(numbers);
				
		
		System.out.println("\n for each");
		for(int value : numbers) {
			System.out.println(value);
		}
		
		System.out.println("\n for");
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));	 
		}
		
		
		
		
		
		
		
		
		
		
	}
}
