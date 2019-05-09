package dreamsvhool.cscourse.chapter06;

public class Building {
	String name;
	String address;
	int totalFloor;
	
	void moveEleavtor(){
		System.out.println("엘레베이터를 운영합니다.");
	}

	void changeAddress(String newAddress) {
		address = newAddress;
	}
}
