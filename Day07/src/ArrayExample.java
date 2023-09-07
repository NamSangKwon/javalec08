import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		// 1.배열을 선언하는 법. <- 배열공간(값이 들어갈 곳)을 만들지 않음
		int[] a;
		int b[];
		
		// 2.선언과 동시에 초기화
		int c[] = {1,992,3};	// 방 3개 짜리 배열 변수

		// 3. 선언 + 빈공간 할당
		int[] d = new int[10];

		//int[] d = new int[2147483647];
		
		System.out.println("c변수의 2번째 방에 있는 값 : " + c[1]);
		c[0] = -10;
		System.out.println("c[0] = " + c[0]);

		// ex
		int x[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(x));	// ★배열의 모습을 한 번에 보고싶어오
		
		// for문
		for(int i = 0; i<(x.length); i++) {
			System.out.println("x["+i+"] = "+ x[i]);
		}
		System.out.println();
		// while문
		int i2 = 0;
		while(i2<=(x.length)-1) {
			System.out.println("x["+i2+"] = "+ x[i2]);
			i2++;
		}
		
		// 향상된 for문
		for(int val : x) {
			System.out.println("val : " + val);
		}
		
		

	}

}
