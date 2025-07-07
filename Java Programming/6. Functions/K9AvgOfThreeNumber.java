import java.util.Scanner;

public class K9AvgOfThreeNumber {

    public static int avg(int num1, int num2, int num3){
        return (num1 + num2 + num3 )/3;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter 3rd number: ");
        int num3 = sc.nextInt();

        System.out.println("The Average of " + num1 + ", " + num2 + " and " + num3 + " is: " + avg(num1, num2, num3));
        
        sc.close();
    }
}
