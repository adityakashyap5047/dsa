public class H8PrimesInRange {
    
    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimes(int n){
        if (n <= 1) {
            return;
        }
        System.out.print("The Prime number between 1 and " + n + " is: ");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printPrimes(25);
        printPrimes(9);
        printPrimes(11);
    }
}
