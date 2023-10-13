
class User {
	String name;
	int age;

	User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	boolean isSameUser(User user) { // 동명이인이냐?
		return this.name.equals(user.name);
	}

	boolean isSameUser2(User user) { // 동명이인 + 동갑이냐?
		return this.name.equals(user.name) && this.age == user.age;
	}
}

interface InterA {
	boolean isSameUser(User user1, User user2);

	boolean isSameUser2(User user1, User user2);
}

//(람다) 함수형 인터페이스
@FunctionalInterface
interface InterB {
	boolean isSameUser(User user1, User user2);
	// (x,y) -> x.name.equals(y.name);
	// boolean isSameUser(User user1, User user2){
	// return user1.name.equals(user2.name);
	// }
	
	// boolean isSameUser2();	// 함수형 인터페이스의 추상메서드는 ##하나## 밖에 넣을 수 없다. (error)
	// 구현부가 있는 default메서드는 추가 가능
	default void printName() {
		System.out.println("하악하악");
	}
}

public class Lambda {

	public static void main(String[] args) {

		User user1 = new User("이종석", 10);
		User user2 = new User("이종석", 29);
		System.out.println("동명이인? : " + user1.isSameUser(user2));
		System.out.println("동명이인 + 동갑 ? : " + user1.isSameUser2(user2));

		// 익명 객체
		// 종속 되어 있지 않고 interface로 구현
		InterA func = new InterA() {
			@Override
			public boolean isSameUser(User user1, User user2) {
				return user1.name.equals(user2.name);
			}

			@Override
			public boolean isSameUser2(User user, User user2) {
				return user1.name.equals(user2.name) && user1.age == user2.age;
			}
		};
		System.out.println("동명이인? : " + user1.isSameUser(user2));
		System.out.println("동명이인 + 동갑 ? : " + user1.isSameUser2(user2));

		// 람다식
		InterB a = (x, y) -> {
			return x.name.equals(y.name);
		};
		InterB b = (t, v) -> t.name.equals(v.name) && t.age == v.age;

		System.out.println("동명이인 ? : " + a.isSameUser(user1, user2));
		System.out.println("동명이인 + 동갑 ? : " + b.isSameUser(user1, user2));
	}

}
