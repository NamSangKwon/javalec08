import java.util.Arrays;

public class SwallowCopyEx {
	public static void main(String[] main) {
		
		//얕은 복사는 주소값만 복사한다. ( 변수 공간 - stack )	같은 공간을 바라 보고 있으므로 함께 변함
		int a[] = {1,2};
		int b[] = {3,4,5};
		System.out.println("a : " + Arrays.toString(a));
		System.out.println("b : " + Arrays.toString(b));
		a=b;
		System.out.println("a : " + Arrays.toString(a));
		System.out.println("b : " + Arrays.toString(b));
		
		b[1] = -10;
		System.out.println("3a : " + Arrays.toString(a));
		System.out.println("3b : " + Arrays.toString(b));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
