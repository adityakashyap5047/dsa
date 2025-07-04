import java.util.Scanner;

public class N1AreaOfSquare {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of Square: ");
        float side = sc.nextFloat();

        double area = side * side;

        System.out.println("The area of Square having side " + side + " is " + area);

        sc.close();
    }
}
