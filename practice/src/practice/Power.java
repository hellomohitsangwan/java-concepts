package practice;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter base");
		int base = sc.nextInt();
		
		System.out.println("enter power");
		int power = sc.nextInt();
		
		int answer = recursivPower(base , power);
		System.out.println(answer);
	}
	static int recursivPower(int base ,  int power) {
		int answer =1;
		for(int i =1 ; i<= power; i++) {
			answer = answer*base;
		}
		
		return answer;
	}

}
