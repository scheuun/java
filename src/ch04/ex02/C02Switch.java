package ch04.ex02;

public class C02Switch {
	public static void main(String[] args) {
		String grade = "silver";
		String coupon = "";
		
		switch(grade) { // integer( byte, short, char, int)
		case "gold": coupon += "10,000원 ";
		case "silver": coupon += "5,000원 ";
		case "copper": coupon += "1,000원";
		}
		
		System.out.println(coupon);
	}
}