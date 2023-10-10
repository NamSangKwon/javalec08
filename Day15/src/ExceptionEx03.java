class Math01 {
	int divide(int x, int y) throws ArithmeticException, Exception { // throws: 메소드에 선언
		if (y == 0)
			throw new ArithmeticException("못 나눠 0으론"); // s없는 건 메소드 내에서
		return x / y; // y = 0 이면 Exception 발생
	}
}

public class ExceptionEx03 {

	public static void main(String[] args) {
		Math01 m = new Math01();
		int b = 0;
		try {
			b = m.divide(10, 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(b);

	}

}
