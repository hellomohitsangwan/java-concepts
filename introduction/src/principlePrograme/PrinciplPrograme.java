package principlePrograme;
import java.util.Scanner;
public class PrinciplPrograme {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int principle = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		float simpleintrest = principle*rate*time/100;
		System.out.println("the simple intrest is=" +simpleintrest);

	}

}
