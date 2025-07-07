public class M9IsPalindrome {
    
    public static boolean isPlaindrome(int n){

        int rem, rev = 0, temp = n;
        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }

        if (n == rev) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isPlaindrome(123));
        System.out.println(isPlaindrome(121));
        System.out.println(isPlaindrome(121983));
        System.out.println(isPlaindrome(12321));
    }
}
