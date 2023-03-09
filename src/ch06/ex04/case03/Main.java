package ch06.ex04.case03;

public class Main {
	public static void main(String[] args) {
		Duck duck = new Duck();
		Hen hen = new Hen();
		
		System.out.printf("%s\n%s", duck, hen.toString());	// 코딩하지 않아도 객체에는 toString이 있음 리턴ㄱ밧으로 나옴
	}
}
