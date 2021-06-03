package inheritence;

public class Teacher extends Person //ye "Teacher extends Person" ka matlab he
    //teacher ne peron class k sari properties inherit kr le he jese k walk,eat.
    //iska format hota he "child exend parent".or teacher ka parent person haii
 
{
	
public void teach () {
	super.eat();  //ye isleye use hota he jb hame children class se parent class to access krna ho 
	//iska super ka matlab phle super vali commnd run hogi uske baad agli  
	System.out.println( "teacher "+name+" is teaching");
}
public void walk ()  //now this is called method overiding,it happens when same
    //method is defined is both superclass and subclass,in that case, the method 
    //in the subclass overrides(mlb subclass vala he chalega).jese isimee wl vala
    //method parent class me bhi tha aur subclass me bhii lekin execute subclass 
    //vala huaa. 
{
	System.out.println("teacher " + name + "is walking");
}

}
