package dreamsvhool.cscourse.chapter06;

public class BuildingTest {

	public static void main(String[] args) {
		Building build = new Building();
		build.name = "������ Ÿ��";
		build.address = "������";
		build.totalFloor = 5;
		
		System.out.println("�ǹ��� : " + build.name);
		System.out.println("�ּ� : " + build.address);
		System.out.println("��ü �� �� " + build.totalFloor);
		
		build.moveEleavtor();
		build.changeAddress("�����");
		
		System.out.println("�� �ּ� : " + build.address);

	}

}
