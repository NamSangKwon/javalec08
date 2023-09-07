import java.lang.reflect.Array;
import java.util.Arrays;

public class Array2Example {

	// 다차원 배열 사용
	public static void main(String[] args) {

		// 1.2차원배열 선언
		int[][] matrix; // = int mtarix[][]

		// 2.2차원배열 선언과 동시에, 데이터 공간만 만들기(값)
		int[][] matrix2 = new int[2][4];
		// 2개의 동으로 이루어져 있는 아파트 단지
		// 한 동은 방 4개로 구성되어 있다. = matrix 아파트단지는 총 8가구가 산다.
		// 내 친구의 집은 1동 3호에 삽니다.
		System.out.println(matrix2[0][2]);
		System.out.println(Arrays.toString(matrix2[0]));

		// 3.배열 선언과 동시에 초기화
		int m[] = { 1, 2, 3 };
		int matrix3[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3[i].length; j++) {
				System.out.println("matrix3[" + i + "][" + j + "] = " + matrix3[i][j]);
			}
		}

		for (int[] val1 : matrix3) {
			for (int val2 : val1) {
				System.out.println("향상된 for문 출력 : " + val2);
			}
		}

		int x1[] = {1,2,3,4};
		for(int val : x1 ) {
			System.out.println(val);
		}
		
		

	}

}