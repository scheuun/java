package ch07.ex06.case05;

public class Main {
	public static void main(String[] args) {
		Box box = new Box();
		Integer[] arr1 = {1, 2, 3};
		String[] arr2 = {"a", "b", "c"};
		
		int i = box.getLastVal(arr1); // 마지막 값 메소드 콜시 제너릭 타입 결정 Integer
		String s = box.getLastVal(arr2); // String 배열 리턴타입 String
		
		System.out.printf("%d %s", i, s);
	}
}
