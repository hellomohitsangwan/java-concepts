package arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of rows and columns");
	int rows = sc.nextInt();
	int columns = sc.nextInt();	
	
		int a [][] = new int[rows][columns]; 
		int b [][] = new int[rows][columns];
		
//		a ans b have same no. of rows and columns
		
		System.out.println("enter array a");
//		first loop is for rows and second is for columns
	for(int i = 0;i<rows;i++)
	{
		for(int j=0;j<columns;j++) {
			a [i][j] = sc.nextInt();
		}
		System.out.println();        
	} 
	System.out.println("enter array b");
	
	for(int i = 0;i<rows;i++) 
	{
		for(int j=0;j<columns;j++)
		{
			b [i][j] = sc.nextInt();
		}
		System.out.println();
	}
	
	int c[][] = new int[rows][columns];
	
	for(int i = 0;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
			c [i][j] = a[i][j] + b[i][j];
		} 
		System.out.println();
	}
	
	System.out.println("the adn. is");
	
	for(int i = 0;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
	System.out.print(c[i][j]);
	
		}
		System.out.println();
	
	}
		
	}
	}


 