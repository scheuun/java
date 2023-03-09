package ch08.ex03.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C03Try {
	public static void main(String[] args) {
		PrintWriter out = null;
		int[] arr = {1, 2, 3};
		
		try {
			out = new PrintWriter(new FileWriter("c: /DEV/a.txt")); // EileWriter로 랩핑하여 객체
		
			for(int i = 0; i < arr.length; i++)
				out.println("arr[" + i + "]: " + arr[i]);
		} catch(ArrayIndexOutOfBoundsException e) {
			out.println("배열 예외 발생.");
		}catch(IOException e) {
			System.out.println("IO 예외 발생"); // null exception 
		} finally {
			if(out != null) out.close();
		}
		
		System.out.println("끝.");
	}
}

// 메모장파일에 나타남
