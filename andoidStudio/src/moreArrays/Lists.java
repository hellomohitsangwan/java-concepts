package moreArrays;
import java.util.*;
public class Lists {

	public static void main(String[] args) {
		List list = new ArrayList();
	      list.add(4);  //this is the first(0) place of the list and at there 4 is added
	      list.add(3);  //this is the second(1) .. .. . 
	      list.add(8); 
	      list.add(6);
	      list.remove(2); //now the 2 index int. in the list is removed i.e. in this case 8 is removed.
	      
 System.out.println(list.get(1));
 System.out.println(list.get(0));
 System.out.println(list.get(2));  //now in this 6 is printed bec. 2 os removed.
 System.out.println(list.toString()); //it converts our list to string.
		
		
	}

}
