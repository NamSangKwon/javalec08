
public class VarExamples {

	public static void main(String[] args) {
		
		// 변수는 개발자가 쉽게 데이터에 접근하고, 사용, 삭제(해제)
		// 할 수 있도록 값을 넣을 수 있는 공간입니다.
		
		// 자료형(데이터 타입) 변수명; --> ex) 평형 집이름;
		int age; // 변수(공간)을 메모리에 할당(만듬) 4Byte 
				 // -> 변수 age를 선언한다.
		
		age = 10; // age라는 공간에 10이라는 값을 넣는다.
		System.out.println("나이는 " + age + "살 입니다.");
		
		age = -10; // 기존의 AGE공간에 있던 10을 지우고 -10으로 바꾼다.
		System.out.println("변경된 나이는 " + age + "살 입니다.");
		
		int age2 = 20; // 공간 생성과 동시에 값을 초기화(넣는)작업도 가능하다
		System.out.println("나이는 " + age2 + "살 입니다.");
		
		age2 = 100;	// int age2 = 100; 은 선언이 두번 된거니까 당연히 안됨!
	}
}
