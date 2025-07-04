import java.util.Scanner;

public class H1ProductAnB {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int A = sc.nextInt();

        System.out.print("Enter B: ");
        int B = sc.nextInt();

        int prod = A * B;

        System.out.println("The product of "+ A + " and " + B + " is " + prod);

        sc.close();
    }
}
