package polymorphism;

public class MainClass {

	public static void main(String[] args) {
		Dog d = new Dog();
		Pet p = d;
		Animal a = d;
		//just an up casting
	System.out.println(p.name);	//isme pet ka naam aayega kyunkui variables kbhi overide nhii hote
	System.out.println(d.name); //isme dog ka name aayega kyunki variables kbhi overide nhii hote
		
    		d.walk();
    		p.walk();
    		//iska output dono baar dog is walking aayega.kyunki isne run time pr check kiya ye 
    		//p aur dono a dog k object he isleye usne dog vala function he call kiya.this is called run
    		//time polymorphism.
    		//overriding is run time polymophism
    		//slow run
    	
    		
    		greetings();
    		greetings("mohit");
    		greetings("mohit" , 8);
    		//this is called ompile time polymorphism i.e. hame compile time pr he pata the k komsa method 
    		//call hone vala he
    		//overloading is compile time polymophism
    		//fast run
    		
	}
	public static void greetings() {
		System.out.println("hi ");
	}
	public static void greetings(String s) {
		System.out.println("hi there ");
	}
	public static void greetings(String s , int n) {
		for(int j = 0; j<n ;j++) {
			System.out.println("i love coding");
		}
	}
}
