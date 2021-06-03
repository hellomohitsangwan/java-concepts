package lists;
import java.util.ArrayList;
import  java.util.LinkedList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		
List <String> fruits = new LinkedList();
List <String> vegetables = new ArrayList();
List <String> toRemove = new ArrayList();


//add method - add the element tyo the arraList
fruits.add("apple");
fruits.add("banana");
vegetables.add("potatto");
vegetables.add("tomato");


//addAll() method = add aone Listy to anaother;
fruits.addAll(vegetables);


//get(index) = ives the index of that element on t hat araylist
System.out.println(fruits.get(1));


//set(index ,  ehatToSet)
fruits.set(2 , "blackberry");  //matlab 2nd index ko blackberry krdo jo bhii element hai usme uski jagehh

//remove(index) = remove that element of the index
fruits.remove(1);


//clear() = clear the whole array;
//fruits.clear();

//add(index , collection) = add the collection at t he given index andal the elements after that aage khisak jayege
fruits.add(1 , "mangoo");
 
//removeAll(collection) = remove the collection from the array
toRemove.add("apple");
fruits.removeAll(toRemove);

//size() = return a int and tells us about the size of the array
System.out.println(fruits.size());


// contains(element) = returns true or false athat weather the element is present is or not
System.out.println(fruits.contains("guavava"));


//isEmpty() = tells that weather t he list is empty or not
System.out.println(fruits.isEmpty());


//toArray() = bascicallytonvery the list to array of object but if we wanted it to convert it into an array of Strings then we have to do like this
String temp [] = new String[fruits.size()];
fruits.toArray(temp);
for(String fruit : fruits) {
	System.out.println(fruit);
}
//aur ek dusra bhii function hota hai jisme hame vo object ka array return krta hai usme kuch dakna nhi hita unlike ki isme dala tha temp[]

System.out.println(fruits);
System.out.println(vegetables);








	}

}
