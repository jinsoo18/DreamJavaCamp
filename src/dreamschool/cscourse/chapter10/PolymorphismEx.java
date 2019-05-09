package dreamschool.cscourse.chapter10;

public class PolymorphismEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] persons = new Person[3];
		persons[0] = new Person("홍길동","111-2222");
		persons[1] = new Student("홍길순","111-2345","컴퓨터공학과");
		persons[2] = new Teacher("강감찬","222-3333","Java");
		
		/*/for(int i = 0; i < persons.length;i++) {
			persons[i].eat();
			persons[i].sleep();
			System.out.println();
		}/*/
		
		//위에 for문이랑 아래 for문이랑 같다.
		//배열로 저장했을때만 밑에처럼 한다.
		
		for(Person p : persons) {
			p.eat();
			p.sleep();
			System.out.println();
		}
		
		

	}

}
