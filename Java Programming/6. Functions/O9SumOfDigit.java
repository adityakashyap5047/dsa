public class O9SumOfDigit {

    public static int sumOfDigit(int n){
        int lastDigit, sum = 0;
        while (n > 0) {
            lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }

        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(sumOfDigit(1298313));
    }
}
