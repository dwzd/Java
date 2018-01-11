package myPack;

public class FindPrimes {
	//When true, which is prime, false means not.
		public boolean isPrime(int n) {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
		
		//to find all primes between int number a to int number b.
		public void findAllPrimes (int a, int b) {
			for (int i=a; i<=b; i++) {
				if(this.isPrime(i)) {
					System.out.println(i);
				}
			}
		}

}
