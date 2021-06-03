package whileLoop;
import java.util.Scanner;
public class MathClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int noofdigits = (int)Math.log10(n) + 1;
//		we can find no of digits in any digit by the formula (log base 10 + 1)
//		Math.log(10) is math class
		
System.out.println(noofdigits);
	}

}
