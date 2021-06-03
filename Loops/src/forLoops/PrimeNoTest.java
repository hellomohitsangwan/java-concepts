package forLoops;
import java.util.Scanner;
public class PrimeNoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean result = true;
		
		
		for(int i=2; i<n; i++) {
			if(n % i == 0) {
				result = false;
				break;
			}
			
		}
		if(n < 2) {
			result = false;
		}
		System.out.println("is prime"   +   result);
		

	}

}
