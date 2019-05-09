package dreamschool.cscourse.chapter08;

public class StudentArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = {new Student("강감찬", "STU0001","010-1234-5678"),
				new Student("이순신","STU0002", "010-2345-6789"),
				new Student("김유신","STU003","010-3456-7890")
		};
		
		for(int i =0; i < students.length; i++) {
			students[i].printStudentInfo();
		}

	}

}
