package dreamschool.cscourse.chapter08;

public class MaxMinTestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = {12,53,24,10,22,38,64,39};
		
		int max = data[0];
		int min = data[0];
		
		for (int i = 0;i < data.length;i++) {
			if(data[i] > max) {
				max = data[i];
			}
			if (data[i] < min) {
				min = data[i];
			
		}
		
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}
	

}
