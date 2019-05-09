package dreamschool.cscourse.chapter07;

public class Book {

	String title;
	String author;
	int price;
	
	Book(){
		
	}
	Book(String title, String author){
		this.title = title;
		this.author = author;
		
	}
	Book (String title, int price){
		this.author;
	}
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	Book(String title,String author,int price){
		this.title = title;
	}
	
	void printBookInfo() {
		System.out.println(title);
		System.out.println(price);
	}

}
