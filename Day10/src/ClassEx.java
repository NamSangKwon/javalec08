

// 기본적으로 자바는 모드 클래스로 이루어져있습니다.
// 최소 파일 1개당 하나(하나이상)의 클래스가 정의되어야 한다.
// 클래스 정의 문법
// 접근제한자 class 클래스명 {
//		멤버 ...
// }
// 1. 필드/멤버변수/속성 -> 클래스 전역변수/상수
// 2. 메서드 -> 클래스의 기능/행위를 정의
// 3. 생성자(메서드) -> 클래스의 객체를 생성하는 행위/기능을 정의
// !) 위 3개는 필수 X

class Nvidia {
	String modelName;
	String modelNo;
	void echoModelName() {	// 모델명을 말하는 놈
		System.out.println("modelName : " + modelName);
		System.out.println("modelNo : " + modelNo);
	}
	
	void showMonitor() {
		System.out.println("모니터 출력");
	}
}
public class ClassEx {

	public static void main(String[] args) {
		
		// Nvidia 객체를 생성
		Nvidia video = new Nvidia();	// Navidia() <-- 생성자 메서드
		
		// 객체의 메서드나, 속성에 접근하고자 할 때 사용하는 연산자
		// . <-- 점을 사용함
		
		//속성에 직접 접근
		video.modelName = "Geforce";
		video.modelNo = "3770";
		System.out.println(video.modelName);
		System.out.println(video.modelNo);
		
		// 메서드 직접 호출
		video.echoModelName();
		video.showMonitor();

	}

}
