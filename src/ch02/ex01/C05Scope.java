package ch02.ex01;

public class C05Scope {//범위
	public static void main(String[] args) {
		int i = 0;
		//int i = 0;
		int j = 0; // {}안 j의 스콥 안ㅇ의 값을 즉음
		{
			//int i = 0;
			int x = 0;
			int y = 0;
		}	
		int x = 0;//존재하지 않는 변수를 새로 만듦
	}
}
