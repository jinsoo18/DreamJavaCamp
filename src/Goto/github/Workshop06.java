package Goto.github;

public class Workshop06 {

	public static void main(String[] args) {
		
		int myDan = 9;
		
		for(int i = 1; i <= 9; i++ ) {
			for(int dan = 2; dan <= myDan; dan++) {
				int result = dan * i;
				if(dan == 9) {
					System.out.println(dan + " * " + i + " = " + result );
				}else {
					System.out.print(dan + " * " + i + " = " + result + " , " + "\t");
				}
				
				
			}
		}

	}

}
