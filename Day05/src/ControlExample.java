
// 제어문
// 1.조건제어, 2.반복제어
public class ControlExample {

	public static void main(String[] args) {
		// 1.조건제어
		// 1-1 if
		// 1-2 wtich ~ case

		int a = 0;
		if (a < 0) {
			// if(condition) { 실행문 }
			// condition이 true일 경우에 {} 블럭 안일 실행시킨다.
			System.out.println("a는 음수입니다.");
		} else {
			System.out.println("a는 양수입니다.");
		}

		int grade = 0;
		if (1 <= grade && grade <= 3) {
			System.out.println("저학년");
		} else if (grade == 4) {
			System.out.println("중간");
		} else if (grade >= 5 && grade <= 6) {
			System.out.println("고학년");
		} else {
			System.out.println("다시 넣어 주이소");
		}

		// Switch ~ case
		int x = 3;
		switch (x) {
		case 1:
			System.out.println("x는 1입니다.");
			break;
		case 10:
			System.out.println("x는 10입니다.");
			break;
		case 3:
			System.out.println("x는 3입니다.");
			break;
		default:
			System.out.println("여기는 디폴트(else)입니다.");
		}

		if (x == 1) {
			System.out.println("x는 1입니다.");
		} else if ( x == 10) {
			System.out.println("x는 10입니다.");
		} else if ( x == 3) {
			System.out.println("x는 3입니다.");
		} else {
			System.out.println("여기는 디폴트(else)입니다.");
		}

		// 정수 최대값 최소값 구하기
		int max = 1 << 30;
		int min =0;
		System.out.println("max : " + max + "=" + Integer.toBinaryString(max));
		
		//int, byte, short 최대값, 최소값을 출력하는 프로그램을 만드세요
		//연산은 "비트연산"만 가능
		
		System.out.println("int : " + min + "~" +max);
		
		
	}
}
