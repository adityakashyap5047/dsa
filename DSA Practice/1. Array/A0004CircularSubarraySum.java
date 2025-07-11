public class A0004CircularSubarraySum {
    
    public static int Kadane(int arr[]){
        int n = arr.length;
        int maxSum = 0;

        int currSum[] = new int[n];

        boolean isNegative;
        int maxNegative = arr[0];
        if (arr[0] < 0) {
            isNegative = true;
            currSum[0] = 0;
        } else {
            isNegative = false;
            currSum[0] = arr[0];
        }

        for (int i = 1; i < n; i++) {
            if (isNegative && arr[i] < 0) {
                isNegative = true;
                maxNegative = Math.max(maxNegative, arr[i]);
            } else {
                isNegative = false;
            }
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

        if (isNegative) {
            return maxNegative;
        }

        return maxSum;
    }

    public static int circularSubarraySum(int arr[]){
        
        int maxNormal = Kadane(arr);

        if (maxNormal < 0) {
            return maxNormal;
        }

        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            arr[i] = -arr[i];
        }

        int invertedSum = Kadane(arr);
        int maxCircular = totalSum + invertedSum;

        return Math.max(maxNormal, maxCircular);
    }

    public static void main(String[] args) {

        int arr[] = {-4, -2, -1, -2, -6};
        System.out.println(circularSubarraySum(arr));
    }
}
