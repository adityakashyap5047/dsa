public class A0007MisingNumber {
    
    public static int missingNum(int arr[]){

        int n = arr.length;
        int totalSum = (n+1)*(n+2)/2;

        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];
        }

        return totalSum;
    }

    public static int missingNumber(int arr[]){
        int n = arr.length;

        boolean num[] = new boolean[n+1];
        for (int i = 0; i < n; i++) {
            num[arr[i]-1] = true;
        }

        for (int i = 1; i < num.length; i++) {
            if (!num[i]) {
                return i+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6};
        System.out.println(missingNumber(arr));
    }
}
