package dreamschool.cscourse.chapter10;

public class CarTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car[] cars = new Car[2];
		Washwer[] cars = new Washwer[2];
		
		cars[0] = new Texi();
		cars[0].wash();
		
		System.out.println("�ý� : ");
		cars[0].wash();
		
		cars[1] = new Truck();
		
		System.out.println("Ʈ�� : ");
		cars[1].wash();

	}

}
