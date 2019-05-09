package dreamschool.cscourse.chapter10;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] cars = new Car[2];
		cars[0] = new Texi();
		cars[1] = new Truck();
		
		cars[0].setOilSize(10);
		cars[1].setOilSize(10);
		Texi taxi = ((Texi)cars[0]);
		taxi.setMaxNum(4);
		Truck truck = ((Truck)cars[1]);
		truck.setMaxWeight(100);
		
		cars[0].go(20);
		System.out.println("연료 : " + cars[0].getOilSize());
		System.out.println("택시 정원 : " + taxi.getMaxNum() + "명");
		
		cars[1].go(30);
		System.out.println("연료 : " + cars[1].getOilSize());
		System.out.println("트럭 최대 적재량 : " + truck.getMaxWeight() + "kg");

	}

}
