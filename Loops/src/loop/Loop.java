package loop;

public class Loop {

	public static void main(String[] args) {
		int sum = 0;
		int n = 5;
		
		for(int i = 1; i < n; i = i++) {
			sum = sum + i;
		System.out.println(sum);
		}
	}

}
