package vectorandstack;

public class MyStackTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
MyStack <Integer> ms = new MyStack();

ms.push(24);
ms.push(48);
ms.push(96);

System.out.println(ms.peek());
int popped = ms.pop();
System.out.println(popped);
System.out.println(ms.peek());
	}

}
