package icehs.science.chapter03;

public class StaticsCastingTest {

	public static void main(String[] args) {
		double lottoProbability = 0.0000001235;
		long popuLation = 6973738433L;
		
		int intlottoProbability =(int)lottoProbability;
		System.out.println("로또에 당첨될 확률 : " + lottoProbability);
		System.out.println("로또에 당첨될 확률 int 변환 : " + intlottoProbability);
		
		int intPopuLation = (int)popuLation;
		System.out.println("전 세계의 인구수 : " + popuLation);
		System.out.println("전 세계의 인구수 int 변환 : " + intPopuLation);

	}

}
