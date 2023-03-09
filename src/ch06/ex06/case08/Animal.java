package ch06.ex06.case08;

public interface Animal { // 인터페이스하는 목적은 (케이스) 표준화
	default void eat() { // abstract 안들어감
		System.out.println("입으로 먹다.");
	}

	void move(); // 추상 메소드
}

