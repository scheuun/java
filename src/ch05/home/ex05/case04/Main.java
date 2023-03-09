package ch05.home.ex05.case04;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Man man = new Man();
		
		man.setName("최한석");
		man.setAge(33);
		man.setBirthday(LocalDate.of(2025,6,7));
		
		man.sing();
		man.eat();
		man.run();
	}
}

/*
식당에서 한 남자가 다가와 앉습니다.
남자가 자기 소개를 합니다.
이름은 최한석, 나이는 33살, 생일은 2025-6-7입니다.

남자는 음식을 기다르는 동안 노래를 부립니다,
음식이 나오자 맛있게 먹ㄱ습니다.
다 먹더니 계산안하고 달려나갑니다.
*/