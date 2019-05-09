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
			System.out.println("계좌번호 : " + arrAcc[i].getNumber() + "/잔액 : "+ 
		arrAcc[i].getBalance() + "/이율 : " + arrAcc);[i].getInterestRate() + "%")
		}
		System.out.println("이율을 변경합니다.");
		
		for (int i = 0; i < arrAcc.length; i++) {
			arrAcc[i].setInterestRate(3.7);
			arrAcc[i].calculateInterest();
			System.out.println("계좌번호 : "+ arrAcc[i].getNumber() + "/이율 : "+
			arrAcc[i].getInterestRate() + "% / 잔액 : " + arrAcc[i].getBakance());
		}

	}

}
