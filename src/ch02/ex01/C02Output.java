package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100); // JRE에 있는 것 갖다씀
		System.out.println(score);
		System.out.println(100 + 1);
		System.out.println(Math.random());
		
		System.out.print(200);
		System.out.print(300);
		System.out.print("\n");
		System.out.println(400);
		
		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.15, "hello");
		System.out.printf("%b/%c/%d/%f/%s\n", true, 'a', 10, 1.15, "hello");
		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n", true, 'a', 10, 1.156, "hello");
		//앞부분.2 자릿수 조절,  5 스페이스 문자 자리차지, -위치 정렬, 자리 확인시 |활용
		
		String name = "최한석";
		int age = 22;
		System.out.printf("%s %d", name, age);
		System.out.printf("\n%s은 %d살입니다.", name, age);
		System.out.println();
		System.out.println(name + "은 " + age + "살입니다.");
		//괄호안 expression(연산자가 포함된 수식) 	
	}
}
