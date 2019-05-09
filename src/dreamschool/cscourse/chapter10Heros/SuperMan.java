package dreamschool.cscourse.chapter10Heros;

public class SuperMan extends Hero{
	public void action() {
		System.out.print(this.toString() + "이");
		swim();
		System.out.print(this.toString() + "이");
		fight();
		System.out.print(this.toString() + "이");
		fly();
		
	}
	@Override
	public String toString() {
		return "슈퍼맨";
	}

}
