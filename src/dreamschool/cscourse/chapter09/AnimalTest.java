package dreamschool.cscourse.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.setAge(3);
		cat.setName("�߿���");
		cat.setKind("�丣�þ�");
		
		System.out.println("�̸� : " + cat.getName());
		System.out.println("���� : " + cat.getAge() + "��");
		System.out.println("���� : " + cat.getKind());
		
		cat.run();
		cat.hunt();
		cat.play();

	}

}
