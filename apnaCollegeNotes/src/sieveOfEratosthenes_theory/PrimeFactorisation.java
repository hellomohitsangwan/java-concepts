package sieveOfEratosthenes_theory;

public class PrimeFactorisation {

	public static void main(String[] args) {
		primeFactors(12);
	}
	
	static void primeFactors(int n) {
		int spf[] = new int[1000];    //spf = smallest prime factor
		
		for(int i = 0 ; i < spf.length ; i++) {
			spf[i] = i;
		}
		
		for(int i = 2; i <= n ; i++) {
			if(spf[i] == i) // it is untouched
			{
				for(int j = i*i ; j <= n ; j += i) {
					if(spf[j] == j) //it is not changed by any previous i
					{
						spf[j] = i;
					}
				}
			}
		}
		while(n != 1) {
			System.out.println(spf[n]);
			n /= spf[n];
		}
	}
}
