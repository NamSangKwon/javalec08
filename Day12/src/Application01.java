
public class Application01 {

	String className; // Application01 멤버(변수)
	// 객체 참조 멤버
	static String className2; // Application01 멤버(변수)
	// static 영역 변수

	
	public void nonStaticMethod() {		
		className = "하앍 non Static";	// 같은 클래스 내 에서 접근 가능	
		className2 = "으으응";			// 같은 클래스 내 라서 그냥 접근 가능!
	}
	
	
	public static void main(String args[]) {

		className2 = "내이름은 className2";
		// className="내 이름은 className이야"; // static 아니니까 heap에 띄우고 호출해야지

		// new로 heap에 띄우고 호출
		Application01 a01 = new Application01();
		a01.className = "내 이름은 className이야";

		//Application01.className2 = "test"  // static 접근법 : '클래스명.static멤버변수'	// 정상적인 static 접근법
		a01.className2 = "하악"; // a01객체로 만들고 접근은 가능하나 warning떨어지니 하지말기!
		


		// 1. SuperClassEX
		SuperClassEX ex1 = new SuperClassEX();
		ex1.printClassName();
		// ex1.printMySmartPhone(); // 자식한테 있는 메소드

		System.out.println("==============");
		// 2. SubClassEX (extends SuperClassEX)
		SubClassEX ex2 = new SubClassEX();
		// ex2.className = "하악하악"; // 아버지한테 상속받은 속성(맴버변수)
		ex2.printClassName(); // 아버지한테 상속받은 메서드
		ex2.printMySmartPhone(); // 자식한테만 있는 메서드
		ex2.printMyClassName(); // 자식의 className 출력

	}
}
