package arrays;

public class Arrays2 extends Arrays {

	public static void main(String[] args) {
		int [] age = {1,2,8,9};
//		we can write array class like this also.in this method we have to assingn the value of every array. this is a short form 
//		o writing a array and assingning them value
		for(int i=0; i<age.length; i++)
		{		
		 System.out.println(age[i]);
		}
		
		
		
		//java for and for-each loop comprisions		
		String names = "Mohit";
		String namesSplit [] = names.split("h");
		
//		the below 2 loops are are but the first is for-each loop and the another is for loop 
		for( String ns : namesSplit ) {  //for - each loop
			System.out.println(ns);
		}
		
		for (int i =0 ; i< namesSplit.length ; i++) { // for loop
			String ns = namesSplit[i];
			System.out.println(ns);
		}
	}

}
