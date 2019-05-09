package dreamschool.cscourse.chapter10Heros;

public class BatMan extends Hero{
	public void action() {
		System.out.print(this.toString() + "이");
		swim();
		System.out.print(this.toString() + "이");
		fight();
		
	}
	@Override
	public String toString() {
		return "베트맨";
	}

}
