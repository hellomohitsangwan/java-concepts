package hashmap;
import java.util.*;
public class Hashmp {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("father","manoj");
		map.put("son","mohit,monu");
		 map.remove("son");
		
		System.out.println(map.get("father"));
		System.out.println(map.get("son"));
		System.out.println(map.size());
		
		System.out.println(map.toString());
		
		
	}

}
