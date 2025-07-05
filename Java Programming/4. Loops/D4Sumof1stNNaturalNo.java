import java.util.Scanner;

public class D4Sumof1stNNaturalNo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        int counter = 1, sum = 0;
        while (counter <= num) {
            sum += counter;
            counter++;
        }

        System.out.println("The sum of 1st " + num + " Natural Number is: " + sum);
        sc.close();
    }
}
