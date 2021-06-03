package Sets;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <String> fruits = new HashSet<>();
		
		fruits.add("apple");
		fruits.add("kiwi");
		fruits.add("banana");
		
		fruits.add("banana"); //now it is not added in the Set bec. banana is present already there in set so no duplicated allwowed
		
		//the dd method also returns teh boolean that the element is added in that set
		System.out.println(fruits.add("blackberry"));
		System.out.println(fruits.add("apple"));;
		
	//now on adding the elemrnts to teh Hashset there were added in a bag randomly so they were printed randomly 
		System.out.println(fruits);
		
		
		
		
		//now if we wanted taht the element will print in that order that we added then have to use LinkedHashSet in palce of HashSet 
		//but the time is not comst. in that case in linear
		Set <String> vegetables = new LinkedHashSet<>();
		
		vegetables.add("apple");
		vegetables.add("kiwi");
		vegetables.add("banana");
		
		vegetables.add("banana"); //now it is not added in the Set bec. banana is present already there in set so no duplicated allwowed
		
		//the dd method also returns teh boolean that the element is added in that set
		System.out.println(vegetables.add("blackberry"));
		System.out.println(vegetables.add("apple"));;
		
		
		//now on adding the elemrnts to teh Hashset there were added in a bag randomly so they were printed randomly 
		System.out.println(vegetables);
		
		
		
		//now if we wanted ij sorted format then we have to use the TreeSet
Set <String> vegetabless = new TreeSet<>();
		
		vegetabless.add("apple");
		vegetabless.add("kiwi");
		vegetabless.add("banana");
		
		vegetabless.add("banana"); //now it is not added in the Set bec. banana is present already there in set so no duplicated allwowed
		
		//the dd method also returns teh boolean that the element is added in that set
		System.out.println(vegetabless.add("blackberry"));
		System.out.println(vegetabless.add("apple"));;
		
		
		//now on adding the elemrnts to teh Hashset there were added in a bag randomly so they were printed randomly 
		System.out.println(vegetabless);
		
	}

}
