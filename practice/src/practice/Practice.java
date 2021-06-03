    //ques+. = print n names in string and find the largest name/word?

package practice;
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how words you want to compare");
		int n = sc.nextInt();
		String maxno = "";
		if(n>0) {
			for(int i = 0;i<=n; i++) {
				String result = sc.nextLine();  
				if(maxno.length() < result.length()) {
					maxno= result;
				} 
			}
			
			
			
		}System.out.println("the longest name is "+ maxno);

	}

}
