import school.ClassRoom;

public class SchoolTest {

	public static void main(String[] args) {

		ClassRoom room = new ClassRoom();
		room.입학();
		room.printMe();
		room.입학();
		room.printMe();
		
		
		ClassRoom room2 = new ClassRoom();
		room2.입학();
		room2.printMe();
		
		room2.printMe2();
		ClassRoom.printMe2();
	}

}
