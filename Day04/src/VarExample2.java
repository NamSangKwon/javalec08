
public class VarExample2 {

	public static void main(String[] args) {
		
		// 1.변수선언 2.할당(초기화) 3.사용
		// --1.데이터타입 변수명;
		// --2.변수명 = 값
		// --3.System.out.println(변수명); ...등등
		
		String name = "이종석";	// '참조'데이터타입(문자열-String)
		int age = 46; 			// '기본'데이터타입(정수-int)
		
		// 상수도 가능
		final float PI = 3.14f;
		final String dontChage = "바꾸지마";
				
		age = age - 10;			// 46-10 (사용)
		System.out.println("이름: " + name + ", 나이: " + age);
		
		System.out.println("제 이름은 이종석"				
				+"\n"	// new Line
				+"\r"	// 커서 맨 앞으로
				+"\t"	// tab
				+"입니다");
		System.out.println("나이는	XX입니다.");
		System.out.println("나이는\tXX입니다.");
		
		// 제 이름은 "이종석"입니다.
		String message = "제 이름은\"이종석\"입니다";
		System.out.println("제 이름은 \"이종석\"입니다" +"\t" + message);
		// \출력 방법
		System.out.println("리터럴은 \" \\ \"로 시작합니다.(보통은)");
	}
}
