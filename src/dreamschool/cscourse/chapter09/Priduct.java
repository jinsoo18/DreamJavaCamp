package dreamschool.cscourse.chapter09;

public class Priduct {
	private String name;
	private int price;
	private int discountRate;
	
	public Priduct(String name, int price, int discountRate) {
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	public void printProductInfo() {
		System.out.println("======��ǰ ����=======");
		System.out.println("��ǰ�� : " + this.name);
		System.out.println("���� : " + this.price + "��("+ this.discountRate + "%");
		System.out.println("�ǸŰ� : " + this.calculateDiscontPrice() + "��");
	}
	public int calculateDiscontPrice() {
		int totalPrice = this.price * (100 - this.discountRate) / 100;
		return totalPrice;
	}
	
	

}