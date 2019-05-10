package dreamschool.cscourse.chapter11;

import java.util.ArrayList;

public class ArrayListAdditionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;
		int num2 = 10;
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(num1);
		list.add(num2);
		list.add(100);
		list.add(130);
		list.add(new Integer(25));
		
		int a = list.get(4);
		System.out.println(a);
		list.remove(1);
		list.set(0, 500);
		System.out.println(list);
		
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}

}
