package arrays;

import java.util.Scanner;

public class AverageOfMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of students");
		int n = sc.nextInt();
		int [] marks = new int[n];
		System.out.println("enter their marks now");
		for(int i = 0; i<n; i++ ) 
		{
		marks [i] = sc.nextInt();
		}
//
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += marks[i];
		}
		n = sum/n;
		System.out.println(n);

	}
	
	
//	static int average(int noOfStudents , int []marksArray) {
//	 int sum = 0;
//	 for (int i = 0 ; i<marksArray.length ; i++) {
//		 sum += marksArray[i];
//	 }
//	 return sum/noOfStudents;
//	}
	
	
}