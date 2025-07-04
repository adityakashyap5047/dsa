import java.util.Scanner;
import java.lang.Math;

public class I1AreaofCircle {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        float radius = sc.nextFloat();

        double area = Math.PI * radius * radius;

        System.out.println("The area of circle having radius " + radius + " is " + area);

        sc.close();
    }
}
