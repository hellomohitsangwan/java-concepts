package impPractice;
import java.util.*;
public class countPalindromicSubstrigs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		boolean [][] dp = new boolean [s.length()][s.length()];
		int count = 0;
		//i = raw
		//j = column
		//g = gap
		for(int g = 0;g < s.length() ; g++) {
			for(int i =0 , j = g; j < s.length() ; i++ , j++) {
				if(g == 0) {
					//only one charavter and it is always a palindrome
					dp[i][j] = true;
				}
				else if(g == 1) {
					if(s.charAt(i) == s.charAt(j)) {
						dp[i][j] = true;
					}else {
						dp[i][j] = false;
					}
				}
				else {
					if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]) {
						dp[i][j] = true;
					}
					else {
						dp[i][j] = false;
					}
				}
				if(dp[i][j]) {
					count++;
				}
			}
		}
          System.out.println(count);
	}

}
