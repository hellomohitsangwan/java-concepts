package forLoops;
import java.util. Scanner;
public class Exponent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x");
		int x = sc.nextInt();
		System.out.println("enter y");
		int y = sc.nextInt();
		int r = 1;
		for(int i = 0; i < y; i++) {
			r = r*x;
		
		}
             System.out.println(r);
	}

}
