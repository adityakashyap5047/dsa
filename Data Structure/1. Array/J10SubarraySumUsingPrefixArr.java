public class J10SubarraySumUsingPrefixArr {
    
    public static int maxSubarraySum(int arr[]){
        int prefixArr[] = new int[arr.length];

        int max = 0;
        prefixArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixArr[i] = prefixArr[i-1] + arr[i];
        }
        System.out.print("Prefix Array: ");
        for (int i = 0; i < prefixArr.length; i++) {
            System.out.print(prefixArr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < prefixArr.length; i++) {
            for (int j = i; j < prefixArr.length; j++) {
                int sum = 0;
                if (i == 0) {
                    sum = prefixArr[j];
                } else {
                    sum = prefixArr[j] - prefixArr[i-1]; 
                }
                if (max < sum){
                    max = sum;
                }
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};          // {1, -1, 5, 4, 7}
        System.out.println(maxSubarraySum(arr));
        int num[] = {2, 4, 6, 8, 10};           //  {2, 6, 12, 20, 30}
        System.out.println(maxSubarraySum(num));
        int arr2[] = {20, -3, -4, -1};          // {20, 17, 13, 12}
        System.out.println(maxSubarraySum(arr2));
    }
}
