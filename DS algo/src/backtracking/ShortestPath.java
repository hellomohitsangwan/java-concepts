package backtracking;

public class ShortestPath {

	public static void main(String[] args) {
		
		int a [][] = {
				{1 , 1, 1, 1, 1,0,0,1,1,1},
				{1 , 1, 0, 1, 1,011,1,0,0},
				{1 , 0, 1, 1, 1,0,1,1,1,1},
				{0 , 1, 1, 0, 1,1,0,1,1,1},
				{1 , 0, 1, 0, 1,1,0,1,1,0},
				{0 , 1, 1, 1, 1,0,0,1,0,1},
		};
		
		int result = shortestPath(a , 0 , 0  , 0  , 4);
		System.out.println(result);

	}
	
	public static int shortestPath(int a[][] , int i , int j , int x , int y) {
		int rows = a.length;
		int column = a[0].length;
		
		boolean [][] visited = new boolean [rows][column];
		
		return shortestPath(a , i , j , x , y, visited);
	}
	
	static boolean isValid(int a[][] , int i , int j , boolean isVisited[][]) {
		int rows = a.length;
		int column = a[0].length;
		
		return (i >= 0 && j >= 0 && i < rows && j < column && a[i][j] == 1 && !isVisited[i][j]);
		
	}
	public static int shortestPath(int a[][] , int i , int j , int x, int y , boolean[][] visited) {
		if(!isValid(a , i , j , visited)){
			return 100000;
		}
		
		if(i == x && j == y) {
			return 0;
		}
		
		visited[i][j] = true;
		
		int left = shortestPath(a , i - 1 , j , x ,  y , visited) + 1;
		int right = shortestPath(a , i + 1 , j , x ,  y , visited) + 1;
		int top = shortestPath(a , i , j - 1 , x ,  y , visited) + 1;
		int bottom = shortestPath(a , i , j + 1 , x ,  y , visited) + 1;
		
		//this makes backtracking possible,we re makinh them false that if in case we are not able to  find the desired path tghen we wil move back
		visited[i][j] = false;
		
		return(Math.min(Math.min(left , right) , Math.min(top , bottom)));
		
		
	}

}
