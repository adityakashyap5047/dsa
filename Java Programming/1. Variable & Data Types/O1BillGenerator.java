import java.util.Scanner;

public class O1BillGenerator {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of Pencil: ");
        float pencilPrice = sc.nextFloat();

        System.out.print("Enter the price of Pen: ");
        float penPrice = sc.nextFloat();

        System.out.print("Enter the price of Eraser: ");
        float eraserPrice = sc.nextFloat();

        float totalPrice = pencilPrice + penPrice + eraserPrice;

        float priceWithGST = totalPrice + totalPrice * 0.18f;

        System.out.println("The total cost that you need to pay is: " + priceWithGST);

        sc.close();
    }
}
