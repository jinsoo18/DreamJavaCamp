package icehs.science.chapter03;

public class StringEx {

	public static void main(String[] args) {
		String king = "�������";
		String $ = "10000";
		int thisYear = 2019;
		String yesno = "true";
		
		int parse$ = Integer.parseInt($);
		boolean booleanYesNo = Boolean.parseBoolean(yesno);
		
		System.out.println(king + " : " + $);
		System.out.println(thisYear + "��");
		System.out.println($ + thisYear);
		System.out.println(thisYear + parse$);
		System.out.println(booleanYesNo);
		

	}

}
