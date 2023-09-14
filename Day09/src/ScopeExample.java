
public class ScopeExample {

	static String name = "하앍하앍";	// 클래스 전역변수
	
	public static void printName() {
		System.out.println(name);
	}// printName 메서드 정의부 끝
	
	public static void main(String[] args) {
	
		String name = "이종석";	// 지역변수
		System.out.println(name);	// 지역변수 사용
		System.out.println(ScopeExample.name);	// 전역변수 사용

		printName();
		
		
// 지역변수 범위 테스트
//		{
//			int age = 10;
//		}
//		System.out.println(age);
//		
		
//		int i;
//		for(i=0; i < 10; i++) {
//			
//		}
//		System.out.println(i);
		
		


	}// 메인메서드 정의부 끝

}// 클래스 정의부 끝
