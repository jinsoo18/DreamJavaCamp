package dreamschool.cscourse.chapter07;

public class ItBook {
	
	private String title;
	private int prie;
	private double discuntRate;
	
	public ItBook(String title, int prie, double discuntRate) {
		this.title = title;
		this.prie = prie;
		this.discuntRate = discuntRate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrie() {
		return prie;
	}

	public void setPrie(int price) {
		this.prie = prie;
	}

	public double getDiscuntRate() {
		return discuntRate;
	}

	public void setDiscuntRate(double discuntRate) {
		this.discuntRate = discuntRate;
	}
	
	public void printItBookInfo() {
		System.out.println("제목 : " + this.title + ", 정가 : "
				+ this.prie + ", 할인율 : " + this.discuntRate + "%, 할인가 : "
				+ (int)(this.prie * (100 - this.discuntRate) / 100) + "원");
	}
	

}
