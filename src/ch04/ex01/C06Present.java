package ch04.ex01;

import java.util.Scanner;

public class C06Present { // 경품
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int choice = 0;
	String prize = "";
	
	System.out.print("1.냉장고, 2.세탁기\n> ");
	choice = sc.nextInt();
		
	if(choice == 1) prize = "냉장고";
	else if (choice == 2) prize = "세탁기";
	else prize = "화장지";
	
	System.out.println(prize);
	}
}

// 1, 2외의 숫자릉 입력하면 화장지