public class G6MethodOverloading {
    
    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        System.out.println(sum(4, 9));
        System.out.println(sum(9, 3, 8));
    }
}
