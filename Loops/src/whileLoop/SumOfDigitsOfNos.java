package whileLoop;
import java.util.Scanner;
public class SumOfDigitsOfNos {

	public static void main(String[] args) {
		  Scanner sc= new Scanner(System.in);
		  int n = sc.nextInt();
		  int temp = n;
		  int sum = 0;
       while(temp>0) 
//       now we can find last digit of any no. by using % operator (it gives the quotient) and for finding the the tens digit
//       we can divide the no. by 10 so it gives gives it gives floor value(eg. = 454/10 = 45.4 = 45, 45%10 = 5)
//in this way we can find the other place digts too nand after that we can the sum of digits by using while loop .in this 
//    	   case we dont know the no. of digits so we cant use use for loop we use while loop      
       {
    	   
    	   int lastdigit = temp%10;
    	   temp /= 10;
    	sum += lastdigit;  
    	System.out.println(lastdigit+" "+temp + " "+sum);
    	   
       } System.out.println("the sum of digits is" + "="+sum );
	}

}
