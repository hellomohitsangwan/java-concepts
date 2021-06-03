package forLoopPatterns;
import java.util.Scanner;
public class Psttern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int j = 1; j<=n; j++) {
			
			for(int i = 1; i<=j - 1; i++)
//in every loop there re  2(j-1) blanks so we have to print 2(j-1) blank in everyy row i.e. we have to every row to 
//2(j-1).now instead of 2(j-1) times we can print (j-1) and sysout 2 blanks
			{
				System.out.print("  ");
			} 
			for(int i = 1; i<=n - j + 1; i ++ )
//now we use the "i" again as we are out of the previous loop. now on every row there re n-j-1 stars after the blanks 
//so we take the loop to n-j-1  times.and also we cant use "ln"in sysout command as we wanted to print the stars 
//in the same line 		
              {
				System.out.print("* ");
			}
			System.out.println();
//			here we use ln to make because we have to make new row or just change the line
			
		}

	}

}
