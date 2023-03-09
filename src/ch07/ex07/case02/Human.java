package ch07.ex07.case02;

@FunctionalInterface
public interface Human { // Human 타입의 데이터는 function
	void say();
	
	static void walk() {
		System.out.println("Human walk.");
	}
	
	default void sleep() {
		System.out.println("Human sleep.");
	}
}
