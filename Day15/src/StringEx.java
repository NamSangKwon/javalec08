
public class StringEx {

	public static void main(String[] args) {
		
		// 객체가 3개 생성됨. 1.이종석 2.만세 3.이종석만세 (메모리 효율 X)
		String a = "이종석";
		a=a+"만세";
		
		// String interpolation (치환, 중간에 값 넣기)
		String val = "안녕하세요, 내 이름은 %s 입니다. 나이는 %d 살이에요";
		val = String.format(val, "이종석", 10);
		System.out.println(val);
		
		// StringBuffer, StringBuilder
		// StringBuffer Thread-Safe
		// StringBuilder Thread-unSafe
		
		//String name = "이종석";	//StringPool에 저장
		String name = new String("이종석"); // Heap에 저장
		StringBuffer nameBuff = new StringBuffer("이종석");
		StringBuilder nameBuild= new StringBuilder("이종석");
		
		name = name + "만세";
		nameBuff.append("만세");
		nameBuild.append("만세");
		
		System.out.println("String : " + name);
		System.out.println("StringBuffer : " + nameBuff);
		System.out.println("StringBuild : " + nameBuild);
		
		// 문자열이 많아질수록 / 연산이 많아질수록 성능은
		// StringBuilder > StringBuffer >>> 4차원의 벽 >>> String
		 

	}

}
