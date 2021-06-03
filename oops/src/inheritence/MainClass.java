package inheritence;

public class MainClass {

	public static void main(String[] args) {
	Teacher t = new Teacher();
	t.name = "harry";
	t.eat();
	t.walk();
	t.teach();
	Singer s = new Singer() ;
	s.name = "aditya";
	s.sing();
	s.eat();
	}
}
