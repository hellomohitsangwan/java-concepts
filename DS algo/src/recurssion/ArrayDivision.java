
//divide an array as a sum toarray (half-half sum)eg:-
//[2 , 5 , 8 , 2 ,1] = [5 , 2 , 2] + [ 8, 1]


package recurssion;
import java.util.*;
public class ArrayDivision {

	public static void main(String[] args) {
		
		ArrayList <Integer> al = new ArrayList<>();
		int a[] = {2 , 5 ,  8 ,2 , 1};
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		boolean isPossible = sum % 2 == 0 && isPartition(a , sum/2 , 0 , al);
		
		if(isPossible) {
			for(int e : al) {
				System.out.println(e + " ");
			} 
		}
		else {
			System.out.print("not possible!");
		}
		
	}
	
	static boolean isPartition(int a[] , int sum , int i , ArrayList<Integer> al) {
		
		if(i >= a.length || sum < 0) {
			return false;
		}
		if(sum == 0) return true;
		
		al.add(a[i]);
		boolean leftPossible = isPartition(a , sum - a[i] , i+1 , al);
		
		if (leftPossible) return true;
		
		//the below 2 lines are only backtracking,that if !leftPossible then we make fill the right arraylist
		al.remove(al.size() - 1);
		return isPartition(a , sum , i + 1 , al);
		
	}

}
