package recurssion;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(4));
		System.out.println(power(3 , 32) + "steps = " +count);
		System.out.println(fastPow(3 , 32) + "seps = " + fastSC);
		System.err.println(paths(3 ,3));
		System.out.println(fact(6));
	}
	
	static int count = 0;
	static int fastSC = 0;
public static int sum(int n) {
	if(n == 1) {
		return 1;
	}
	else {
		return n + sum(n - 1);
	}
}

public static int power(int a , int b) {
	count++;
	if (b == 0) {
		return 1;
	}
	else {
		return power(a , b -1) * a;
	}
}
public static int fastPow(int a , int b) {
	fastSC++;
	if(b == 0) {
		return 1;
	}
	else if(b % 2 == 0) {
		return fastPow(a*a , b/2);
	}
	else {
		return a*fastPow(a*a , b/2);
	}
}
public static int paths(int m , int n) {
	if(m == 1 || n == 1) return 1;
	else return paths(m -1 , n) + paths(m , n - 1);
	
}
public static int fact(int n) {
	if(n == 1) {
		return 1;
	} else {
		return fact(n-1)*n;
	}
}
}
