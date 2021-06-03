package methods;

public class PasssByVALUE {

	public static void main(String[] args) {
		int c = 22;
		int d = 44;
		swap(c,d);
		System.out.println(c +"  "+d);
//now it show orignal value of c and d as it is pass by value
		
		
		
		Dog d1 = new Dog();
		d1.legs = 4;
		Dog d2 = new Dog();
		d2.legs = 6;
		
		swap(d1 , d2);
		System.out.println(d1.legs + " " + d2.legs);
		
		 changeDogLength(d2);
		 System.out.println(d2.legs);
	}
	
	
    static void swap(int a,int b) {
    	int temp = a;
    	a = b;
    	b = temp;
//    	System.out.println(a+ "  "+ b);
    }
    
//  class is non primitive data type
    static void swap(Dog a , Dog b) {
    	Dog temp = a;
    	a=b;
    	b=temp;
    	
    }
    static void changeDogLength(Dog a) {
    	a.legs = 8;
    }
       
}

class  Dog {
	int legs;
}