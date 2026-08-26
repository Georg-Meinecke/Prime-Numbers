public class Main {

    public static void main(String[] args) {
        PrimeFinder primeFinder = new PrimeFinder();

        int num = 13;
        if (primeFinder.checkIfPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
