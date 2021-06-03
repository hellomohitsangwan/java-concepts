package methods;

public class Methods {

	public static void main(String[] args) {
		int firstno = 22;		
        int secondno = 56;  
        
        int result = maxOf(firstno,secondno);
       System.out.println(result);
        
        int b = maxOf(400,300);
         System.out.println(b);
//         ye vala pehla method he 
         maxOf(3);
//       ye vala dursa method he jisme sirf ek int value tore huii thii
         
         sayHi();
         sayHi();
//        ye vala thira metho he "sayHi" 
          
//  you can create as many as no. the method can execute them.matlab hame bar 
//         bar repeat nhi karna padega. 
	}
	static int maxOf(int a, int b) {
//		syntax = "public static int methodName(int a,int b)  {  
//		body
//		       }"
//	 "maxOf" method ka naam he
//		hamme return com[pulsary kuch lagana he hota he nhi to compile time error aa jati he,ya phir phir agar ham void type methpod
//	                  banayege to hamme return nhi lagana kyounki vo koi value return nhi krta
//	                		  return likhne k baad kuch execute nhi hota he
//		
//		if(a>b) {
//			 return a;
//		 } else {
//			 return b;
//		 } 
//		 or
		return a>b?a:b;
//	 output aaye a>b agar a>b he nhi to b aaye
			}
	static void maxOf(int a) {
//		this is call method overloading.matlb same naam k do method ho sakte he same class me lekin uski 
//		input value alag honi chaiye je agar phle vale me int he to dusre me 1  int kr dena ya phi dure me 
//		float value kr sakte he 
		System.out.println(a);
		  
	}
	static void sayHi(){
//		ye sayHi method kuch return nhi krega iska kaam kuch line execute krna he kyunku is ke void laga hua he. 
		System.out.println("hii");
    System.out.println("study for JEE more");
	}

}
