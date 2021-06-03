package quene;

public class MyClassTest {

	public static void main(String[] args) {
		
		MyQuene <Integer> mq = new MyQuene();
		mq.enquene(12);
		mq.enquene(15);
		mq.enquene(10);

		System.out.println(mq.dquene());
		System.out.println(mq.dquene());
		System.out.println(mq.dquene());
		System.out.println(mq.dquene());
	}

}
