package linkedList;

public class MyLinkedList <E> {
	
	Node <E> head;
	
	public void add(E data) {    

		Node<E> toAdd = new Node<E>(data);
				
		if(head == null) {
			head = toAdd;
			return;  //the retur e here bascically say that after that return kar jayo function se that is k bhar aa jayo function se
		}
		Node<E> temp = head;
		while(temp.nextNode != null) // now this loop is running bec. we wnted the last node , and at the end of it we just put the element(data)
		{
			temp = temp.nextNode;
		}
		
		temp.nextNode = toAdd; 

	}

	void print() {
		Node <E> temp = head;
		while(temp != null) //now we are looping it till the we get the last element 
		{
			System.out.print(temp.data + " ");
			temp = temp.nextNode;
		}
	}
	
	
	
	//my stack implementation
	
	public E removeLast() throws Exception{
		Node<E> temp = head;
		if(temp == null) {
			throw new Exception("cannot remove last element from an empty stack");
		}
		
		if(temp.nextNode == null) {
			Node <E> toRemove = head;
			head = null;
			return toRemove.data;
		}
		
		while(temp.nextNode.nextNode != null) {
			temp = temp.nextNode;
		}
		Node <E> toRemove = temp.nextNode;
		temp.nextNode = null;
		
		return toRemove.data;
		
	}
	
	public E getLast() throws Exception{
		Node <E> temp = head;
		
		if(temp == null) {
			throw new Exception("cannot peek last element of an empty stack");
		}
		
		while(temp.nextNode != null) {
			temp = temp.nextNode;
		}
		return temp.data;
		
	}
	
	// or instaed of making a seperate function we can also use like seeove
	//boolean isEmpty() {
	//	return head == null;
//	}
	
	public static class Node<E> {
		public E data;
		public Node<E> nextNode;
		
		public Node(E data) {
		this.data = data;
		nextNode = null;
		}
	}

}
