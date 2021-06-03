package tryAndCatch;

import java.util.Arrays;

public class TryAndCatch {

	public static void main(String[] args) {
		
		int [] array = new int[3];
		
		try {
		for(int i= 0; i<4; i++) {
		 array[i] = i;
			
			
		} }
		
		catch(Exception e) {
			System.out.println("error detected and the error is " + e);
		}
		
		System.out.println(Arrays.toString(array));

	}

}
