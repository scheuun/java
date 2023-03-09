package ch03.ex01;

public class C01PlusPlus {
	public static void main(String[] args) {
		int i = 0;
		++i;
		System.out.println(i);
		
		i++;
		System.out.println(i);
		
		i = 0;
		int j = ++i; // ++먼저 살행
		System.out.printf("i:%d, j:%d\n", i, j);	
		
		i = 0;
		j = i++; // i의 0읽고 나서 ++실행 1
		System.out.printf("i:%d, j:%d\n", i, j);	
	}
}
