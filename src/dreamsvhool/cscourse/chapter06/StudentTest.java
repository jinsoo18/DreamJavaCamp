package dreamsvhool.cscourse.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "ȫ�浿";
		stu.stuNum = "5001";
		stu.korean = 94;
		stu.english = 80;
		stu.math = 89;
		
		stu.printStudentInfo();
		System.out.println("�й��� �����մϴ�!!!");
		stu.changeStudentInfo("STU0001");
		stu.printStudentInfo();
		

	}

}
