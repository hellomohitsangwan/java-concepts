package constructorinhericence;

public class Son1 extends Parent{
public Son1(String name) {
	super(name);  //super krte he iske parent ka constructor call ho jayega
	System.out.println("inside son 1 constructor");
}


}
