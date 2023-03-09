package ch05.re.ex05.home.case04;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Man man = new Man();
		
		man.setName("최한석");
		man.setAge(33);
		man.setBirthday(LocalDate.of(2025, 6, 7));
		
		man.sing();
		man.eat();
		man.run();
	}
}
