package dreamschool.cscourse.chapter08;

import dreamsvhool.cscourse.chapter06.Account;

public class AccountCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account[] arrAcc = {new Account("111-2222-5551", 10000,4.5),
				new Account("111-2222-5552",20000,4.5),
				new Account("111-2222-5553",40000,4.5),
				new Account("111-2222-5554",10000,4.5)
		};
		for (int i = 0; i< arrAcc.length;i++) {
			System.out.println("���¹�ȣ : " + arrAcc[i].getNumber() + "/�ܾ� : "+ 
		arrAcc[i].getBalance() + "/���� : " + arrAcc);[i].getInterestRate() + "%")
		}
		System.out.println("������ �����մϴ�.");
		
		for (int i = 0; i < arrAcc.length; i++) {
			arrAcc[i].setInterestRate(3.7);
			arrAcc[i].calculateInterest();
			System.out.println("���¹�ȣ : "+ arrAcc[i].getNumber() + "/���� : "+
			arrAcc[i].getInterestRate() + "% / �ܾ� : " + arrAcc[i].getBakance());
		}

	}

}
