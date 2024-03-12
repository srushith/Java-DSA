public class PrimesBetween {
    public static void main(String[] args) {
        Primes(1, 9);
    }

    static void Primes(int lower, int upper) {
        for (int i = lower; i < upper; i++) {
            if (i == 1 || i == 0) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
