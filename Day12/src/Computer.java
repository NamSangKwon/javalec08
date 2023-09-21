import computer.persp.Geforce;
import computer.persp.Radeon;
import computer.persp.VideoCard;

public class Computer {
	//################### 인자 차이 ( 다형성 [범용성])	//특정 비디오카드 뿐만아니라 모든 그래픽카드를 받을 수 있음을 뜻하는 점이 다형성
	public void 비디오카드달기(Radeon rd) {
		rd.showMonitor("화면이 나와요");
	}
	
	public void 범용비디오카드달기(VideoCard vd) {
		vd.showMonitor("화면이 나와요");
	}
	//################### 인자 차이
	public static void main(String[] args) {
		
		Radeon rd = new Radeon();
		rd.showMonitor("화면을 출력해주세오");	// 오버라이딩된 자식 메서드 호출
		rd.showMonitor();	// 오버로딩된 자식 메서드 호출 // 내용: this.showMonitor(String), super.showMonitor(String))
		//부모		>>>			//자식
		VideoCard video = new Radeon();
		VideoCard video2 = new Geforce();
		
		video.showMonitor("부모호출? 자식호출? ");	// 자식호출함!
		video2.showMonitor("부모호출? 자식호출? ");
		
		// 1. 객체생성
		Computer com = new Computer();
		com.비디오카드달기(new Radeon());	// 라데온 밖에 안됨
	  //com.비디오카드달기((new Geforce());	// 에러
		
		com.범용비디오카드달기(new Radeon());
		com.범용비디오카드달기(new Geforce());
		
		// class 대한민국비디오카드 extends VideoCard
		// showMonitor()메서드를 오버라이딩
		
		// 부모클래스 VideoCard를 상속받음으로써
		// => com.범용비디오카드달기(new 대한민국비디오카드()); ---- 사용 가능해짐! 
	}

}
