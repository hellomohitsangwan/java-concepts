package inheritence;

public class Person {
	
protected String name;  //protected keyword pass on h jate e apne child k andr
    //kis aur ko visibl nhi hogi bs apne children ko he visible hogin
public void walk() {
	System.out.println("person "+name+" is walking");
} 
public void eat () {
	
	System.out.println("person "+name+" is eating");
}


//now iske aage static likhne ka matlab hai k ye  vala function class se related haii aur baki k upar jese wlak and eat jinske aage static keyword nhii lagaya vo sare object se related haii class se  jagehh.
public static void laughing()  {
	System.out.println("person is laughing");
}
	
}
