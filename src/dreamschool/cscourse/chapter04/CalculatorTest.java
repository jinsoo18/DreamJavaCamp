package dreamschool.cscourse.chapter04;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 7;
		
		int plusResult = num1 + num2;
		int removeResult = num1 - num2;
		int multiplyResult = num1 * num2;
	    int divisionResult = num1 / num2;
		int remainderResult = num1 % num2;
		
		System.out.println("µ¡¼À °á°ú : " + plusResult);
		System.out.println("»¬¼À °á°ú : " + removeResult);
		System.out.println("°ö¼À °á°ú : " + multiplyResult);
		System.out.println("³ª´°¼À °á°ú : " + divisionResult );
		System.out.println("³ª¸ÓÁö : " + remainderResult);
		

	}

}
