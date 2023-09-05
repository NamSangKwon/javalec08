
public class ForExample {

	// for문
	// for(초기화; 조건문; 증감식) {
	// 실행문
	// }
	// 문제: 1에서 10까지 숫자 중 짝수만 출력하시오.
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		//선언 미리 가능
		int a;
		for (a = 1; a <= 10; a++) {
			if (a % 2 == 0) {
				System.out.println(a);
			}
		}
		
		// 초기화 비워둘 수 있음
		int b =1; 
		for(;b<=10; b++) {
			if (b % 2 == 0) {
				System.out.println(b);
			}
		}
		
		// 무조건 트루라서 무한루프
		//for(;;) {
			
		//}
		
		

	}

}
