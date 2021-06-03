package priorityQueness;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue <String> pq  = new PriorityQueue<>();
		
		pq.add("kiwi");
		pq.add("apple");
		pq.add("mango");
		pq.add("banana");
		
		System.out.println(pq);  //mow insisde a priorityQuene teh elements can beadded in any way 
		
		//now here the priority is defined in dictionary order
		System.out.println(pq.remove()); //the element remove frm priorityQuene whith have the highest priority,the prioority is defined earlierly in head (study during syudiying comparators, etc)
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		PriorityQueue <Integer> pqq = new PriorityQueue<>();
		 pqq.add(1);
		 pqq.add(10);
		 pqq.add(5);
		 pqq.add(2);
		 
		 System.out.println(pqq);
		System.out.println(pqq.remove());   //sbse phle vo bahar niklegaa jiski priorty sbbse high hogi(in this case theuir priority is the order of sorted)
		System.out.println(pqq.remove());
		System.out.println(pqq.remove());
		System.out.println(pqq.remove());
	}

}
