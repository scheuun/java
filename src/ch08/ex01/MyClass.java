package ch08.ex01;

// @Field
@Universal
@Type(name="class", value=1)
public class MyClass {
	@Field(1) @Universal
	private String name;
	
	@Constructor
	public MyClass() {
		
	}
	
	@Method
	public void play(@Param String name, int age) {
		@Local int i = 0;
	}
}
