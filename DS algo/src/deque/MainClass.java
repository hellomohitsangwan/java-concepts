package deque;
import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque <Integer> ad = new ArrayDeque<>();
		
		ad.addFirst(12);
		ad.addFirst(24);
		ad.addFirst(48);
		ad.addFirst(64);
		ad.addFirst(88);
		
		//ad.pop();   //this pop() func. comes from quene as it implements the quene or the in it called as removeLast()
		
		System.out.println(ad.pop());
		
	}

}
