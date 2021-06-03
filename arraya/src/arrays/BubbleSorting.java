package arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		int [] a = {2,1,8,-3,6,4,12};
		int n = a.length;
		
    for(int i = 0;i<n-1;i++) 
    {
    	boolean sorted = true;
    	
    	 for(int j = 0;j<n-1;j++) {
    		 if(a[j+1] <a[j]) {
    			 int temp = a[j+1] ;
    			 a[j+1] = a[j];
    			 a[j] = temp; 
    			 sorted = false;
// afar hamne ek baar bhi sort laga dia to iska matlb he k vo array sorted nhi he, to sorted barabar false ho gaya 
// aur loop aage chalta jayega
    		 }
    	 } 
    	 if(sorted) break;
//    	 break lagane k baad vo us pure loop se bhar aa jata he
    }  
    
 for(int item : a)
 {
	 System.out.print(item+" ");
	
	
 }


 
 
 
 
 

 
 
 
 
 
	}
	
//	public String bubbleSort(int a[]) {
//		int loa = a.length;
//		int lCount = a.length - 1;
//		for (int i = 0 ;i<lCount; i++) {
//			
//			boolean sorted = true;
//			
//			for (int j =0 ; j<a.length-i ; j++) {
//				if(a[j+1] > a[j]) {
//					int temp = a[j];  //swapping
//					a[j] = a[j+1];
//					a[j+1] = temp;
//					
//					sorted = false;
//				}
//				
//			}
//			
//			if(sorted) break;
//		}
//		for(int sortedArray : a) {
//			return (sortedArray + " ");
//		}
//		
//	}

}





