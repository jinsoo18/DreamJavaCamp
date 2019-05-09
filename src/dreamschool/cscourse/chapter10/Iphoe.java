package dreamschool.cscourse.chapter10;

public class Iphoe  extends Mobile{
	private String color;

	public Iphoe(String production) {
		super(production);
		// TODO Auto-generated constructor stub
		
		
	}
	
	
	
	
	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	@Override
	public void charge(int time) {
		System.out.println("Ipone : " + time + "분 충전했더니 Full!");
	}
	
	

}
