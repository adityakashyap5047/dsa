public class G2FindExpressionOutput {
    
    public static void main(String[] args){
        int x, y, z;

        x = y = z = 2;
        x += y;         // x = 2 + 2 = 4
        y -= z;         // y = 2 - 2 = 0
        z /= (x + y);   // z = 2 / (4 + 0) = 2 / 4 = 0
        System.out.println(x + " " + y + " " + z);
    }
}
