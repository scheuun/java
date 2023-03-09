package ch06.ex04.case03;

public class Duck extends Object { // extends Object 쓰지 않아도 있음 상속을 전제
	@Override
	public String toString() { // 도메인에서 데이터 읽고 콘솔에서 읽을때
		return "오리";
	}
}
