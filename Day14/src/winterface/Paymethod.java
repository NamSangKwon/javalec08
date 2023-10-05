package winterface;

// 접근제한자 interface 인터페이스명

public interface Paymethod {

	abstract void pay(); // 추상메소드
	// 구현부가 있는 밑에와 동일
//	void pay() {
//		
//	}
	// 요것도 동일
//	void pay();

	// void payBack(); // 중간에 추상메소드 추가 시 하위 구현한 클래스에서는 오류가 나며 반드시 오버라이딩해줘야함!
	
	default void payback() {; // 그것을 방지하기 위해 default 메서드를 사용해서 하위호환성을 보장
	System.out.println("환불");
	}
}
