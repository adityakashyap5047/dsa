import java.util.Scanner;

public class F4PrintSquarePattern {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of line in pattern: ");
        int line = sc.nextInt();

        for(int i = 1; i <= line; i++){
            for (int j = 1; j <= line; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
