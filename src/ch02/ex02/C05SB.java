package ch02.ex02;

public class C05SB {
	public static void main(String[] args) {
		StringBuffer src = new StringBuffer("우리 개는 "); // 자체 편집
		
		int len = src.length();
		System.out.println("length: " + len);
		
		src.append("짖는다."); // 데이터 우리개는 제거->우리개는 짖는다로 생성 우리개는 짖는다와 짖느다만 존재
		src.replace(3, 4, "고양이"); //고양이로 바뀜
		
		System.out.println(src); //우리개는 데이터 없다-스트링 차이점 우리개는 짖는다로 src 변경
		
		String str = src.toString();//SB를 String으로 바꿈
	}
}
