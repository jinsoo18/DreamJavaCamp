package dreamsvhool.cscourse.chapter06;

public class Account {
	
	String accName; //������
	String accNo; // ���¹�ȣ
	int balance;// �ܾ�
	
	void deposit(int money) {
		if (money < 0) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
		}else {
			balance += money;
		}
		
	}

	
	int withdraw(int money) {
		if (money < 0) {
			System.out.println("������ �Է��� �� �����ϴ�.");
			return 0;
		}else if (money > balance) {
			System.out.println("[����] �ܾ��� �����մϴ�.");
			return 0;
		}
		else {
			balance -= money;
			return money;
		}
	}
	
	void printAccountInfo() {
		System.out.println("���� : " + accNo + "(������ : " + accName +")");
		System.out.println("���¹�ȣ : " + accNo);
		System.out.println("�ܾ� : " + balance); 
	}

}
