package ch02.ex02;

public class C04Str {
	public static void main(String[] args) {
		String src = "우리 개는 "; //source 매번 새로운 데이터가 생성
		String s1 = ""; // ""스트링 기몬값
		String s2 = "";
		String s3 = "";
		//String s4 = "";
		char c = 0;
		
		int len = src.length(); //길이값
		System.out.println("length: " + len);
		
		s1 = src.concat("짖는다."); //상수
		s2 = src.replace("개", "고양이");//교체
		s3 = src.substring(0, 4);//0 인덱스 4 길이(start Index, end Index)
		c = src.charAt(3);
		//s4 = src.substring(3, 4);
		String s4 = src.substring(3, 4);
		
		System.out.printf("%s\n%s\n%s\n%c\n%s", s1, s2, s3, c, s4);
	}
}
