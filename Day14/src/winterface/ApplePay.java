package winterface;

public class ApplePay implements Paymethod{

	@Override
	public void pay() {
		System.out.println("애플페이로 결제합니다.");
		
	}

}

class 쌀 implements Paymethod {

	@Override
	public void pay() {
		
		
	}
	
}