package practice;
import java.util.*;
public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = x > y ? x: y;
		int b = y < x ? y : x;
		
		int r = b;
		
		while(a%b != 0) {
			r = a%b;
			a = b;
			b = r;
		}
		System.out.println(r);
		
	}

}
