package computer.persp;

public class Radeon extends VideoCard {

	// 오버라이딩_부모의 showMonitor 메소드를 가져와서 재정의함
	@Override	// 오버라이딩했다는 어노테이션!
	public void showMonitor(String text) {
		//게임3d가속();
		this.게임3d가속();
		System.out.println("더 멋진 " + text);
	}
	// 오버로드_인자가 다름
	public void showMonitor() {
		this.showMonitor("자식 객체 showMonitor");
		super.showMonitor("부모 객체 showMonitor");
	}

	public void 게임3d가속() {
		System.out.println("Radeon 3D 가속");
	}
}
