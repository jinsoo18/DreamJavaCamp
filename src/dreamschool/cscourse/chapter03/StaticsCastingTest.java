package dreamschool.cscourse.chapter03;

public class StaticsCastingTest {

	public static void main(String[] args) {
		double lottoProbability = 0.0000001235;
		long popuLation = 6973738433L;
		
		int intlottoProbability =(int)lottoProbability;
		System.out.println("�ζǿ� ��÷�� Ȯ�� : " + lottoProbability);
		System.out.println("�ζǿ� ��÷�� Ȯ�� int ��ȯ : " + intlottoProbability);
		
		int intPopuLation = (int)popuLation;
		System.out.println("�� ������ �α��� : " + popuLation);
		System.out.println("�� ������ �α��� int ��ȯ : " + intPopuLation);

	}

}
