package ch06.ex06.case09;

public class Main {
	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
		
		console.out();
		browser.out();
		
		UI.in();
		//console.in(); 인터페이스 메소드 상속안됨 default 상속됨 static 상속안됨
		//browser.in();
		//Console.in();
		//Browser.in();
		
		System.out.println();
		Chrome chrome = new Chrome();
		//chrome.in();
		chrome.out();
		
		chrome.play();
		Chrome.play();
		Browser.play();
	}
}
