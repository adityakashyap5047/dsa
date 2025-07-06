import java.util.Scanner;

public class B6SumOfNoUsingFunction {
    
    public static void sumOfNumber(int num1, int num2){
        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        sumOfNumber(num1, num2);
        sc.close();
    }
}
