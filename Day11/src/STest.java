
public class STest {

	public static void main(String[] args) {
		SinglePattern.getInstance();
		
		// 1. 그냥 객체를 생성했을 때.
		// static이 아니라서 ++안먹음
		SinglePattern s1 = new SinglePattern();
		SinglePattern s2 = new SinglePattern();
		SinglePattern s3 = new SinglePattern();
		s1.printSharedData();
		s2.printSharedData();
		s3.printSharedData();
		System.out.println("s1 : " + System.identityHashCode(s1));
		System.out.println("s2 : " + System.identityHashCode(s2));
		System.out.println("s3 : " + System.identityHashCode(s3));
		
		
		
		// 2. 싱클턴 메서드 getInstance();
		SinglePattern s11 = SinglePattern.getInstance();
		SinglePattern s12 = SinglePattern.getInstance();
		SinglePattern s13 = SinglePattern.getInstance();
		
		s11.printSharedData();
		s12.printSharedData();
		s13.printSharedData();
		System.out.println("s11 : " + System.identityHashCode(s11));
		System.out.println("s12 : " + System.identityHashCode(s12));
		System.out.println("s13 : " + System.identityHashCode(s13));

	}

}
