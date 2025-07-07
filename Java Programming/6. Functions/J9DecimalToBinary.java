public class J9DecimalToBinary {
    
    public static int decimalToBinary(int num){
         
        int temp = num, rem;
        String binary = "";
        while (temp > 0) {
            rem = temp % 2;
            binary = Integer.toString(rem) + binary;
            temp = temp / 2;
        }
        return Integer.parseInt(binary);
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(156));
        System.out.println(decimalToBinary(15));
        System.out.println(decimalToBinary(4));
    }
}
