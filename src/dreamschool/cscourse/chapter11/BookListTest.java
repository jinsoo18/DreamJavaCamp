package dreamschool.cscourse.chapter11;

import java.util.ArrayList;

public class BookListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book("Java�� ����",346,15000));
		list.add(new Book("Oracle 11g",560,18000));
		list.add(new Book("JSP �����ϱ�",271,12000));
		
		Book book1 = list.get(0);
		book1.setName("���� �ڱ��ϴ� Java");
		book1.setPage(900);
		book1.setPrice(25000);
		
		
		for (int i = 0; i< list.size(); i++) {
			Book book = list.get(i);
			System.out.println((i+1)+","+book.getName()+"( "+book.getPage()+"page : "
					+ book.getPrice()+"�� )");
			//System.out.println((i+1)+", "+list.get(i).getName());
		}

	}

}
