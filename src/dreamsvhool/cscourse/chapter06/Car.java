package dreamsvhool.cscourse.chapter06;

public class Car {
	String carName;//�� �̸�
	int oilAmount;//���� �⸧
	double distance;// �޸� �Ÿ�
	
	void addoil(int amount) {
		oilAmount += amount;
		System.out.println("�ֹ�����" + amount + "�����մϴ�.");
		
	}
	void printCarInfo() {
		System.out.println("[" + carName + "] ���� �⸧�� : " + oilAmount + 
				"L, ������Ÿ� : " + distance + "km");
		
	}
	void driverCar(String startPoint, String endPoint, double driverDistance) {
		System.out.println(startPoint + "����" + endPoint + "����" + 
	driverDistance + "km �����Ͽ����ϴ�.");
		
		distance += driverDistance;
		oilAmount -= (int)(driverDistance / 20);
		//���� �⸧���� ���ؾ���� ����� �ϴ� ��
		
	}
	void distanceCeck() {
		System.out.println("���డ�� �Ÿ��� ��" + (oilAmount * 20) + "km�Դϴ�.");
	}

}
