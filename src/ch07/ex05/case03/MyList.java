package ch07.ex05.case03;

import java.util.ArrayList;

public class MyList { // 원소 사이즈 안정함
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); 
		list.add(1); // 첫번째 원소값은 Integer 타입 0번째 1
		list.add(2); // 인덱스 지정안함 1.2
		list.add(3); // 2.3
		list.add(1); // 3.1
		
		System.out.println(list);
		
		for(int i: list) System.out.print(i + " ");
		System.out.println();
		
		System.out.println(list.get(0));
		
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " "); // get으로 값읽음
		System.out.println();
		
		// 과제] list의 모든 원소를 remove 하라.
		
		/*for(int i = 0; i < list.size(); i++) // 1,2,3,1 중 1 지워지면 앞으로 땡겨지고 2번째에 3지워지고 3번째 지울게 없음
			System.out.print(list.remove(i) + " "); // 리스트 값 삭제*/
		
		/*int size = list.size();
		for(int i = 0; i < size; i++)
			list.remove(i);
		System.out.println(list);*/
				
		
		for(int i = list.size() - 1; i >= 0; i--)
			list.remove(i);
		System.out.println(list);
	}
}
