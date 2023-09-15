import javalec.computer.videocard.*;
import javalec.computer.videocard.Geforce;
import javalec.computer.videocard.Radeon;

public class ComputerApp {

	public static void main(String[] arg) {
		// 다른폴더에 있는 Geforce와 Radeon 객체를 생성
		
//		javalec.computer.videocard.Geforce vidio1 = new javalec.computer.videocard.Geforce();
		Geforce video1 = new Geforce();
		video1.turnOnmonitor();
		
		Radeon video2 = new Radeon();
		video2.turnOnmonitor();
		
		// default라 다른 package라서 불러오지 못함
		//video1.defaultPrintName(){}
		
		
			
		
				
	}
}
