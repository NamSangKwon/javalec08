import java.util.Iterator;
import java.util.List;

public class OldFashion {

	public static void main(String[] args) {

		List list = List.of(1, 2, 3, 4, 5, 6, 7);

		System.out.println("for문");
		for (Object v : list) {
			System.out.println(v);
		}

		System.out.println("Iterator");
		// 1.Iterator -> cursor
		Iterator it = list.iterator();
		while (it.hasNext()) { // hasNext() = 값이 있는지 확인 (boolean)
			System.out.println(it.next()); // next() = 이동하며 값을 next element를 return
		}

		// 커서가 마지막에 존재하기에 이동할 다음 값이 없으므로 출력X
		//System.out.println(it.next()); // next() = 이동하며 값을 next element를 return

	}

}
