package lists;

public class GenericEx {

	public static void main(String[] args) {
		
		Pair <String  , Integer> p1 = new Pair("t-shirt"  , 32);
		Pair <Boolean , Integer> p2 = new Pair(true , 64);
		

		p1.getDescription();
		p2.getDescription();
		
	}

}
