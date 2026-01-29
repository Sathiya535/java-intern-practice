class PrimeSieve {
    public static void main(String[] args) {
        int limit = 1000;
        boolean[] isPrime = new boolean[limit + 1];

        // Assume all numbers are prime
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        // Sieve logic
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Print primes
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}