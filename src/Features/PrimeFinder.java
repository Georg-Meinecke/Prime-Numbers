package Features;

public class PrimeFinder {

    public PrimeFinder() {

    }

    public static Boolean checkIfPrime(int input) {
        boolean isPrime = true;
        if (input <= 1) return false; // 0 and 1 no primes
        for (int i = 2; i < (int) Math.sqrt(input); i++) {
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
    public static String findPrimesInRange(int rangeStart, int rangeStop) {
        String outputMSG = "";

        for (int i = rangeStart; i <= rangeStop; i++) {
            if (checkIfPrime(i)) {
                outputMSG += i + "\n";
            }
        }
        return outputMSG;
    }
}
