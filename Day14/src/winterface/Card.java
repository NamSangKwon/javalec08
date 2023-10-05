package winterface;

public class Card implements Paymethod{

	//Paymethod 인터페이스에 있는 구현안된 메소드를 구현을 **강제로** 해야함!
	@Override
	public void pay() {
		System.out.println("카드로 결제합니다.");
		System.out.println("수수료 0.5%");
		
	}

}
