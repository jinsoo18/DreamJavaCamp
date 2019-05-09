package dreamschool.cscourse.chapter10;

public class Mobile implements GooPlay{
	private String production;
	private int price;
	
	
	
	public Mobile(String production) {
		this.production = production;
	}
	public void call(int time) {
		System.out.println(production + " : " + time+ "분 통화했습니다.");
	}
	public void charge(int time) {
		System.out.println(this.production + " : " + time + "분 충전했습니다.");
	}
	@Override
	public void buy(String kind, int price) {
		// TODO Auto-generated method stub
		System.out.println("Galaxy : "+ kind +" 앱을 "+ price+" 원에 구입했습니다.");
		
	}
	
	

}
