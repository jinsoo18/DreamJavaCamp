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
		
		myCar.driverCar("IT센터", "인천공항", 10.17);
		
		myCar.printCarInfo();
		
		myCar.driveCar("인천공항", "곤지암 리조트", 60.21);

		myCar.priceCarInfo();

		myCar.distanceCheck();

	}

}
