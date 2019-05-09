package Goto.github;

public class AccountTest {
    
    public static void main( String[] args ) {
        
        System.out.println( ">> 계좌를 생성합니다." );
        Account acc = new Account( "441-0290-1203", 500000, 7.3 );
        acc.printAccountInfo();
        
        
        System.out.println( "\n>> 20000원을 입금합니다." );
        acc.deposit(20000);
        acc.printAccountInfo();
        
        
        System.out.println( "\n>> 이자를 지급합니다." );
        int interet = acc.calculateInterest();
        System.out.println("이자 : " + interet);
        acc.printAccountInfo();
        
        
        System.out.println( "\n>> 150000원을 출금합니다." );
        acc.withdraw(15000);
        acc.printAccountInfo();
        
        
        System.out.println( "\n>> 500000원을 출금합니다." );
        acc.withdraw(50000);
        acc.printAccountInfo();
        
        
    }
}