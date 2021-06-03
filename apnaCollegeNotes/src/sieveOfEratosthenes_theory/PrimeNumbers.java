//learned from apna college video

package sieveOfEratosthenes_theory;

public class PrimeNumbers {

	public static void main(String[] args) {

		primeSeive(100);

	}
	
	static void primeSeive(int n) {
		boolean isPrime[] = new boolean[1000];
		for(int i = 0 ; i < isPrime.length ; i++) {
			isPrime[i] = true;
		}
		
		for(int i = 2 ; i <= n ; i++) {
			if(isPrime[i] == true) {
				for(int j = i*i ; j <= n ; j += i) {
					isPrime[j] = false;
				}
			}
		}
		
		for(int i = 2 ; i <= n ; i++) {
			if(isPrime[i] == true) {
				System.out.println(i);
			}
		}
	}

}
