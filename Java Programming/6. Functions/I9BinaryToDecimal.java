public class I9BinaryToDecimal {
    
    public static int binaryToDecimal(int binaryNumber){
        int temp = binaryNumber, rem, dec = 0, bin = 1;
        while (temp > 0) {
            rem = temp % 10;
            if (rem == 0 || rem == 1) {
                dec += rem * bin;
                bin *= 2;
                temp = temp / 10;
            } else {
                return -1;
            }
        }
        return dec;
    }

    public static void main(String[] args) {
        System.out.println(binaryToDecimal(1011));
        System.out.println(binaryToDecimal(10011100));
        System.out.println(binaryToDecimal(100));
    }
}
