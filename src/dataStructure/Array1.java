package dataStructure;

public class Array1 {

	public static void main(String[] args) {
		//배열 생성 
		//데이터타입, 이름, 배열크기
		int[] numbers1 = new int[4];
		String[] strings = new String[4];
		
		numbers1[0] = 10;
		numbers1[1] = 20;
		numbers1[2] = 30;
		
		int[] numbers2 = {10,20,30,40};
		int[] numbers3 = new int[] {10,20,30,40};
		
		
		//Get 가져오기
		
		System.out.println(numbers1[0]);
		System.out.println(numbers1[3]);
		System.out.println(strings[3]);
		//빈공간 숫자는 0 문자는null
		
		//배열의 길이
		System.out.println(numbers1.length);
		
		//Iteration 반복
		
		int i = 0;
		while(numbers1.length > i) {
			System.out.println(numbers1[i]);
			i++;
		}
		
		for(i = 0; numbers1.length > i; i++) {
			System.out.println(numbers1[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
