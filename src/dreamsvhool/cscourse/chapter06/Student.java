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
		System.out.println("학생명 : " + name);
		System.out.println("학번 : " + stuNum);
		System.out.println("국어점수 : " + korean);
		System.out.println("수학점수 : " + math);
		System.out.println("영어점수 : " + english);
		System.out.println("평균점수 : " + (int)calculateAverage());
	}
	
	void changeStudentInfo(String newId) {
		stuNum = newId;
	}
	
	
	
	
	
	

}
