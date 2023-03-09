package ch07.ex04.case01;

public class Array {
	public static void main(String[] args) { // 배열은 객체 데이터 n개를 참고로 쓰는 것이 목적
		String[] strs = new String[3]; // 배열[] 배열생성자[] 길이 값의 개수 String (원소 타입) 개수 3개 담을 수 있는 객체 생성
		System.out.println(strs);
	
		Integer[] integers = new Integer[3];
		System.out.println(integers);
		
		int[] ints = new int[3];
		System.out.println(ints);
		
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]); // 변수명 자동부여 heap에 저장 자동초기화
		System.out.printf("%d %d %d\n", integers[0], integers[1], integers[2]); // null은 string도 int도 아님
	
		ints[1] = 1000;
		System.out.println(ints[1]);
		
		for(int i = 0; i < ints.length; i++) ints[i] = i; // length 3
		
		for(int i = 0; i < ints.length; i++)
			System.out.printf("%d ", ints[i]);
		System.out.println();
		
		for(int i: ints) System.out.printf("%d ", i); // 순차적으로 읽음 ints  collection
		
		int[] arr = {0, 1, 2};
		arr = new int[] {0, 1, 2};
	}
}
