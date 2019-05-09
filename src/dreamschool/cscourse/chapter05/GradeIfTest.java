package dreamschool.cscourse.chapter05;

public class GradeIfTest {

	public static void main(String[] args) {
		int gilDong = 92;
		int gilSoon = 85;
		
		if (gilDong >= 90 && gilDong <= 100) {
			System.out.println("홍길동 : A학점입니다." );
		}
		if (gilDong >= 80 && gilDong < 90) {
			System.out.println("홍길동 : B학점입니다." );
		}
		if (gilDong >= 70 && gilDong < 80) {
			System.out.println("홍길동 : C학점입니다." );
		}
		if (gilDong >= 60 && gilDong < 70) {
			System.out.println("홍길동 : D학점입니다." );
		}


   
		if (gilDong >= 90 && gilSoon <= 100) {
			System.out.println("홍길순 : A학점입니다." );
		}
		if (gilDong >= 80 && gilSoon < 90) {
			System.out.println("홍길순 : B학점입니다." );
		}
		if (gilDong >= 70 && gilSoon < 80) {
			System.out.println("홍길순 : C학점입니다." );
		}
		if (gilDong >= 60 && gilSoon < 70) {
			System.out.println("홍길순 : D학점입니다." );
		}
	
	
	}


}
