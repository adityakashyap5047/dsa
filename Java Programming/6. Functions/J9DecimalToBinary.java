public class J9DecimalToBinary {
    
    public static int decimalToBinary(int num){
         
        int temp = num, rem, binary = 0;
        while (temp > 0) {
            rem = temp % 2;
            binary = binary * 10 + rem;
            temp = temp / 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(156));
    }
}
