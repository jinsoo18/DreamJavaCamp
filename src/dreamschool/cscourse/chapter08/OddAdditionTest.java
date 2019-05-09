package dreamschool.cscourse.chapter08;

public class OddAdditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10,21,33,42,51,64,79,80};
		int sum = 0;
		
		
		double avg = 0;
		
		for (int i = 0;i < numbers.length;i++) {
			if(numbers[i] % 2 == 1) {
				System.out.println(numbers[i] + " ");
				sum += numbers[i];
			}
		}
		System.out.println();
		System.out.println("홀수들의 합계는" + sum + "입니다.");
			

	}

}
