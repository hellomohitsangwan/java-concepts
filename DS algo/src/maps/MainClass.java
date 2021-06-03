package maps;
import java.util.*;
import java.util.Map.Entry; //bec. it is a inner class
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <String , Integer> numbers = new HashMap<>();
		    //<Key type , value type>
		
		numbers.put("one" , 1);
		numbers.put("two" , 2);
		numbers.put("three" , 3);
		numbers.put("four", 4);
		
		numbers.put("" , 4);  //null key is also supported
		
		numbers.put("one" , 5); //ye chec krega k one k corresponding koi value hai agarf hai to use change/update krdo
		
		numbers.putIfAbsent("two" , 6); // ye check krega k two hai key me agar usse nhi mila to he add hoga nhi to kush nhii hoga
		
		numbers.remove("three"); // ye us kry kcortresonding vale chsnge kr et haii
		
		numbers.remove("two" , 2); // agart us key corresponding jo value dlai hai func. me to he remove hoga , nhi to nhi hoga
		
		numbers.replace("four" , 4 , 5);  //agar usse us key k corrspondig jo vbalue dali hai vo mil jati hai to vo usse nyii input value se replace kr deta haii
		
		System.out.println(numbers);
		System.out.println(numbers.get("one"));
		System.out.println(numbers.get("xyg")); // afgat uss evo key nhhi mhili to hame null return krega
		
		System.out.println(numbers.containsKey("three"));  //return boolean whether the key is present or not   
		
		System.out.println(numbers.containsValue(3));  //return boolean whether the valuea is present or not 

		System.out.println(numbers.keySet());  //sari k sarikeys ko set me dalke return kr deta hai
		System.out.println(numbers.values());  //sari k sari values ko entries me dalke return kr det haii
		System.out.println(numbers.entrySet());  //pura set return kr deta hai
		
		
		Set<Entry<String , Integer>> entries = numbers.entrySet();
		
		for(Entry<String , Integer> entry : entries) {
			entry.setValue(entry.getValue() * 100);
		}

		System.out.println(numbers);
		
		
		
		System.out.println(getHash("TOM"));
		
	}
	
	//making a hash function thst rturn the ascii value for a string
	public static int getHash(String s) {
		int hash = 0;
		for(int i = 0; i < s.length() ; i++) {
			hash += s.charAt(i);  //give the ascii value of each character and storing and adding each value in hash variable
		}
		return hash;
	}

}
