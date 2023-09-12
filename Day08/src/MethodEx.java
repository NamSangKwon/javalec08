	// 메서드 타입
	// 1. 인자
	//	- 인자가 없는 메서드
	//	- 인자가 있는 메서드
	// 2. 값 돌려주기 (return)
	//	- 값을 돌려주는 메서드
	//	- 값을 돌려주지 않는 메서드
public class MethodEx {

	// 1. 리턴이 없고, 인자도 없는 메서드
	static void printName() {
		System.out.println("나의 이름은?");
	}
	
	// 2. 리턴이 없고, 인자는 있는 메서드
	static void printUrName(String urName, int urAge) {
		System.out.println("너의 이름은 " + urName +"이고, 나이는 " + urAge + "세 입니다.");
	}
	
	// 3. 리턴이 있고, 인자는 없는 메서드
	static String returnName() {
		return "이종석";
	}
	
	// 4. 리턴값이 있고, 인자도 있는 메서드
	static int add (int x, int y) {
		int result = x + y;
		return result;
	}
	
	public static void main(String[] args) {

		// 메서드 이름 : main
		// 인자(매개변수) : String[] args 배열
		// return void 없음
		
		// 1번
		printName();
		
		// 2번 
		printUrName("김이박",18);
		
		// 3번
		// 리턴값이 있으면 받아줘야해 !!!!!!!!!!!!
		String name = returnName();
		System.out.println(name);
		
		// 4번
		int addResult = add(1,9999);
		System.out.println(addResult);
		System.out.println(add(2,9999));

		
		
	}

}
