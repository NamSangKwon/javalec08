
public class CalExampl01 {

	public static void main(String[] args) {

		// 비트연산 - 2wlstn dustks
		// true : 1, false : 0
		// &,|,^,~

		int x = 10;
		int y = 7;
		
		System.out.println("10 = " + Integer.toBinaryString(x));
		System.out.println(" 7 = " + Integer.toBinaryString(y));

		// 1. x & y
		System.out.println("x & y = " + (x & y));
		
		// 2. x | y
		System.out.println("x | y = " + (x | y));
		
		// 3. x ^ y
		System.out.println("x ^ y = " + (x ^ y));
		
		// 4. x ~ y
		System.out.println("~(x & y) " + ~(x & y));
		
		int x1 = -1;
		System.out.println(Integer.toBinaryString(x1));
		
		// << Left Shift
		int r1 = x1 << 2;
		System.out.println(Integer.toBinaryString(r1));
		
		// >> Light Shift
		// 라이트 쉬프트는 무조건 부호에 따라 남은 공간을 채워줌
		byte r2 = -128;
		System.out.println("-128 : " + Integer.toBinaryString(r2));
		System.out.println("-128 : " + Integer.toBinaryString(r2 >> 2) + " 마지막 00이 사라지고 맨 앞에 11(양수)이 채워짐    ");
		
		r2 = 127;
		System.out.println("127 : " + Integer.toBinaryString(r2));
		System.out.println("127 : " + Integer.toBinaryString(r2 >> 2) + " 마지막 11이 사라지고 맨 앞에 00(음수)이 채워짐    ");
		// byte에서 2진수로 가장 작은 값은
		// 1000 0000 = -128
		// 가장 큰 값은
		// 0111 1111 = 128
		
		// >>> 우측이동시, 좌측에 있는 부호비트 + 나머지를 모두 0으로 채워준다.
		r2 = -10;
		System.out.println("-10 : " + Integer.toBinaryString(r2));
		System.out.println("-10 : " + Integer.toBinaryString(r2 >>> 2) + " 맨 앞에 00이 채워져서 눈에 안보임 => 결국 무조건 양수가 됨");
		
//		x = 2 ;
//		x = x * 2 * 2 * 2; // 2의 3승
//		
//		y = 2 ; 
//		y = y << 3 ; // 2의 3승
		
		System.out.println();
		
		int z1 = 10;
		System.out.println("z1 = " + Integer.toBinaryString(z1));
		System.out.println("5 = " + Integer.toBinaryString(5));
		
		z1 &= 5; // z1 = z1 & 5;
		System.out.println("5 = " + Integer.toBinaryString(z1));
		
		boolean b1 = true;
		b1 &= (z1 > 1 || z1 << 2 > 10);
		System.out.println("b1 = " + b1);
		
		System.out.println();
		// 3항 연산자
		int grade = 6;
		int age = 0;
		
		age = (grade == 5 ? 12 : -1);
		System.out.println("학년 : " + grade + ", 나이 : "+ age);
		
		age = age++ *10;
		System.out.println("학년 : " + grade + ", 나이 : "+ age);

		
		
		
		
		
		
		
		
		
		
		}

}