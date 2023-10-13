import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
	String name;
	int grade;

	Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	void introduceMySelf() {
		System.out.println(String.format("안녕, 내 이름은 %s, %d 학년이야", name, grade));
	}
}

public class MapEx {

	public static void main(String[] args) {

		Map map = new HashMap(); // new HashTable()...etc...
		map.put("name", "이종석");
		// put(Object,Object)
		// map.put("age", new Integer(30)); new 안써도 됨 자동 Boxing 되기 때문에
		map.put("age", 30);

		System.out.println(map.get("name"));
		System.out.println(map.get("age"));

		List list = new ArrayList();
		for (int i = 0; i < 5; i++) {
			Map m = new HashMap();
			m.put("name", i);
			m.put("age", "age" + i);
			m.put("home", "home" + i);
			list.add(m);
			System.out.println(list.get(i));
		}

		System.out.println("List<Map>꺼내기");
		for (Object v : list) {
			Map rMap = (Map) v;
			// System.out.println(v);
			System.out.println(String.format("%s \t %s \t %s \n", rMap.get("name"), rMap.get("age"), rMap.get("home")));
		}

		List studentList = new ArrayList();
		for (int i = 0; i < 5; i++) {
			studentList.add(new Student("이종석" + i, i));
		}

		for (Object v : studentList) {
			Student std = (Student) v;
			std.introduceMySelf();
		}

		// List/Set/Map은 Object 타입의 데이터를 저장할 수 있습니다.

		// List에 String(하악)을 걸러내지 못함 컴파일 시 오류가 나기때문에 int만 받도록 제한하는 것이 제네릭
		// List param = List.of("1", "2", "3", "4", "5", 6, 7, 8, 9, "하악");
		List<Integer> param = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int result = sum(param);
		System.out.println("result : " + result);
		
		Map<String, Student> map2 = new HashMap();
		//map2.p 	// + space bar 눌러서 제네릭 적용 전 후 받을 수 있는 타입 확인하기
		map2.put("1", new Student("이종석",1));
		map2.put("2", new Student("이종석",2));
		//map2.put("3", new String("이종석")); // 당연히 안됨! Student만 받기로 제네릭에서 설정되었기 때문에 String 불가!
		map2.get("1").introduceMySelf();  //return값이 Student 이므로 가능
		Student studnet = new Student("이종석", 1);	// 위에 한줄과 현재 라인과 다음 라인은 동일
		studnet.introduceMySelf();
		
		
		Map map3 = new HashMap();
		map3.put("1", new Student("이종석",1));
		map3.put("2", new Student("이종석",2));
		map3.put("3", new String("이종석")); // 제네릭이 설정 안되어 있으면 Object를 받을 수 있으므로 new String 가능
		((Student)map3.get("1")).introduceMySelf();	// 한 번 더 Student로 캐스팅 필요! (제네릭 유무 차이) map2는 key를 받아서 value로 Student객체로 return하니까
		
		
		
	}

	public static int sum(List<Integer> list) {

		int result = 0;
		for (Integer v : list) {
			result += Integer.parseInt(v.toString());
		}
		return result;
	}

}
