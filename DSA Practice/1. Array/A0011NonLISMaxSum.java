public class A0011NonLISMaxSum{

    public static int nonLISMaxSum(int arr[]){
        int n = arr.length;

        // dp[i]: length of LIS ending at i
        int[] len = new int[n];
        // sum[i]: sum of LIS ending at i
        int[] sum = new int[n];

        for (int i = 0; i < n; i++) {
            len[i] = 1;
            sum[i] = arr[i];

            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    if (len[j] + 1 > len[i]) {
                        len[i] = len[j] + 1;
                        sum[i] = sum[j] + arr[i];
                    } else if (len[j] + 1 == len[i]) {
                        sum[i] = Math.min(sum[i], sum[j] + arr[i]);
                    }
                }
            }
        }

        // Find max length and min sum among all subsequences of that length
        int maxLen = 0;
        int minLisSum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (len[i] > maxLen) {
                maxLen = len[i];
                minLisSum = sum[i];
            } else if (len[i] == maxLen) {
                minLisSum = Math.min(minLisSum, sum[i]);
            }
        }

        int totalSum = 0;
        for (int val : arr) {
            totalSum += val;
        }

        return totalSum - minLisSum;
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        System.out.println(nonLISMaxSum(arr));
    }
}