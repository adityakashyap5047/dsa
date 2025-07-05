import java.util.Scanner;

public class J4KeepEnteringNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter your number: ");
            int num = sc.nextInt();

            if (num % 10 == 0) {
                System.out.println("You Entered number which is multiple of 10");
                break;
            }
        }
        sc.close();
    }
}
