package Goto.github;

import java.util.Scanner;

// ���� 4.
// Ŀ�� �ֹ��� �Ϸ��� �Ѵ�.
// �޴��� ����, �� �޴� ���� �� ���� �ֹ��� ������ �Է� �޾� �����ؾ� �� �� �ݾ��� ����� ����.
// �׸��� �� �ݾ��� ���� �ݾ��� �Ѿ�� ����Ʈ�� ������ �ش�.
// �� �ݾ� 12000�� �̻� : ���� �ݾ��� 1% ����
// �� �ݾ� 30000�� �̻� : ���� �ݾ��� 2% ����
public class Workshop04 {
    
    private static String point;

	public static void main( String[] args ) {
        
        System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��\n" );
        
        System.out.println( "========= �ֹ� =========" );
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
        int americano = getUserInput();
        
        System.out.print( " ī��� �ֹ� ���� : " );
        int latte = getUserInput(); 
        
        System.out.print( " ���̱� �ֹ� ���� : " );
        int bagle = getUserInput();
        
        System.out.print( " ũ��ġ�� �ֹ� ���� : " );
        int cheese = getUserInput();
        
        System.out.println("============�ݾ�=============");
        System.out.println("�Ƹ޸�ī�� : " + americano * 2000 + "��");
        System.out.println("�� : " + latte * 3000 + "��");
        System.out.println("���̱� : " + bagle * 1500 + "��");
        System.out.println("ũ��ġ�� : " + cheese * 500 + "��");
        
        int total = (americano * 2000) + (latte * 3000) + (bagle * 1500) + (cheese * 500);
        
        int point = 0;
        if (total >= 30000) {
        	 point = (total / 100 * 2);
        	
        	
        }else if (total >= 12000) {
        	 point = (total / 100 * 1);    	
        
        }else {
        	point = 0;
        }
        
        System.out.println("======================");
        System.out.println("�� ���� �ݾ� : " + total + "��");
		System.out.println("����Ʈ ���� : " + point  + "��");
    }
    
    public static int getUserInput() {
        
    	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    	
    }
}
