package dreamsvhool.cscourse.chapter06;

public class Chocolate {

		
	String name;
	String type;
	int price;
	
	String getName() {
		return name;
	}
	
	int calculateTotalPrice(int count) {
		
		return count * price;
		
	}
	
	int calculateTotalPrice(int count, int discount) {
		return count * price * ( 100 - discount) / 100;
	}
	
	void changeChocolateInf(String newName, int newPrice) {
		name = newName;
		price = newPrice;
	}
	void changeChocolateInf(String newName, String newType,int newPrice) {
		name = newName;
		price = newPrice;
		type = newType;
		
	}
	
	
	
	void printChocolateInfo() {
		System.out.println("�̸� : " + name + ", ���� : " + type + ", ���� ; " + price);
	}

	

}
