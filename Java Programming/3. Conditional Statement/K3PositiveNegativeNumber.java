import java.util.Scanner;

public class K3PositiveNegativeNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is a Positive Number.");
        } else if (num == 0) {
            System.out.println(num + " is a Zero Number.");
        } else {
            System.out.println(num + " is a Negative Number.");
        }

        sc.close();
    }
}
