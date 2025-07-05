public class A1ArithmeticOperator {
    
    public static void main(String[] args) {
        int A = 10;
        int B = 5;

        System.out.println("Addition: " + (A + B));
        System.out.println("Subtraction: " + (A - B));
        System.out.println("Multiplication: " + (A * B));
        System.out.println("Division: " + (A / B));
        System.out.println("Modulus: " + (A % B));

        int C = ++A;
        System.out.println("C with Pre-increment: " + C);
        System.out.println("Value of A after Pre-increment: " + A);

        int D = B++;
        System.out.println("D with Post-increment: " + D);
        System.out.println("Value of B after Post-increment: " + B);

        int E = --A;
        System.out.println("E with Pre-decrement: " + E);
        System.out.println("Value of A after Pre-decrement: " + A);

        int F = B--;
        System.out.println("F with Post-decrement: " + F);
        System.out.println("Value of B after Post-decrement: " + B);
    }
}
