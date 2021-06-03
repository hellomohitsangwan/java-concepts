package practice;
import java.util.Scanner;
public class BasicPractice {

	public static void main(String[] args) 
	{
		
//		Scanner sc = new Scanner(System.in);
//		int no = sc.nextInt();
//		
//		int temp = no;
//		
		
		
		//          palindrome
		
//		int reversedNo = 0;
//		while (no != 0) {
//			int remainder = no%10;
//			reversedNo = reversedNo*10 + remainder;
//			no /= 10;
//			
//		}
//		if (reversedNo == temp) {
//			System.out.println("palindrome" + reversedNo);
//		} else {
//			System.out.println("not palindrome" + reversedNo);
//		}
		
		
		
		//           sum of digits
		
//		int sum = 0;
//		while (no != 0) {
//			int remainder = no % 10;
//			no /= 10;
//			sum += remainder;
//		}
//		System.out.println(sum);
//			
		
		
		//       tables
		
//		for(int i = 1; i<20; i++) {
//			System.out.println(i);
//			for(int j=1; j<10; j++) {
//				System.out.print(i*j + " ");
//			}
//		}
		
		
		
		
		//anagram
		
		String first  = "aab";
		String second = "abc";
		
	for(char c : first.toCharArray()) {
		int index = (int) c;
		
		System.out.println(index);
	}
		
//		boolean isAnagram = false;
//		boolean visited[] = new boolean[second.length()];
//		
//		
//		if (first.length() == second.length()) {
//			
//			for(int i = 0 ; i<first.length() ; i++) {
//				char c = first.charAt(i);
//				
//				for(int j = 0; j<second.length() ; j++) {
//				if (c == second.charAt(j) && !visited[j]) {
//					isAnagram = true;
//					visited[j] = true;
//					break;
//				  }	
//				
//				}
//				
//				if (!isAnagram) {
//					break;
//				}
//			}
//			
//
//			
//		}
//		
//		if (isAnagram) {
//			System.out.println("anagram");
//		}
//		else {
//			System.out.println("not an anagram");
//		}
		
		}
	
	}


