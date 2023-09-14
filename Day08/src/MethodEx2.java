// 인자를 제한없이 받는 방법
// 1. 배열
//	  메서드명 ( 데이터타입[] 변수명 )
// 2. 인자를 데이터타입 ... 변수명으로 받기
//	  메서드명 ( 데이터타입 ... 변수명 )

import java.util.Arrays;

public class MethodEx2 {

	static int getAddAll(int[] x) {
		int result = 0;
		for (int val : x) {
			result += val;
		}

		return result;
	}

	static void printAddAll(int... x) { // 가변인자 : 인자의 수를 제한하지 않는다.
		int result = 0;
		for (int val : x) {
			result += val;
		}
		System.out.println(result);
	}

	// static void printAddAllDoubleParam(int ...x, String name) {
	// Error ! 가변인자는 무조건 맨 뒤 선언 !
	static void printAddAllDoubleParam(String name, int... x) {
		System.err.println("나는 " + name + "입니다.");
		System.out.println("저한테 넘어온 int ... x 는");
		for (int val : x) {
			System.out.println(val);
		}
	}

	// 메서드를 선언
	// 메서드 명은 sliceArray
	// 인자는 int[], int from
	// return int[]
	// 실행문 인자로 받은 int[]의 from 인덱스 부터 끝까지의 배열 값을 복제해서 return 해라.

	static int[] sliceArray(int[] x, int from) {
		int[] result;
		result = Arrays.copyOfRange(x, from, x.length);
		return result;
	}
	
	static int[] sliceArray2(int[] x, int from) {
		// 1. 복제할 temp 배열을 만들어 주자.
		int[] result = new int[x.length-from];
		
		// 2. 복제대상 배열변수에 인자로 넘어온 x 배열변수 값을 복제
		// i = result의 인덱스, from은 x배열의 인덱스
		// for(a;b;c) -> a,b,c는 따로 / 같이 놀 수 있다 (반드시 같이 존재하는 것은 아님 )
		for (int i = 0; from < x.length; from++) {
			result[i] = x[from];
			i++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// 배열인자로 넘기기
		int[] param = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int getResult = getAddAll(param); // int[] x // 배열인자 : 인자의 수를 제한하지만, 그 값은 배열 길이 제한이 없다.
		System.out.println(getResult);

		// 가변인자로 넘기기
		printAddAll(1, 2, 3, 4, 5, 6, 7, 8, 9); // int ... x

		// 고정인자 + 배열인자로 넘기기
		printAddAllDoubleParam("김이박", 1, 2, 3, 4, 5, 6, 7, 8, 9);

		// 퀴즈
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = sliceArray(a, 1 );
		int[] c = sliceArray2(a, 1 );
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		// 재활용 가능
		int[] x = {1,2,3,4,5,6,7,8,9,10};
		int[] r = sliceArray2(x,3);
		int[] y = sliceArray2(r,4);
		System.out.println(Arrays.toString(r));
		System.out.println(Arrays.toString(y));
		

	}

}
