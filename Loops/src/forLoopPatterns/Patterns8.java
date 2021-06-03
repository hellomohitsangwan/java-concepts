package forLoopPatterns;

import java.util.Scanner;

public class Patterns8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("*");

		for(int i = 2; i<=n-1; i++)
//			now after printing the star there are toal "n-1" rows so the loop will go till n-1 rows.now in this loop
//			after the first star have been printed every row has star at 1st posn. and after that it have "i-2" blanks and after 
//			that there is a star so there were 2 loops in the row loop
		{
			System.out.print("* ");
			for(int j = 1; j<=i-2; j++) 
			{
				System.out.print("  "); 
				}
			
			System.out.print("* ");
			System.out.println();
		} if(n>1) 
//		now if run teh program w/o using "iF" then at 1 teh program will show 2 stars,now to stop this we ahveapply a if 
//		statement in last loop
		{
		 for(int i = 1; i<=n; i++)
//		 now in the last row there are tota "n" stars so the loop will till n
		 {
				System.out.print("* ");
		 }
		  }

		
	}

}
