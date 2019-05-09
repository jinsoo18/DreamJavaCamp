package dreamschool.cscourse.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int firstNum = 2 * 3;
		
		if(firstNum < 0) {
			System.out.println("음수를 확인하지 않습니다.");
		}else if (firstNum >= 0 && firstNum < 10 ) {
			System.out.println("2 * 3 : 한자리 수입니다.");
		}else if(firstNum >= 10 && firstNum < 100) {
			System.out.println("2 * 3 : 두자리 수 이상입니다.");
		}else {
			System.out.println("2 * 3 : 세자리 수 이상입니다.");
		}
		
		int secondNum = 4 * 5;
		
		if(secondNum < 0) {
			System.out.println("음수를 확인하지 않습니다.");
		}else if (secondNum >= 0 && secondNum < 10 ) {
			System.out.println("4 * 5 : 한자리 수입니다.");
		}else if(secondNum >= 10 && secondNum < 100) {
			System.out.println("4 * 5 : 두자리 수 이상입니다.");
		}else {
			System.out.println("4 * 5 : 세자리 수 이상입니다.");
		}
	}

}
