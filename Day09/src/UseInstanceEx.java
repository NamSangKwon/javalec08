//CalClassEx 를 사용할 예정! CalClassEx를 사용하는 것이 new를 이용해 Instance화 시키는 것!!!!
public class UseInstanceEx {

	public static void main(String[] args) {
		// 반지름 5 원주율 구하기
		// 인스턴스화! 다른 객체다
		CalClassEx cal = new CalClassEx();
		CalClassEx cal2 = new CalClassEx();
		cal.printMyName();
		float result = cal.원주율(4);
		System.out.println(result);
		
		cal2.printMyName();
		result = cal2.원주율(10);
		System.out.println(result);
		// 다른객체다
		System.out.println(cal == cal2);
		System.out.println(cal);
		System.out.println(cal2);
		
		
		
		
	}

}
