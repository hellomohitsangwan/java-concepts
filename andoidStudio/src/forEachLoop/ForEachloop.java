package forEachLoop;
import java.util.*;
public class ForEachloop {

	public static void main(String[] args) {
		
		String[] familyName = {"manoj.mohit,seema,monu"};
		for(String name : familyName)  //iska mtlb string,string type me name banaya use family name dal do
		{
			System.out.println(name);
		}
		
		
  //below is how we can use for each loop in List type.
	 List <String> familymember = new ArrayList<String>(); //now we have to put String in angular bracket here bec. we want to convert it into a string type   
	 familymember.add("mohit");
	 familymember.add("monu");
	 familymember.add("seema");
	 familymember.add("manoj");
	  for(String fname : familymember) {
		  System.out.println(fname);
	  }
	   
	
	}

}
