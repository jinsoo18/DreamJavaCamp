package Goto.github;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// ���� 5.
// A������ �б⸻�� �Ǿ���. �����񺰷� ������ �Է� �޾� ���б��� ���� �л��� �����Ϸ��� �Ѵ�.
// ���б��� ���� �� �ִ� ������ �Ʒ��� ����.
//   1) ������ 3.7 �̻�   2) �� ���� ������ 2.5 �̻� (�� �����̶� 2.5 �̸��� ������ �ִٸ�, �������� ���б� Ż��)
public class Workshop05 {
    
    public static void main( String[] args ) {
        
        System.out.print( "Computer Science ������ �Է��ϼ��� : " );
        double cs = getUserInput();
        
        System.out.print( "Java Programming ������ �Է��ϼ��� : " );
        double jp = getUserInput();
        
        System.out.print( "���м��� ������ �Է��ϼ��� : " );
        double math = getUserInput();
        
        System.out.print( "������� ���� ������ �Է��ϼ��� : " );
        double opera = getUserInput();
        
        System.out.print( "������ ������ �Է��ϼ��� : " );
        double badmin = getUserInput();
        
        System.out.println( "==============================" );
        
        double total = (cs + jp + math + opera + badmin) / 5;
        
        if(total >= 3.7 && cs >= 2.5 && jp >= 2.5 && math >= 2.5 &&opera >= 2.5 && badmin >= 2.5 ){
           	System.out.println("���� �б� ���б� ����� �Դϴ�.");
           } else{
           	System.out.println("���� �б� ���б� ����ڰ� �ƴմϴ�.");
           }
        
        
        System.out.println( "������" + total +  "�� �Դϴ�." );
    }
    
    public static double getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	double value = scanner.nextDouble();
    	return value;
    }
}
