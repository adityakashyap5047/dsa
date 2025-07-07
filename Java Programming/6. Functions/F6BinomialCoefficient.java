public class F6BinomialCoefficient {

    public static int factorial(int n){
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return 1;
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static int binomialCoefficient(int n, int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }

    public static void main(String[] args) {
        
        System.out.println(binomialCoefficient(5, 2));
    }
}
