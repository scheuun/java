package ch05.ex05.case02;

public class Calculator {
	public double add(int a, int b) {
		return a + b; // promotion 됨
	}
	
	public double add(double a, double b) {
		return a + b;
	}
}
