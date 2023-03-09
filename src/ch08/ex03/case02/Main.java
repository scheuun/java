package ch08.ex03.case02;

public class Main {
	public static void main(String[] args) {
		String userId = "hello";
		
		try {
			if(userId.length() > 3)
				throw new LengthException("길이가 초과되었습니다.");
		} catch(LengthException e) {
			e.printStackTrace();
		}
		
		/*
		if(userId.length() > 3)
			throw new LengthException("길이가 초과되었습니다."); throw는 exception 던짐
		*/
		
		throw new NumberException("숫자가 아닙니다.");
	}
}
