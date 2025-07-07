public class L9IsEven {
    
    public static boolean isEven(int num){
        if(num % 2 == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println(isEven(2));
    }
}
