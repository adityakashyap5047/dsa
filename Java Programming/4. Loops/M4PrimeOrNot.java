import java.util.Scanner;

public class M4PrimeOrNot {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number: ");
        int num = sc.nextInt();

        boolean prime = true;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println("The Number " + num + " is a Prime Number.");  
        } else {
            System.out.println("The Number " + num + " is not a Prime Number.");  
        }

        sc.close();
    }
}
