import Features.PrimeFinder;

public class Main {

    public static void main(String[] args) {

        int num = 107;
        if (PrimeFinder.checkIfPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

        System.out.println("================");
        System.out.println(PrimeFinder.findPrimesInRange(100, 100000)); //demonstation of method findPrimesInRange

    }
}
