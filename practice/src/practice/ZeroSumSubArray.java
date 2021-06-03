package practice;
import java.util.*;
public class ZeroSumSubArray {

	public static void main(String[] args) {
		
		int a[] = {3 ,4 , 1 ,3 ,3 ,-6 ,-7 ,2};
		int k = -4;
		//M1 = brute force approach
		boolean found =false;
//		for (int i = 0; i < a.length; i++) {
//		  int sum = 0;
//		  for (int j = i; j < a.length; j++) {
//			sum += a[j];
//			if(sum == 0) {
//				found = true;
//				System.out.println("subarray with 0 sum found");
//				break;
//			}
//		}
//		  if(found) break;
//		}
		

		
//		M2 = using hash map
		Set <Integer> set = new HashSet<>();
		int sum = 0;
	    for (int i = 0; i < a.length; i++) {
			set.add(sum);
			sum += a[i];
			if(set.contains(sum)) {
				System.out.println("subarray found");
				break;
			}
		}
	    
//	    if the given to an integer k
//		Set <Integer> set = new HashSet<>();
//		int sum = 0;
//	    for (int i = 0; i < a.length; i++) {
//			set.add(sum);
//			sum += a[i];
//			if(set.contains(sum - k)) {
//				System.out.println("subarray found");
//				break;
//			}
//		}
		
	}

}
