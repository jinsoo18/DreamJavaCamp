package dreamschool.cscourse.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		
		int sum = 0;
		int evenSum = 0;
		int oddSum = 0;
		
		
		for(int i = 1; i <= 1000; i++) {
			sum += i;
			if((i % 2) == 0) {
				evenSum += i;
			
			}else {
				oddSum += i;
			}
		}
		
		
		
		System.out.println("1 부터 100천까지의 합 : " + sum);
		System.out.println("1부터 100까지의 짝수들의 합 : " + evenSum);
		System.out.println("1부터 100까지의 홀수들의 합 : " + oddSum);

	}

}
