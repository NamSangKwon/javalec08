import java.util.Scanner;

class LoginException extends Exception {
	LoginException(String msg) {
		super(msg);
	}

}

public class CustomExceptionEx {

	public static void main(String[] args) { //throws LoginException {
		String dbid = "lodossw";
		String dbpw = "1234";
		int try_cnt= 0;
		
		while(try_cnt < 3) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요. : ");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요. : ");
		String pw = sc.nextLine();
		
		try {
			if(dbid.equals(id) && dbpw.equals(pw)) {
				System.out.println("로그인 성공");
				break;
			} else {
				throw new LoginException("아이디와 비밀번호를 확인해주세요.");
			}
		}catch(LoginException e) {
			try_cnt++;
			System.out.println("e.getMessage()");
		}catch(Exception e) {
			System.out.println("e.getMessage()");
		}
		
		}
	}

}
