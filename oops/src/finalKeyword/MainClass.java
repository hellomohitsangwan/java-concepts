package finalKeyword;

 final class teacher {
	 
	 String name;
	public void geTDescription() {
		System.out.println("the t6eacher name is " +  name);
	}
}

public class MainClass {

	//a final keyword must be initalised
	int age;  
	final int noOfLegs;   //it shows error bec. it is a final int and it must be initalised with a value
	final int noOfEars = 2; //liek that.its value cannot be changed
	
	
	public static void main(String[] args) {
		
		//a final keyword must be initalised
		int age;  
		final int noOfLegs;  //for local variables it is not true 
		
		
		//we cannot change the value of a variable whn final keyword is used
		int a = 2;
		a=4; //now hee is no prob. as it is not a final 
		
		 final int b = 8;
		 b=10;
				 

		 //now we can change reference of objects if they are not initialized as final
		 Student obj1 = new Student();
		 Student obj2 = new Student();
		 
		 obj1 = obj2;
		 
		 
		 //but we cannot change reference of objects if they are declared as final
		 final Student obj3 = new Student();
		 final Student obj4 = new Student();
		 
		 obj3 = obj4 //it shows error as these objects are final
				 //but we can change their value like
				 obj3.name = "mohit";
		 obj4.name = obj3.name;
				 
	}

}
