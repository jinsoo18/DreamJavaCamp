package dreamschool.cscourse.chapter10Heros;

public class SuperMan extends Hero{
	public void action() {
		System.out.print(this.toString() + "��");
		swim();
		System.out.print(this.toString() + "��");
		fight();
		System.out.print(this.toString() + "��");
		fly();
		
	}
	@Override
	public String toString() {
		return "���۸�";
	}

}
