package Goto.github;

import java.util.Random;
import java.util.Scanner;

public class Workshop07 {

	public static void main(String[] args) {
		int campNo = getHiddenNumber();
		
		for(int i = 1; i <= 10; i++) {
			int userNo = getUserInput();
			if (userNo == getUserInput());
			if(userNo == campNo) {
				System.out.println("�����մϴ�~~!");
				break;
				
			}else if (userNo > campNo) {
				System.out.println(userNo + "���� �۽��ϴ�.");
			}else if (userNo < campNo) {
				System.out.println(userNo + "���� Ů�ϴ�.");
			}
		}
		System.out.println("�����մϴ�. BYE ~ BYE~");
		

	}
	public static int getHiddenNumber() {
		Random random = new Random();
		int num = random.nextInt(100);
		return num;
	}
	public static int getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    }

}
