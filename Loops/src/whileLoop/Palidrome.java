package whileLoop;
import  java.util.Scanner;
public class Palidrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int result = 0;
//		ham n k sath ched chad kr sakte he par temp k sath nhi kyunki temp me n stored he :(
		while(n !=0) 
	 {
			int lastdigit = n % 10;  //ye hame remaninder dega
		
			result = result * 10 + lastdigit;  //ye aage digits banata jayega
			
			n /= 10; //ye orignal digit ka last digit hata dega 
		} 
		
		
if(temp == result) {
	System.out.println("palindrone");
} else {
	System.out.println("not a palindrone");
}
		

		
	}

}
