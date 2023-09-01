
public class CastingExample {

	public static void main(String[] args) {
		
		// 1. 묵시적(자동) 형변환
		byte a1 = 10;	//1Byte
		int b1 = a1;	//4Byte 쌉가능
		
		// 2. 명시적(강제) 형변환
		a1 = (byte)b1;
		a1 = (byte)(b1 + 20);	//(byte)b1 + (byte)20 안됨!
		
		// 3. 아이궁금해
		int test1=128;
		byte bTest2 = (byte)test1;
		System.out.println("test1 : " + test1 );
		System.out.println("bTest2 : " + bTest2 );
	}
}
