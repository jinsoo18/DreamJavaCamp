package dreamsvhool.cscourse.chapter06;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = newCar();
		myCar.carName = "Dream School Car";
		myCar.oilAmount = 5;
		myCar.distance = 140;
		
		myCar.printCarInfo();
		
		myCar.addoil(10);
		
		myCar.printCarInfo();
		
		myCar.driverCar("IT����", "��õ����", 10.17);
		
		myCar.printCarInfo();
		
		myCar.driveCar("��õ����", "������ ����Ʈ", 60.21);

		myCar.priceCarInfo();

		myCar.distanceCheck();

	}

}
