package members;

public class User {

	private String name;
	private String id;
	private String password;
	
	public User() {}
	
	public User(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	public void printUserInfo() {
		System.out.println(String.format("id:%s, name: %s", name, id));
	}
	
	private void printUserPassword() {
		System.out.println(String.format("pwd : %s", password));
	}
	
	
	
}
