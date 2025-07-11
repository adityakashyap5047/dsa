public class A0004CircularSubarraySum {
    
    public static int circularSubarraySum(int arr[]){

        int n = arr.length;
        int maxSum = 0;

        int currSum[] = new int[n];

        if (arr[0] < 0) {
            currSum[0] = 0;
        } else {
            currSum[0] = arr[0];
        }

        for (int i = 1; i < n; i++) {
            int sum = currSum[i-1] + arr[i];
            if (sum < 0) {
                currSum[i] = 0;
            } else {
                currSum[i] = sum;
            }
        }

        for (int i = 0; i < currSum.length; i++) {
            if (maxSum < currSum[i]) {
                maxSum = currSum[i];
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int arr[] = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(circularSubarraySum(arr));
    }
}
