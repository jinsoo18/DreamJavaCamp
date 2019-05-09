package dreamschool.cscourse.chapter07;

public class ItBookTest {

	public static void main(String[] args) {
		ItBook sql = new ItBook("SQL Plus",50000, 5.5 );
		ItBook java = new ItBook("Java 2.0", 28000, 2.8);
		ItBook jsp = new ItBook("JSP Servlet", 37000, 6.9);
		
		sql.printItBookInfo();
		java.printItBookInfo();
		jsp.printItBookInfo();
		
		System.out.println();
		System.out.println("SQL Plus ������ �������� �����մϴ�.");
		sql.setPrie(55000);
		java.setDiscuntRate(9.5);
		sql.printItBookInfo();
		
		System.out.println();
		System.out.println("Java2.0 ������ �����մϴ�.");
		java.setPrie(33000);
		java.printItBookInfo();
		
		System.out.println();
		System.out.println("JSP Servlet ����� �������� �����մϴ�.");
		jsp.setTitle("Servlet & JSP");
		jsp.setDiscuntRate(12.6);
		jsp.printItBookInfo();
		
	}

}
