import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
	String name;
	int grade;

	Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name : " + this.name + ", grade : " + this.grade + "]";
	}

}

public class ExceptionEx02 {
	static Student[] students = new Student[3]; // 학생 명부

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int grade = 0;
		int studnetIdx = 0;
		while (true) {
			System.out.println("이름을 입력하세요 : ");
			name = scanner.nextLine();
			try {
				System.out.println("학년을 입력하세요 : ");
				grade = Integer.parseInt(scanner.nextLine());
				students[studnetIdx] = new Student(name, grade);	// 배열 길이 초과
				System.out.println(students[studnetIdx++]);
			} catch (InputMismatchException e) {
				System.out.println("학년은 숫자만 입력해주세요");
				continue;	// continue 빼먹지 않기! 더 진행되어야 하는 부분이기에
			} catch ( ArrayIndexOutOfBoundsException e ) {
				System.out.println("방꽉참ㅋ");
				break;
			} catch (Exception e) {
				System.out.println("알 수 없는 예외가 발생하였습니다.");
				continue;	// continue 빼먹지 않기! 더 진행되어야 하는 부분이기에
			}
			//if(studentIdx == 3) break;	혹은 ArrayIndexOutOfBoundsException 처리
			System.out.println(studnetIdx +"명의 학생이 저장되엇습니다.");
			
		}
		
		for(Student std : students) {
			System.out.println("저장된 인원 : " + std);
		}
	}

}
