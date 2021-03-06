package dreamsvhool.cscourse.chapter06;

public class Account {
	
	String accName; //예금주
	String accNo; // 계좌번호
	int balance;// 잔액
	
	void deposit(int money) {
		if (money < 0) {
			System.out.println("[에러] 금액은 음수를 입력할 수 없습니다.");
		}else {
			balance += money;
		}
		
	}

	
	int withdraw(int money) {
		if (money < 0) {
			System.out.println("음수를 입력할 수 없습니다.");
			return 0;
		}else if (money > balance) {
			System.out.println("[에러] 잔액이 부족합니다.");
			return 0;
		}
		else {
			balance -= money;
			return money;
		}
	}
	
	void printAccountInfo() {
		System.out.println("계좌 : " + accNo + "(예금주 : " + accName +")");
		System.out.println("계좌번호 : " + accNo);
		System.out.println("잔액 : " + balance); 
	}

}
