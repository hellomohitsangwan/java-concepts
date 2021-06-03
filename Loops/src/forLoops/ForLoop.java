package forLoops;
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.print("enter no "  );
	int no = sc.nextInt();
	int a = 0;
	int b = 1;
	for(int i=0; i<=no - 2; i++) {
		int c = a + b;
		System.out.print(a + " " +c+  "  ");
		a = b;
		b = c;
	}
	}

}
