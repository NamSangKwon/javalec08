
//생성자(메서드) 오버로딩
//메서드 오버로딩과 똑같음 ( 인자의 수, 인자의 데이터 타입, )

class Student {
	String name; // 학생 이름
	int grade; // 학년

	// 기본생성자 정의
	public Student() {
		this("홍길동",1);	// 매개변수에 맞는 자기 자신을 호출
	}

	// 인자 1개(String) 받는 생성자 오버로딩
	public Student(String stdName) {
		this(stdName,1);
//		name = stdName;
//		grade = 1;
	}
	
	// 인자 2개(String, int) 받는 생성자 오버로딩
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	// 인자 2개(String, int) 받는 생성자 오버로딩	(순서 바꿈)
	// 매개변수의 데이터타입이 다르고, 순서가 다르면 오버로딩은 가능
	public Student(int grade, String name) {
		this.name = name;
		this.grade = grade;
	}

	public void printMe() {
		System.out.println("내 이름은 " + name + ", " + grade + "학년입니다");
	}
}

public class ConstructorOverloadEx {

	public static void main(String[] args) {
		Student std1 = new Student();	// 기본생성자 호출
		Student std2 = new Student("하악이");	// 인자 하나
		Student std3 = new Student("하악이",6);	// 인자 두개
		Student std4 = new Student(7,"하악이2");	// 인자 두개 (순서 다름)
		
		std1.printMe();
		std2.printMe();
		std3.printMe();
		std4.printMe();
		
		System.out.println();
	}

}
