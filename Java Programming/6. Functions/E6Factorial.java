public class E6Factorial {
    
    public static int factorial(int n){
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1){
            return 1;
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(4));
        System.out.println(factorial(3));
        System.out.println(factorial(2));
        System.out.println(factorial(1));
        System.out.println(factorial(0));
        System.out.println(factorial(-1));
        System.out.println(factorial(-2));
    }
}
