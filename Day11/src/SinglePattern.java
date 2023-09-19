
public class SinglePattern {
	
	// 객체 멤버변수
	int sharedData = 0;
		
	private static SinglePattern sp = null;

	// static 객체참조변수
	// 싱글턴 패턴으로 객체 생성
	public static SinglePattern getInstance() {
		if(sp == null) {
			sp = new SinglePattern();
			return sp;	// 처음 생성 시 sp에는 null이 아닌 new에 따른 새로운 참조 값이 들어가고 그 이후론 null이 아닌 참조 값이라 기존 sp를 리턴함
		}return sp;
	}
	
	// 객체 멤버 메서드
	public void printSharedData() {
		System.out.println(++ sharedData);
	}


}
