package ch04.home.ex02;

import java.util.Scanner;

public class H03Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 표 련산시 Fair: 0 win: -2, 1 lose: -1, 2
		int playerChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice = "";
		
		System.out.print("1.가위, 2.바위, 3.보\n> ");
		playerChoice = sc.nextInt();
		
		if(1 <= playerChoice && playerChoice <= 3) {
			appChoice = (int)(Math.random() * 3) + 1;
			switch(playerChoice - appChoice) {
			case -2: case 1: 
			result = "You win. "; break;
			case -1: case 2:
			result = "You lose."; break;
			case 0:
			result = "Fair. ";
			}
		
			switch(playerChoice) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보";
			}
			System.out.println("You: " + choice);
			
			switch(appChoice) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보";
			}
			System.out.println("Me: " + choice);
		} else {
			result = "ERROR] 1, 2, 3 중의 하나를 입력하세요.";
		}
		
		System.out.println(result);
	}
}

/*Scanner sc = new Scanner(System.in);
int You = 0;
int Me = (int)(Math.random() * 3)+1;
String you = "";
String me= "";
String result = "";

System.out.print("1.가위, 2.바위, 3.보\n>");
You = sc.nextInt();

if(You == 1) you = "가위";
else if(You == 2) you = "바위";
else if(You == 3) you = "보";
System.out.println("You: " + you);

if(Me == 1) me = "가위";
else if(Me == 2) me = "바위";
else if(Me == 3) me = "보";
System.out.println("Me: " + me);

if(Me == 1 && You == 2 || Me == 2 && You == 3 || Me == 3 && You == 1) result = "You win.";
else if(Me == 2 && You == 1 || Me == 3 && You == 2 || Me == 1 && You == 3) result = "You lose.";
else result = "Fair.";
System.out.println();
System.out.println(result);*/