
class Math {
	int add(int x, int y) {
		return x + y;
	}

	// 개수가 다름
	int add(int x) {
		return x + x;
	}

	// 데이터 타입이 다름
	float add(float x, float y) {
		return x + y;
	}

	// 리턴타입이 다르다고 '오버로딩'이 아님!
	// 매개변수의 데이텨 형식, 순서, 개수가 달라야함!
//	float add (int x , int y) {
//		return x + y;
//	}

	// 매개변수의 순서는 두개 이상의 서로 다른 데이터형식의 매개변수의 순서가 달라야함

}

public class MethodOverloadEx {

	public static void main(String[] args) {
		Math math = new Math();
		System.out.println(math.add(10));
		System.out.println(math.add(10, 20));
		System.out.println(math.add(10.0f, 20.0f));
	}
}
