package dreamschool.cscourse.chapter10Heros;

public class BatMan extends Hero{
	public void action() {
		System.out.print(this.toString() + "��");
		swim();
		System.out.print(this.toString() + "��");
		fight();
		
	}
	@Override
	public String toString() {
		return "��Ʈ��";
	}

}
