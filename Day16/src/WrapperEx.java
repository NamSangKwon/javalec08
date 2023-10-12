
public class WrapperEx {

	public static void main(String[] args) {
		
		// --자동형변환
		Integer x = new Integer(1);	// Integer.valueOf(1); <-- 요렇게 써라 추천
		Integer y = 1;	//Boxing
		int z = new Integer(1);	//unBoxing
		
		x.byteValue();	//사용할 수 있는 메서드가 많아짐
		x.compareTo(y);
		
	}

}
