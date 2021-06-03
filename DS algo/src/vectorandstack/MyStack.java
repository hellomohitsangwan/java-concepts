package vectorandstack;

import linkedList.MyLinkedList;

public class MyStack  <E>{
 private MyLinkedList <E> ll = new MyLinkedList();
 
 void push(E e) {
	 ll.add(e);
 }
 E pop() throws Exception {
	 if(ll == null) {
		 throw new Exception("popping from empty stack is not permissible");
	 }
	return ll.removeLast();
 }
 E peek() throws Exception {
	 if (ll == null) {
		throw new Exception("stack is empty!");
	}
	 return ll.getLast();
 }
 
}
