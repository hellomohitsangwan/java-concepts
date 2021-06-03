//ques = remove all duplicates from an arrray

package practice;
     public class Ques2 {

	public static void main(String[] args) {
		int array [] = {2,2,2,2,3,3,4,4,5,5,5,};
//		
		int temp [] = new int[array.length];
		int j = 0;
		for(int i = 0; i<array.length - 1; i++)
		{
			if(array[i] != array[i+1]){
				temp[j] = array[i];
		j++;
			}
		} temp[j] = array[array.length-1];
			   for(int i = 0; i< j+1;i++){
		    	System.out.print(" "+temp[i]);
		    }
		   System.out.println();
	   int n = j+1;
		System.out.println("the total no. of duplicate elements in array is" +"  "+ n);	
	}

}
	
	 