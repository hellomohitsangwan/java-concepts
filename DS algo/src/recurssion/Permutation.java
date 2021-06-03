package recurssion;
import java.util.*;
public class Permutation {
	
	static Set<String>  set = new HashSet<>();

	public static void main(String[] args) {
		
		perm("abc" , 0 , 2);

	}
	
	public static void perm(String s , int l , int r) {
		if(l == r) {
			if(set.contains(s)) {
				return;
			}
				set.add(s);
			System.out.println(s);
			return;
			
		}
		for(int  i = l; i <= r; i++) {
			s = swap(s , l , i);
			perm(s , l + 1 , r);
			
			s = swap(s , l , i);  //we are doing it because don't want the string in reduced form,this is called backtracking
			
		}
	}
	public static String swap(String s , int l , int r) {
		 char a[] = s.toCharArray();
		 char temp = a[l];
		 a[l] = a[r];
		 a[r] = temp;
		 
		 return String.valueOf(a);  //converts the array of characters to String
		 
	}

}
