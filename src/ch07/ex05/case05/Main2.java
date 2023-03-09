package ch07.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<Cat> floor1 = new ArrayList<>();
		List<Cat> floor2 = new ArrayList<>();
		List<List<Cat>> house = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			floor1.add(new Cat("고양이" + i)); // Console이 땅 고양이 집어 넣음
			floor2.add(new Cat("야옹이" + i));
		}
		
		System.out.printf("%s\n%s\n", floor1, floor2);
			
		house.add(floor1);
		house.add(floor2);		
		System.out.println(house);
		
		// 과제] 고양이 여섯마리에게 밥먹여라			
		for(List<Cat> floor: house) // 1층에서 꺼냄 부모 for 레코드 이동
			for(Cat cat: floor) cat.eat(); // 자식 for 필드 이동
	}
}

