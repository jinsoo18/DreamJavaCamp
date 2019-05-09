package dreamschool.cscourse.chapter10Heros;

public class HreoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero[] heroes = {
				new SuperMan(),new BatMan(),new SpiderMan()
		};
		
		System.out.println("Hero ¸ñ·Ï : " + heroes[0] + ","+
				heroes[1] + "," + heroes[2] + ",");
		
		for(Hero hero : heroes) {
			hero.action();
		}

	}

}
