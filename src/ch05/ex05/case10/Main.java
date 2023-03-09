package ch05.ex05.case10;

public class Main {
	public static void main(String[] args) {
		Pajamas pajamas = new Pajamas();
		Man man = new Man();
	
		man.strip(); // 클라이언트가 호출
		man.wash();
		man.wear(pajamas);
		man.lie();
		
		man.strip(); // 다음날
		man.wash();
		man.wear(pajamas);
		man.lie();
		
		man.sleep(pajamas);
		man.sleep(pajamas);
	}
}
