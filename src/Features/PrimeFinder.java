package Features;

import java.util.List;
import java.util.ArrayList;

public class PrimeFinder {

    public PrimeFinder() {

    }

    public static Boolean checkIfPrime(int input) {
        boolean isPrime = true;
        if (input <= 1) return false; // 0 and 1 no primes
        for (int i = 2; i <= (int) Math.sqrt(input); i++) {
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
    public static String findPrimesInRange(int rangeStart, int rangeStop, String delimiter) {

        List<String> primes = new ArrayList<>();

        for (int i = rangeStart; i <= rangeStop; i++) {
            if (checkIfPrime(i)) {
                primes.add(String.valueOf(i));
            }
        }
        return String.join(delimiter, primes);
    }

    public static String findPrimesInRange(int rangeStart, int rangeStop) {
        return findPrimesInRange(rangeStart, rangeStop, "\n");
    }
}
