package dreamschool.cscourse.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.setAge(3);
		cat.setName("야옹이");
		cat.setKind("페르시안");
		
		System.out.println("이름 : " + cat.getName());
		System.out.println("나이 : " + cat.getAge() + "살");
		System.out.println("종류 : " + cat.getKind());
		
		cat.run();
		cat.hunt();
		cat.play();

	}

}
