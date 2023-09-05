
public class WhileExample {

	// while, do ~ while
	public static void main(String[] args) {

		//1.for
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		//2.while
		int i = 1;
		while (++i <= 10) {
			if (i % 2 == 0)
				System.out.println("i : " + i);
			// i++; while문에서 ++ 빼면 여기 넣음
		}

		//3.do while
		i = 1;
		do {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		} while (i++ <= 10);
		
		
		for(int x = 0; (x<10)&&(x==1); x++) {
			System.out.println("a");
			System.out.println("x : " + x);
		}
	}

}
