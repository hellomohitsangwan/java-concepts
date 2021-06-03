package switchCase;
import java.util.Scanner;
public class SwitchCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter one no.");
		int a = sc.nextInt();
		System.out.println("enter second no.");
		int b = sc.nextInt();
		System.out.println("enter the operation");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);  //for taking the user input of the types {+ , - , / , * , etc .. . } , also char must be in single quotes always
		 int result = 0;
		 switch(operation) {
		 case '+':
			result = a + b; 
			break;
		 case '-':
			 result = a - b;
			 break;
		 case '*':
			 result = a * b;
			 break;
		 case '/':
			 result = a / b;
			 break;
		default: 
			System.out.println("please wait for the next version of calculator");
			
		 }
		System.out.println("the result is "+ result);
		
		
		
		
	}

}
