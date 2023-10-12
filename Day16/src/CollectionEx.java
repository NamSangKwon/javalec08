import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionEx {

	public static void main(String[] args) {

		// 1.List
		List list = new ArrayList();
		list.add(0); // 1. add()
		list.add(1);
		list.add(2);
		list.add(0);
		System.out.println(list);

		list = Arrays.asList(1, 2, 3, 4, 5); // 2. Arrays.asList();
		System.out.println(list);

		list = List.of(1, 2, 3, 4, 5, 6); // 3. List.of();
		System.out.println(list);

		int[] t = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.asList(t));

		// 전체 출력하기
		System.out.println("전체출력: 전통 for문");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("전체출력: 확장 for문");
		for (Object v : list) {
			System.out.println(v);
		}
		System.out.println("전체출력: Lambda식");
		list.forEach(x -> System.out.println(x));
		list.forEach(System.out::println);

		// --List 줄이기 늘리기(배열은 방수가 정해지면 끝인데 List는 다름)
		System.out.println("List길이 가지고 놀기");
		List<Integer> testList = new ArrayList<Integer>(List.of(1, 2, 3, 1, 1));
		// List<Integer> testList = List.of(1, 2, 3, 1, 1); // ArrayList로 안만들면 불면객체이므로
		// 값을 넣고 빼는것이 안됨
		System.out.println(testList);

		// --길이 늘리기
		testList.add(10); // 1,2,3,1,1,10
		System.out.println(testList);
		testList.add(2, -10); // 1,2,?,3,1,1,10
		System.out.println(testList);

		// --길이 줄이기
		testList.remove(0); // 2,-10,3,1,1,10
		System.out.println(testList);

		// 2.Set == index 없고 중복 안됨
		Set set = new HashSet();
		set.add(0);
		set.add(1);
		set.add(2);
		set.add(0); // 0,1,2
		System.out.println(set);

		// 전체 출력하기
//		System.out.println("전체출력: 전통 for문");
//		for (int i = 0; i < set.size(); i++) {
//			System.out.println(set.(i));
//		}

		System.out.println("전체출력: 확장 for문");
		for (Object v : set) {
			System.out.println(v);
		}

		System.out.println("전체출력: Lambda식");
		set.forEach(x -> System.out.println(x));
		set.forEach(System.out::println);

		// --길이 늘리기
		set.add(10); // 0,1,2,10
		System.out.println(set);

		// --길이 줄이기
		set.remove(0); // 1,2,10
		System.out.println(set);

	}

}
