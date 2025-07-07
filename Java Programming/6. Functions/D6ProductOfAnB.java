import java.util.Scanner;

public class D6ProductOfAnB{

    public static int multiply(int num1, int num2){
        return num1*num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        int prod = multiply(num1, num2);

        System.out.println("The Product of " + num1 + " and " + num2 + " is: " + prod);

        sc.close();
    }
}