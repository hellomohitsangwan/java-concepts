 package encapsulation;

public class EncapsulationIntro {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.setAge(16);
		System.out.println(obj.getAge());
		
		
		Student obj2 = new Student();
		obj2.setAge(32);
		System.out.println(obj2.getAge());
		
		//now we can access the student class fields by using getter and setter variable 
		//in this can access its fields but now student class can also apply some condn.
//	    obj.setName("mohit");
        
	}
}
  //package is bascically similar to folders we make in local drives.