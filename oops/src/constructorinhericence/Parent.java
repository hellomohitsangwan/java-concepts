package constructorinhericence;

public class Parent {
	protected String name;
	public Parent(String name) {
		this.name = name;
		System.out.println("inside parent constructor");
	} 
	public void eat() {
		System.out.println("parent is eating");
	}

}
