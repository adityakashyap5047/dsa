import java.util.Scanner;

public class G1SumofAnBusingInput {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int A = sc.nextInt();

        System.out.print("Enter B: ");
        int B = sc.nextInt();

        int sum = A + B;

        System.out.println("The sum of "+ A + " and " + B + " is " + sum);

        sc.close();
    }
}
