package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int a []  = {3,1,-2,7,4,0}; 
		int n = a.length;
//		a.length gives no of elements is array
       for(int i=0; i<n; i++) {
    	   int minindex = i;
//here we are choosing a minindex variable = i just to take the element  of the array array with it another element
//     the second loop will start from i as in every row we have to compare the value of first with second 
//     for eg. at first the the first element is compared with other and in next turn the 2nd element is compared with 
//     other left element i.e.total i element left for comparison
    	   for(int j = i; j<n; j++) {
    		   if(a[j] < a[minindex]) {
    			   minindex = j;

    		   }
			   
    		} 
    	   int temp = a[i];
    		a[i] = a[minindex];
    		a[minindex] = temp;    				
       } 
       for(int e:a) {
    	   System.out.print(e+"  ");
       }
	}

}
