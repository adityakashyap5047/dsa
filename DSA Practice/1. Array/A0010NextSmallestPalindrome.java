public class A0010NextSmallestPalindrome {
    
    public static int nextSmallestPalindrome(int arr[]){
        int n = arr.length;
        
        if (n % 2 == 1) {
            if (arr[n/2] == 9) {
                arr[n/2 - 1] = arr[n/2 - 1] + 1;
                arr[n/2] = 0;
            } else {
                arr[n/2] = arr[n/2] + 1;
            }
        } else {
            if (arr[n/2] > arr[n/2 - 1]) {
                arr[n/2] = arr[n/2 - 1] + 1;
                arr[n/2 - 1] = arr[n/2 - 1] + 1;
            } else {
                arr[n/2] = arr[n/2 - 1];
            }
        }

        for (int i = 0; i < n/2; i++) {
            arr[n-i-1] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        return arr[0];
    }

    public static void main(String[] args) {
        int arr[] = {999};
        nextSmallestPalindrome(arr);
    }
}
