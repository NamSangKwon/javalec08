package javalec.computer.videocard;

// public > protected > default > private
// 접근을 제한하고자 하는 곳은 어디인가?
// class, 클래스 멤버는 모두 접근제한자를 들 수 있다.
// 1. 클래스
// 2. 속성(멤버변수)
// 3. 메서드(멤버메서드)
// 4. 생성자(메서드) <ㅡ-- 붙을 수 있지만, 주로 public
public class Geforce {

	public String modelName;
	private int price;
	
	// 생성자(메서드)
	// 1. 리턴타입 없음
	// 2. 클래스명과 생성자(메서드)명 동일
	public Geforce() {
		modelName = "인자없음";
		price = 1000;
	}
	
	// 인자 있는 생성자
	public Geforce(String model) {
		modelName = model;
	}
	

	public void showModel() {
		System.out.println("Radeon");
	}
	
	public void turnOnmonitor() {
		System.out.println("모니터 On");
	}

	void defaultPrintName() {
		System.out.println("default 메서드야");
	}
	
	protected void protectedPrintName() {
		System.out.println("protected 메서드");
	}
	
	private void privatePringName() {
		System.out.println("private 메서드");
	}
	
}
