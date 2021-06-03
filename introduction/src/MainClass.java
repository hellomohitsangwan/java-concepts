
//	koi bhi java class hogi uske andar ek he public(main) classs hogi.uska naam file k naam k equal rakhna he.
	class Cat {
		boolean hasfur;
		int eyes,nose,ears,legs;
		String color,bread;
//		ye sari cat k properties ho gayi ye kitni bhi ho sakti he
		 
		public void walk()  {
//			making function
			System.out.println("cat is walking");
		} 
		public void eat() { 
			System.out.println("cat is eating");
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


	public static void main(String[] args) {
	
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    
    cat1.walk();
    cat2.eat();
		 Dog dog1 = new Dog();
		 dog1.breed = "pitbull";
		dog1.breed();	
		
		
		
	}
	

}
