package practice;
import java.util.Scanner;
public class FibonaciSeries {
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int n1=0 ,n2=1 ,i , n3;
		
		System.out.print(n1 + " " + n2 + " ");
		
		for (int j = 2; j < count; j++) {
			 n3 = n1 + n2;
			 System.out.print(n3 + " ");
			 n1 = n2;
			 n2 = n3;
		}
		
	}
}
