package dreamschool.cscourse.chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		int score = 85;
		
		if(score > 100 || score < 0) {
			System.out.println("������ �߸��Է��Ͽ����ϴ�.");
				
		}else if(score >= 90 && score <= 100) {
			System.out.println("A�����Դϴ�.");
		}else if(score >= 80 && score < 90) {
			System.out.println("B�����Դϴ�.");
		}else if(score >= 70 && score < 80) {
			System.out.println("C�����Դϴ�.");
		}else if(score >= 60 && score < 70) {
			System.out.println("D�����Դϴ�.");
		} else {
			System.out.println("F�����Դϴ�.");
		}
		}
		

	}


