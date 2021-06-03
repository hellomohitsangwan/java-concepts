package ternaryOperators;

public class TernaryOperators {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int maxofbothno = 0;
//		if(b > a) {
//			maxofbothno = b;
//			System.out.println(maxofbothno);
//		} else { 
//			 maxofbothno = a;
//				System.out.println(maxofbothno);
//		}
		maxofbothno = b > a ? b : a;
		
		System.out.println(maxofbothno);
	}

}
