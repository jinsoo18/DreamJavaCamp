package dreamschool.cscourse.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int firstNum = 2 * 3;
		
		if(firstNum < 0) {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}else if (firstNum >= 0 && firstNum < 10 ) {
			System.out.println("2 * 3 : ���ڸ� ���Դϴ�.");
		}else if(firstNum >= 10 && firstNum < 100) {
			System.out.println("2 * 3 : ���ڸ� �� �̻��Դϴ�.");
		}else {
			System.out.println("2 * 3 : ���ڸ� �� �̻��Դϴ�.");
		}
		
		int secondNum = 4 * 5;
		
		if(secondNum < 0) {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}else if (secondNum >= 0 && secondNum < 10 ) {
			System.out.println("4 * 5 : ���ڸ� ���Դϴ�.");
		}else if(secondNum >= 10 && secondNum < 100) {
			System.out.println("4 * 5 : ���ڸ� �� �̻��Դϴ�.");
		}else {
			System.out.println("4 * 5 : ���ڸ� �� �̻��Դϴ�.");
		}
	}

}
