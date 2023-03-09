package ch08.ex01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
// annotation 만듦
@Retention(RetentionPolicy.SOURCE) // 스콥의 동의어 정의
@Target(ElementType.TYPE) // annotation 위치지정 위에
public @interface Type { // annotation Type override는 메소드 위에 functional은 클래스 위애
	String name();
	int value();
}

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD) //Field Enum
@interface Field { // 자바파일에 public 클래스 하나
	int value(); // 기본 속성명 value 속성값 int 속성명 생략 가능
}

@Retention(RetentionPolicy.RUNTIME) // 객체까지 살아있음
@Target(ElementType.CONSTRUCTOR)
@interface Constructor {
	int value() default 0;
}
// Class
@Target(ElementType.METHOD)
@interface Method {
	
}

@Target(ElementType.PARAMETER)
@interface Param {
	
}

@Target(ElementType.LOCAL_VARIABLE)
@interface Local {
	
}

@Target(ElementType.ANNOTATION_TYPE)
@interface Annotation {
	
}

@Target({ElementType.TYPE, ElementType.FIELD} )
@interface Universal {
	
}