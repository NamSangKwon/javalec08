
//접근제한자 class 클래스명 {
	//.. 클래스 정의부
	//.. 1.필드(속성) - 사물이 가지는 데이터(값)
	//.. 2.생성자()
	//.. 3.메서드() - 행위 기능
//}
public class CalClassEx {

			//-- 필드(=속성) = 클래스 변수
			// 접근 제한자 데이터 타입 변수/상수명
			public int x;
			int y;
			public String name = "CalClassEx입니다.";
			
			//--메서드(행위/기능)
			// 접근제한자 static or blank(없는거) 리턴타입 메서드명(매개변수){
			//.. 메서드 정의부
			//}
			int add(int x, int y) {
				return x + y;
			}
			
			public int minus(int x, int y) {
				return x - y;
			}
			
			public float 원주율(int x) {
				return x * x * 3.14f;
			}
			
			public void printMyName() {
				System.out.println(name);
			}
			
			// public int myAssets = 1000000000;
		

}
