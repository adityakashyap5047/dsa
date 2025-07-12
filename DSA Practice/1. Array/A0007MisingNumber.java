public class A0007MisingNumber {
    
    public static int missingNum(int arr[]){

        int n = arr.length;
        int totalSum = (n+1)*(n+2)/2;

        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 4};
        System.out.println(missingNum(arr));
    }
}
