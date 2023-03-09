package ch08.ex03.case01;

public class C02Try {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try {
			int result = arr[10]; // exception 발생 catch로 넘어감
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생.");
		}
		
		System.out.println("끝.");
	}
}
