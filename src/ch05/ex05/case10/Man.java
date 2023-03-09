package ch05.ex05.case10;

public class Man {
	public void strip() {} // (Man this) 들어가 있음 컴파일러가 자동으로 추가
	public void wash() {}
	public void wear(Pajamas pajamas) {}
	public void lie() {}

	public void sleep(Pajamas pajamas) { //멤버메소드가 멤버메소드 호출
		this.strip();	// this. 는 변수   Man 클래스가 데이터 타입 (man 객체) 자동으로 들어감
		this.wash();
		this.wear(pajamas); // 넘겨줌
		this.lie();
	}
}

