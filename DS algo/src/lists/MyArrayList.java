package lists;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List <String> name = new ArrayList();
		List <String> colors = new LinkedList(); //bs jo internal funcctining hai vo ab linkedList hisab se ho rahi,kuch fark nhii padega

		ArrayList fruits = new ArrayList();  //ifwe don't specify the type of arraylist that we can add anytype of things in this array 
		
		
		fruits.add("apple");
		fruits.add(80);
		
		System.out.println(fruits);
		
		
		
		ArrayList<String> languages = new ArrayList();
//		or we can also declare it like this 
//		List <String> languages = new ArrayList();  //it is also the same thing 
		languages.add("java");
//		languages.add(32);  //now it shows us error bec. we cant add int in a string type arraylist 
		
	}

}
