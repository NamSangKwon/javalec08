
public class ExceptionEx01 {

	public static void main(String[] args) {

		int x = 10;
		int y = 0;
		int result = 0;
		
		try {
		result = x / y;
		} catch (ArithmeticException e) {
			//ArithmeticException가 발생하면, e변수로 자동 할당
			System.out.println("예외가 발생하였습니다.");
			System.out.println(e.getMessage());
		} catch(Exception e) {	// 마지막 catch로 모든 에러를 잡기 위한 가장 부모클래스인 Exception을 적어서 잡아주기
			System.out.println("알 수 없는 예외가 발생하였습니다.");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("자원 반납");
			result = -1;
		}
		System.out.println("result : " + result);

	}

}
