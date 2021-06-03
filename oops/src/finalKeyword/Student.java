package finalKeyword;

class  childern extends teacher {    //now as we have teacher class final so we cannot make objects of that class thats why it is showing us error
	String name;
	public void getDescription()  {
		System.out.println("the children name is " + name);
	}
}
public class Student {
  //it shows error bec, we need to initalixe them
	final int rollNo;
	final String name;
	final static String hoby;
	
//	ways to initliaze them :-
	
	
	//this is called initalizer block and they are bascically used to initialize the variables
	{
		rollNo = 32;
	}
	
	  //by help of a constructor
	public Student() {
		name = "mohit";
	}
	
	//by help of a static block
	static {
		hoby = "doing coding";
		name = "mohit";  //we cannot declare non static variabkle ina static in a static block thats why it shows us the error.
	}
}
