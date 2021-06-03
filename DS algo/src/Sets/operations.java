package Sets;
import java.util.*;

public class operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <Integer> x = new HashSet<>();
		
		x.add(23);
		x.add(1);
		x.add(6);
		
		Set <Integer> y = new HashSet<>();
		
		y.add(3);
		y.add(1);
		y.add(16);		
//		
		Set <Integer> z = new HashSet<>();
		z.add(6);
		
		System.out.println(x.containsAll(z));  //ye hame boolean return krta hai aur batta hai ye z subset hai x ka
		
		
//		x.addAll(y);  //no repetitve elements were added in set
//		System.out.println(x);

		x.retainAll(y);  //ye dono ka intersection lene me kaam aata hai (x me se mo sare hata do jp y me nhii haii)
		System.out.println(x);
	}

}
