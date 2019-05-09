package dreamschool.cscourse.chapter10Heros;

public class SpiderMan extends Hero{
	public void action() {
		System.out.print(this.toString() + "이");
		fight();
		
	}
	@Override
	public String toString() {
		return "스파이더맨";
	}

}
