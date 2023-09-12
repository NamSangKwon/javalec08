import java.util.Arrays;

public class DeepCopyEx {

	public static void main(String[] args) {
		// Deep Copy ( 깊은 복사 )
		// 1. Heap 영역에서 실제 데이터를 복제 ( 각각의 heap데이터를 가지고 있으므로 연동 X )
		// 2. 새로 복제된 값의 주소값을 넣는다.

		int a[] = { 1, 2 };
		int b[] = { 3, 4, 5 };
		int temp[] = new int[3];

		for (int i = 0; i < b.length; i++) {
			temp[i] = b[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		a = temp;
		b[1] = -10;

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		// 배열 복사에 관련되서는 함수(메서드)를 기본 제공
		int aa[] = { 1, 2 };
		int bb[] = { 0, 1, 2, 3 };
		bb = aa; // 얕은 복사 방법!
		System.out.println("aa(" + System.identityHashCode(aa) + ") = " + Arrays.toString(aa));
		System.out.println("bb(" + System.identityHashCode(bb) + ") = " + Arrays.toString(bb));
		bb = aa.clone(); // 깊은 복사 방법!
		System.out.println("aa(" + System.identityHashCode(aa) + ") = " + Arrays.toString(aa));
		System.out.println("bb(" + System.identityHashCode(bb) + ") = " + Arrays.toString(bb));

		//Deep Copy
		int cc[] = { 1, 2 };
		int dd[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		cc = Arrays.copyOfRange(dd, 5, 7);
		System.out.println(Arrays.toString(cc));

	}

}
