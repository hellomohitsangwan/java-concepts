package tryAndCatch;

import java.util.Arrays;

public class More {

	public static void main(String[] args) {
		
int [] array = new int[3];
		
		try {
		for(int i= 0; i<4; i++) {
		 array[i] = i;
			
			
		} }
		catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("it catched ytge error");
			
			
		}
		catch(Exception e) {
			System.out.println("error detected and the error is " + e);
		}
		
		
		//whenever there are more than 1 catch then the catch which one have really excption wikll be called
		
		System.out.println(Arrays.toString(array));

	}

}

		
	

