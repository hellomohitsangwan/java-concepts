package forLoopPatterns; 
import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	
	//method=1 
	
	for(int i=1; i<=n; i++)
	{
		for(int j = 1; j <= n - i + 1; j++)
//			in every row there are n-i+1 stars so we take the loop yo n - i+1  times
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	
	
	//method=2
	
	for(int i = n; i>0; i--) {
		for(int j = i; j>0 ; j-- ) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	
	
	}

}
