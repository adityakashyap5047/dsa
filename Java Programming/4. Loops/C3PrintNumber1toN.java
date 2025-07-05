import java.util.Scanner;

public class C3PrintNumber1toN {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you number: ");
        int num = sc.nextInt();

        int counter = 1;
        while (counter <= num) {
            System.out.println(counter);
            counter++;
        }

        sc.close();
    }
}
