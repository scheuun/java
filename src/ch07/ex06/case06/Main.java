package ch07.ex06.case06;

public class Main {
	public static void main(String[] args) {
		Cabinet<A> cabinet1 = new Cabinet<>();
		Cabinet<B> cabinet2 = new Cabinet<>();
		// Cabinet<C> cabinet; A이하 아니기 때문
		
		A[] arr1 = {new A(), new A()};
		B[] arr2 = {new B(), new B()};
		C[] arr3 = {new C(), new C()};
		D[] arr4 = {new D(), new D()};
		
		cabinet1.getLastVal(arr1); // A로 결정하여 T는 A타입
		cabinet2.getLastVal(arr2); // B
		// cabinet2.getLastVal(arr3);
		cabinet1.getLastVal(arr2); // promotion
		// cabinet2.getLastVal(arr1); // arr2는 A타입을 가지고 있어 promotion 해서 안됨
		
		// cabinet1.getFinalVal(arr1); C이하만 받음
		// cabinet1.getFinalVal(arr2);
		cabinet1.getFinalVal(arr3);
		cabinet1.getFinalVal(arr4);
	}
}
