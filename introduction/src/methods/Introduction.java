package methods;

public class Introduction {

	public static void main(String[] args) {
	line();
		int result = maxno(20 , 40);
	 System.out.println(result);
		int b = 4;
	method1(b);
	}
//	ye ham class k andar methpd/function create kr re he
//	hm kitne me function/method create kr skte hai class k andar
  static void method1(int a) {    //static function k andarr sirf static func. he call hoote hai,thatas why we are making it static so that we can call it inside our main method
	  System.out.println(a);
  }
	static int maxno(int a , int b) {
		return a>b?a:b;
	}
	static void line() {
		System.out.println("hey its just an practice");
	}
}
