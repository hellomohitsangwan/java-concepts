package quene;

import linkedList.MyLinkedList.Node;

public class MyQuene <E> {
	
    private Node<E> head, rear;

    public void enquene (E e ) {  //just like push in linkedList
    	Node <E>  toAdd = new Node(e);
    	
    	if(head == null) {
    		head = rear = toAdd;
    	}
    	rear.nextNode = toAdd;
    	rear = rear.nextNode;
    }
    
    public E dquene() {  //just like pop in linkedList
    	if(head == null) {
    		return null;
    	}
    	Node <E> temp = head;
    	head = head.nextNode;
    	if(head == null) {
    		rear = null;
    	}
    	return temp.data;
    }
}
