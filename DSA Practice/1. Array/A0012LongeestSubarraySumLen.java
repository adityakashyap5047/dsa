import java.util.HashMap;

public class A0012LongeestSubarraySumLen {

    public static int subarraySum(int arr[], int target){

        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == target) {
                maxLen = i + 1;
            }

            if (prefixMap.containsKey(prefixSum - target)) {
                int prevIndex = prefixMap.get(prefixSum - target);
                maxLen = Math.max(maxLen, i - prevIndex);
            }

            prefixMap.putIfAbsent(prefixSum, i);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5};

        int subArraySumLen = subarraySum(arr, 12);

        System.out.println(subArraySumLen);
    }
}
