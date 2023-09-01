
public class VariableExample {

	public static void main(String[] args) {

		// 1.변수명은 숫자로 시작할 수 없다.
		// int 4name; // -- 숫자 시작 에러!
		int name4; // -- 괜춘

		// 2.변수명에는 _, $외의 특수문자는 사용할 수 없습니다.
		// int name# // -- 에러
		// int name? // -- 에러
		int $_name_id; // -- $와 _ 는 허용!

		// 3.변수명에는 키워드를 사용할 수 없다.
		// int class; // -- 키워드 사용 불가
		// int if; // -- if는 키워드
		int className;
		className = 10;
		int class_; // 에러 아님 
		// int className; // 중복 안됨
		
		
	}

}
