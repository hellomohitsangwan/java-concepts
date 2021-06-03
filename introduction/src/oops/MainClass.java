     package oops;
    class Cat {
	boolean hasfur;
	int eyes,nose,ears,legs;
	String color,bread;
	float noofhairs;
//	ye sari cat k properties ho gayi ye kitni bhi ho sakti he
	 
	public void walk()  {          //ye ham behaviour define krne k liye function/method bana rhee he
//		making function
		System.out.println("cat is walking");
	} 
	public void eat() { 
		System.out.println("cat is eating");
	}
	public void description() {
		System.out.println("my cat is white"+ " it has" + legs + " legs");
	}
	
}
class Dog {
	String hasfur,breed;
	int eyes,nose;
	public void breed() {
		System.out.println("the dog breed is"+breed);
	}
	
}

public class MainClass {     
//	koi bhi java class hogi uske andar ek he public(main) classs hogi.uska naam file k naam k equal rakhna he.
	

	public static void main(String[] args) {
	
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
  
    cat1.walk();
    cat2.eat();
    cat1.legs = 4;         
    cat1.description();
    cat2.description();
    
		 Dog dog1 = new Dog();
		 dog1.breed = "pitbull";
	dog1.breed();
	}
	

}
