package javalec.computer.videocard;

public class ModiEx {

	public static void main(String[] args) {
		Geforce video1 = new Geforce();
		// 같은 package라서 호출 가능
		video1.defaultPrintName();
		video1.protectedPrintName();
		
		// private는 오직 자기 자신 class에서만 호출 가능
		//video1.privatePringName();
		
		
		// 오버로딩으로 인자 여부에 따른 서로 다른 생성자 호출
		Geforce video2 = new Geforce();
		Geforce video3 = new Geforce("인자존재");
		
		System.out.println(video2.modelName);
		System.out.println(video3.modelName);
	}
}
