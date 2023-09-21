package computer.persp;

public class Geforce extends VideoCard {

	@Override
	public void showMonitor(String text) {
		this.direxX지원();
		super.showMonitor("나는 Geforce " + text);
	}

	public void direxX지원() {
		System.out.println("dirextX지원");
	}
}
