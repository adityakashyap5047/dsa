import java.util.Scanner;

public class G4PrintReverseOfNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int temp = num, rem = 0, rev = 0;
        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        System.out.println("The reverse of " + num + " is: " + rev);
        sc.close();
    }
}
