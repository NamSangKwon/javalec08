import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import members.User;

public class RefEx {

	public static void main(String[] args) throws Exception {

		Class c1 = Class.forName("members.User");
		
		
		System.out.println("Start 생성자 목록 =============");
		Constructor[] con = c1.getConstructors();
		
		for(Constructor v : con) {
			System.out.println(v);
		}
		System.out.println("End 생성자 목록 =============");
		System.out.println("Start 필드 목록 =============");
		System.out.println("private라서 안나옴 ㅋ");
		Field[] field = c1.getFields();
		for(Field f : field) {
			System.out.println(f);
		}		
		System.out.println("End 필드 목록 =============");
		System.out.println("Start 메서드 목록 =============");
		Method[] method = c1.getMethods();
		for(Method m : method) {
			System.out.println(m);
		}		
		System.out.println("End 메서드 목록 =============");
		
		// --객체 생성없이 reflection으로 생성자, 메소드 호출하는 방법
		//User a = new User();
//		Constructor constructor = c1.getConstructor();
//		User user = (User)constructor.newInstance("이종석","lodossw","12345");
//		user.printUserInfo();
				
		System.out.println("객체 생성 -> printUserInfo()");
		Constructor constructor = c1.getConstructor(String.class, String.class, String.class);
		User user = (User)constructor.newInstance("이종석","lodossw","12345");
		user.printUserInfo();
		//user.printUserPassword();	// private니까 호출 불가

		System.out.println("Method 객체로 호출(invoke)-> printUserInfo()");
		Method printUserInfo = c1.getDeclaredMethod("printUserInfo", null);
		printUserInfo.invoke(user, null);
		
		
		// private 메소드 불러오기 ### 캡슐화 무력화 ###
		System.out.println("Method 객체로 private 호출(invoke)-> printuserPassword()");
		Method printUserPassword = c1.getDeclaredMethod("printUserPassword", null);
		printUserPassword.setAccessible(true);	// private 무력화 ( 캡슐화 무렵화 ) 
		printUserPassword.invoke(user, null);
	}

}
