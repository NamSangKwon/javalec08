import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GenericClass<T> {

	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void getClassInfo() {
		System.out.println(String.format("class info : %s", data.getClass()));
	}
}

public class GenericEx {
	public static void main(String[] args) {
		GenericClass<Integer> clsInt = new GenericClass<Integer>();
		GenericClass<String> clsStr = new GenericClass<String>();

		clsInt.setData(1);
		clsInt.getClassInfo();
		clsStr.setData("이종석");
		clsStr.getClassInfo();

		Map<?,?> map = new HashMap<String,String>();
	}
	
	

	// static int add(List<? super Number> list) { ==> super는 Number의 부모클래스만 받겠다
	static int add(List<? extends Number> list) { // ==> extends 하향제한: Number의 자식 클래스만 받겠다
		int result = 0;
		for (Number v : list) {
			result += Integer.parseInt(v.toString());
		}
		return result;
	}

}
