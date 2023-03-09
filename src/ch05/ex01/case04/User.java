package ch05.ex01.case04;

public class User { 
	private String name; 
	
	public void setName(String name) {  
		char familyName = name.charAt(0); // 0번째글자 뜯어냄
		
		if(familyName == '최')
			this.name = name;
		else this.name = "누구세요?";
	}
	
	public String getName() { 
		return this.name;
	}
}
