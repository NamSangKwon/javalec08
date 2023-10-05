package winterface;

public class PaymentProcess {

	public void paygo(Paymethod p) {
		p.pay();
	}

	public static void main(String args[]) {
		PaymentProcess pp = new PaymentProcess();
		// Paymethod p = new Paymethod; // Payment는 interface이므로 new 객체 생성X

		// Cash와 Card 클래스는 Paymethod를 구현했기 때문에 new 생성 가능
		Paymethod cash = new Cash();
		Paymethod card = new Card();
		Bank bank = new Cash();

		pp.paygo(card);
		System.out.println("==============");
		pp.paygo(cash);
		System.out.println("==============");
		bank.저축();

		// Payment cash = new Cash(); <-- payment만 따름
		cash.pay(); // 가능
		// cash.저축(); // cash는 객체가 Bank가 아니고 Paymethod 인터페이스만 따르니까

		// -- 타입 캐스팅 ( Bank와 Paymethod 둘다 구현하였으므로 캐스팅 가능 )
		((Bank) cash).저축();
		((Paymethod) bank).pay();

		// Bank bank = new Cash(); <-- bank만 따름
		bank.저축();
		// bank.pay(); // 마찬가지로 Bank만 따르니까

		// cash안에 두 메소드가 있으니까 이건 가능
		Cash c = new Cash();
		c.저축();
		c.pay();

		cash.payback(); // cash는 payback() 지원 - 재정의O
		card.payback(); // card는 payback() 미지원 - 재정의X

		// 익명구현객체 ( 인터페이스를 new로 가져오면서 익명으로 바로 구현 / 익명이라는 말은 클래스 명이 없다는 뜻 / 한 순간에만 사용할 때 사용)
		Paymethod pp2 = new Paymethod() {

			@Override
			public void pay() {
				System.out.println("익명구현객체");
			}

		};
		pp2.pay();

		// instanceof 
		if(pp2 instanceof Paymethod) {
			System.out.println("pp2는 Paymethod의 자식이거나/본체");
		}
	}
}
