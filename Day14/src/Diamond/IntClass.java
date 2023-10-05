package Diamond;

public class IntClass implements intA, intB{

	@Override
	//intA와 intB에 모두 printName defalut method가 존재할 경우
	public void printName() {
		// TODO Auto-generated method stub
		
		//intA.super.printName();	 	선택지1.intA의 default 메소드
		//intB.super.printName(); 		선택지2.intB의 default 메소드
		System.out.println("선택지3");	//선택지3. 새로운 재정의
		
	}

}
