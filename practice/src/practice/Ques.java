package practice;
import java.util.Scanner;
import java.util.Scanner;

public class Ques {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the line");
		String line = sc.nextLine();
		System.out.println(recursiveReverseString(line));
}
	
	static String recursiveReverseString(String line) {
		
		int i = line.length() -1;
		String result = "";
		while(i>=0) {
			
	  while(i>=0 && line.charAt(i) == ' ') i--;
			int j = i;
	  if(i<0) {
		  break;
	  }
	  while(i>=0 && line.charAt(i) != ' ') i--;
	  if(result.isEmpty()) {
		  result = result.concat(line.substring(i+1, j+1));
	  }
	  else {
		  result = result.concat(" " + line.substring(i+1 , j+1));
		}
		}
		return result;
	}

}
