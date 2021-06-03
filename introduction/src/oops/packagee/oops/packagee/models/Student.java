package oops.packagee.oops.packagee.models;

public class Student {
  private String name;
  public int legs;
  public Student(String name) {
	   this.name = name;
   }
   String getName() {    //now in this we have used the default access modifier which
	   //means that we can access 
	   //getName function in this same package not is other package  
	   getPassword();
	   System.out.println(getPassword());//now here we can access the getpassword as it is the same class
	   return name;
   }
	private String getPassword() {  //private is a access modifier which means 
		//that we cannot access "getPassword"
		//in another class.however same class me access it this class.
	return"password";	
	}
	
}
