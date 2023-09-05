import java.util.Scanner;

public class BreakContinueEx {

	public static void main(String[] args) {

		int command = 0;

		for (;;) { // 무한루프
			System.out.print("숫자를 입력하세요 : ");
			Scanner in = new Scanner(System.in);
			command = in.nextInt();

			if(command < 0 ) {
				break;	// 반복문을 끝내겠다
			}
			
			System.out.println("입력값은 " + command + "입니다.");
			if(command > 0 ) {
				continue;	// 이번 roof를 끝내겠다	
			}
		}
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
	}
}
