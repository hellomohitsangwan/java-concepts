package forLoops;
import java.util.Scanner;
public class SpecialSeriesLikeLog {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		float result = 0;
		for(float i=1; i<=n; i++) {
//		result += 1/i;}
//		System.out.println(result); 
			if(i%2 == 0) {
			result = result-1/i;
			} 
			else { result = result + 1/i;
			} 
			}
		System.out.println(result);
			}
			
		}


