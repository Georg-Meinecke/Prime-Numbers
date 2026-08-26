public class PrimeFinder {

    public PrimeFinder() {

    }

    public Boolean checkIfPrime(int input) {
        boolean isPrime = true;
        if (input <= 1) return false; // 0 and 1 no primes
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            return true;
        } else {
            return false;
        }
    }
}
