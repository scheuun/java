package ch06.ex04.case02;

public class Cat extends Animal {
	@Override // metadata / 없어도 되지만 shout를 추가로 쓴것 같음
	public void shout() { // 몸체 교체
		System.out.println("야옹야옹");
	}	
}
