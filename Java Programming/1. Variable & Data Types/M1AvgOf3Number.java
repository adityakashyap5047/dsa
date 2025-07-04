import java.util.Scanner;

public class M1AvgOf3Number {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter 3rd Number: ");
        int num3 = sc.nextInt();

        int avg = (num1 + num2 + num3)/3;

        System.out.println("The average of " + num1 + " , " + num2 + " and " + num3 + " is: " + avg);
        
        sc.close();
    }
}
