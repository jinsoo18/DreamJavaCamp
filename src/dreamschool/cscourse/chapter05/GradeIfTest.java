package dreamschool.cscourse.chapter05;

public class GradeIfTest {

	public static void main(String[] args) {
		int gilDong = 92;
		int gilSoon = 85;
		
		if (gilDong >= 90 && gilDong <= 100) {
			System.out.println("ȫ�浿 : A�����Դϴ�." );
		}
		if (gilDong >= 80 && gilDong < 90) {
			System.out.println("ȫ�浿 : B�����Դϴ�." );
		}
		if (gilDong >= 70 && gilDong < 80) {
			System.out.println("ȫ�浿 : C�����Դϴ�." );
		}
		if (gilDong >= 60 && gilDong < 70) {
			System.out.println("ȫ�浿 : D�����Դϴ�." );
		}


   
		if (gilDong >= 90 && gilSoon <= 100) {
			System.out.println("ȫ��� : A�����Դϴ�." );
		}
		if (gilDong >= 80 && gilSoon < 90) {
			System.out.println("ȫ��� : B�����Դϴ�." );
		}
		if (gilDong >= 70 && gilSoon < 80) {
			System.out.println("ȫ��� : C�����Դϴ�." );
		}
		if (gilDong >= 60 && gilSoon < 70) {
			System.out.println("ȫ��� : D�����Դϴ�." );
		}
	
	
	}


}
