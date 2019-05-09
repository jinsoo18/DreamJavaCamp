package dreamsvhool.cscourse.chapter06;

public class Car {
	String carName;//차 이름
	int oilAmount;//남은 기름
	double distance;// 달린 거리
	
	void addoil(int amount) {
		oilAmount += amount;
		System.out.println("휘발유를" + amount + "주유합니다.");
		
	}
	void printCarInfo() {
		System.out.println("[" + carName + "] 남은 기름양 : " + oilAmount + 
				"L, 총주행거리 : " + distance + "km");
		
	}
	void driverCar(String startPoint, String endPoint, double driverDistance) {
		System.out.println(startPoint + "에서" + endPoint + "까지" + 
	driverDistance + "km 주행하였습니다.");
		
		distance += driverDistance;
		oilAmount -= (int)(driverDistance / 20);
		//남은 기름양은 주해어리에서 빼줘야 하는 식
		
	}
	void distanceCeck() {
		System.out.println("주행가능 거리는 약" + (oilAmount * 20) + "km입니다.");
	}

}
