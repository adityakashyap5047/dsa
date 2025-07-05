import java.util.Scanner;

public class O4SumOfEvenOdd {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenSum = 0, oddSum = 0;

        while (true) {

            System.out.print("Enter the number: ");
            int num = sc.nextInt();

            if (num == 0){
                break;
            } else if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        System.out.println("The sum of Even numbers is: " + evenSum);
        System.out.println("The sum of Odd numbers is: " + oddSum);

        sc.close();
    }
}
