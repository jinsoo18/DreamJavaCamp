package dreamschool.cscourse.chapter03;

public class EmployeeInformation {

	public static void main(String[] args) {
		String name = "홍길동";
		String startYear = "2002";
		int thisYear = 2019;
		
		int intStartYear = Integer.parseInt(startYear);
		
		System.out.println("이름 : " + name);
		System.out.println("입사년도 : " + startYear);
		System.out.println("근무년수 : " + (thisYear - intStartYear));
		
		
		

	}

}
