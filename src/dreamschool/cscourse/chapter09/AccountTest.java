package dreamschool.cscourse.chapter09;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FundAccount fund1 = new FundAccount("111-2222","ȫ�浿", 500000,4.7);
		FundAccount fund2 = new FundAccount("666-7777","ȫ���", 100000,2.9);
		
		fund1.openAccount();
		System.out.println("������ �߻��߽��ϴ�.");
		
		System.out.println();
		fund2.openAccount();
		System.out.println("������ �߻��߽��ϴ�.");
//		
//		fund1.setNumber("111-2222");
//		fund1.setName("ȫ�浿");
//		fund1.setBalance(5000000);
//		
//		fund1.openAccount();
//		
//		fund1.setEarningRate(4.7);
//		fund1.earnMoney();

	}

}
