
public class DataTypeExample {

	public static void main(String[] args) {

		// 자바의 변수 데이터타입은 크게 2가지
		// a)기본타입 b)참조타입
		// 작게 4가지가 있따
		// a)정수 b)실수 c)논리 d)참조 a, b, c = 기본타입 // d = 참조타입

		// 평수 이름;
		// 1바이트의 정수형, age를 선언
		byte age; // -> 메모리에 1Byte 공간이 생기고 이름을 age로 지었다. // 선언
		age = 10; // 할당(값)
		age = (byte) (age + 10); // 10을 int로 인식해서 우항이 4Byte로 인식 됨 (Integer가 정수의 기본형이라서)
		// 그래서 byte로 형변환 해주거나 처음부터 age를 int로 선언하기
		System.out.println(age); // 사용

		long b = 100;
		b = age + 100; // 좌항 : long 8 bytes = 우항 : age + 100 (int 4bytes)

		char charValue = 25279;
		System.out.println("65 = " + charValue);

		float a = 1.1f; // --1.1만쓰면 기본형인 double이라서 데이터 타입 mismatch

		double a2 = 100.0; // -- 소수점 (실수)는 기본 double이기 때문에 f없이도 사용 가능.

		boolean isName = true; // false

		long ewq = 2111111111;
		// long ewq = 2222222222; // 에러가 뜸으로 2222222222L로 L 적어줘야함! 21억 넘으면 L 붙여야함!!!!!!!

		char a1 = 'A';
		System.out.println("a:" + a1);
		int b1 = a1;
		System.out.println("b1:" + b1);
		char c1 = 66;
		System.out.println("c1:" + c1);
		int d1 = b1 + c1;
		System.out.println("d1:" + d1);
		
		// 상수와 변수 차이
		int address1 = 100;
		address1 = 200;

		// 상수: 변경되지 않을 부분을 선언 (PI, 키패드 방향키...)
		final int address2 = 300; // 상수는 일반적으로 선언과 동시에 값 할당
		//address2 = 310;	// 한 번 값이 할당되면, 변경 불가
		// 상수명은 일반적으로 모두 대문자를 사용
		final int HELLO_WORLD =100; // 스네이크 표기법 사용
		
		
		
	}
}





















