package ch05.home.ex01.case01;

public class Main {
	public static void main(String[] args) { 
		Flower flower1 = new Flower();
		Flower flower2 = new Flower();
		
		flower1.name = "창포꽃";
		flower1.petalLength = 7;
		flower1.sepalLength = 2;

		flower2.name = "코스모스";
		flower2.petalLength = 4;
		flower2.sepalLength = 1;			
 	}
}
/*
창포꽃은 꽃잎 실이가 7cm, 꽃팓침 길이가 2cm입니다.
코스모스는  4 ,  1

System.out.printf("%s은 꽃잎 길이가 %dcm, 꽃받침 길이가 %dcm입니다.\n", flower1.name, flower1.petalLength, flower1.sepalLength);
System.out.printf("%s는 꽃잎 길이가 %dcm, 꽃받침 길이가 %dcm입니다.\n", flower2.name, flower2.petalLength, flower2.sepalLength);
출력하지 않음 
*/