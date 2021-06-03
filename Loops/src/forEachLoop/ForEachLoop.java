package forEachLoop;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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