package forLoopPatterns;
import java.util.Scanner;
public class Pttern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int	j=1; j<=n; j++) {
			for(int i = 1; i<=j; i++) 
//			now in the pattern  if we observe then we can find that the no. of stars in every row is equal to that row 
//			for eg. in 4 row there are 4 stars.so we the second loop will start fom 1 and print the stars = that no. of rows i.e.
//			it end at j(no of rows)
			{
				System.out.print("* ");
			} System.out.println();
		}
		
	}

}
