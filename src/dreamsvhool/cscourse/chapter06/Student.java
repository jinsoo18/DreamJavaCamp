package dreamsvhool.cscourse.chapter06;

public class Student {
	
	String name;
	String stuNum;
	int korean;
	int math; 
	int english;
	
	double calculateAverage() {
		double avg = (korean + english + math) / (double)3;
		return avg;
	}
	
	void printStudentInfo() {
		System.out.println("�л��� : " + name);
		System.out.println("�й� : " + stuNum);
		System.out.println("�������� : " + korean);
		System.out.println("�������� : " + math);
		System.out.println("�������� : " + english);
		System.out.println("������� : " + (int)calculateAverage());
	}
	
	void changeStudentInfo(String newId) {
		stuNum = newId;
	}
	
	
	
	
	
	

}
