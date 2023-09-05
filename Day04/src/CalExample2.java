
public class CalExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 1. And 연산 양쪽 모두다 true 일 때 true
		System.out.println("true && true = " + (true && true));		//true
		System.out.println("true && true = " + (true && false));	//false
		System.out.println("true && true = " + (false && false));	//false
		
		int a = 10; 
		int b = 20;
		boolean result = a > 5 && b < 21 && (a + 10 < 0);	//false
		System.out.println(result);

		// 2. OR 연산 양쪽 피연산자 중 하나만 true 면 true
		result = a > 5 || b < 21 || (a + 10 < 0); 	//true
		System.out.println(result);
		
		// 3. XOR 연산자 양쪽 중 하나만 true 면 true
		result =  a > 5 ^ b < 21 ^ (a + 10 < 0); 	//false
		// --> result ( true ^ true ) ^ false
		//                false       ^ false	=>false
		System.out.println(result);
		
		result = !result;		//true
		System.out.println(result);
		
		// && vs &, || vs |
		int x =100;
		int y =110;
		boolean z = x > y && ++x == 101;
		//boolean z = x > y & ++x == 101;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		//&&는 x > y(선피연자)가 false 이므로, z는 false 확정이므로, 뒤(후피연산자)에는 연산하지 않음 ( x =100 )
		//&는 뒤에까지 무조건 연산함 ( x = 101 )
		
		z = x < y | ++x == 101;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		//마찬가지로 ||는 선피연산자가 true이므로, z는 true 확정이므로, 뒤(후피연산자)에는 연산하지 않음 ( x = 100 )
		//|는 뒤에까지 무조건 연산함 ( x = 101 )
		
		
		
		
		
	}
}
