package ch04.ex02;

public class C03Switch {
	public static void main(String[] args) {
		String grade = "gold";
		String coupon = "";
		
		switch(grade) {
		case "gold": coupon += "10,000원 "; break; // break시는 block을 스콥값을 빠져나옴
		case "silver": coupon += "5,000원 "; break;
		case "copper": coupon += "1,000원";
		}
		
		System.out.println(coupon);
	}
}

