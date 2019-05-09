package dreamschool.cscourse.chapter10Heros;

public class Hero implements CanFly, CanSwim, CanFight{

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("싸운다.");
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("헤엄친다.");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("난다.");
		
	}

	public void action() {
		
	}

}
