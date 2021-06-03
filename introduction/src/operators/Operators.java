package operators;
import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x <= 10)
		{System.out.println("teh no is less thana or equal to 10");
		} else if(x > 10 && x <= 20) {
			System.out.println("the no. is betweeen 10 and 20");
		} else if(x > 20 && x <=30) { 
			System.out.println("tehe no. is between 20 an 30");
		} else {
			System.out.println("the no is greater than 30");
		}
		
		
	}

}
