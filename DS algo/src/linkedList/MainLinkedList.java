package linkedList;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		
		List <Integer> ll = new LinkedList<>();
		List <Integer> al = new ArrayList<>();
		
		ll.add(12);
		ll.add(16);
		ll.add(85);
		
	//	System.out.print(ll + " " + ll.get(1));  //all the sam efunctions of arraylist are there in linkedList

		getTimeDiff(ll);
		getTimeDiff(al);
		
	}
	
	
	static void getTimeDiff(List <Integer> list) {
		long start = System.currentTimeMillis();
		//this is  the time for for adding one element aty the 0th posn or any middle posn.
		//but we add the eklement in the last posn. then arraylist took lesser time than linkedList
		for(int i = 0 ; i < 100000 ; i++) {
			list.add(0 , i);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName() + " time  " + (end - start));
		
	}

}
