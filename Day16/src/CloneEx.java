
class Member implements Cloneable {
	String name;

	Member(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println(String.format("Hello, %s", name));
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		
		return String.format("name %s @ %s", this.name, this.hashCode());
	}
	
	@Override
	public boolean equals(Object m) {
		return this.name.equals(((Member)m).name);
	}
}

public class CloneEx {

	public static void main(String[] args) throws CloneNotSupportedException {
		// clone()
		Member member = new Member("이종석");
		Member member2 = member;	// 얕은 복사 (같은 주소 참조)
		Member member3 = (Member)member.clone();	// 깊은 복사
				
										// Only복사, 변경 전
		System.out.println(member);		//name : 이종석
		System.out.println(member2);	//name : 이종석
		System.out.println(member3);	//name : 이종석
		System.out.println();
		member2.name = "하악하악";	// 얕은복사 같은 주소를 참조하기 때문에 member2를 변경하여도 member도 변경됨, 깊은복사 member3는 변경 안됨
		System.out.println(member);		//name : 하악하악
		System.out.println(member2);	//name : 하악하악
		System.out.println(member3);	//name : 이종석
		
		int[] a = {1,2,3};
		int[] b = a;			// 주소 공유하는 얕은 복사
		int[] c = a.clone();	// 주소를 공유하지 않는 깊은 복사

		
		// equals()	기본적으로 주소값 비교 Member class에서 Override통해 텍스트 비교
		Member m1 = new Member("이종석");
		Member m2 = new Member("이종석");
		System.out.println("m1 == m2 = "+ (m1 == m2));
		System.out.println("m1 == m2 = "+ (m1.equals(m2)));
		System.out.println("m1 == m2 = "+ (m1.name.equals(m2.name)));
		
	}

}
