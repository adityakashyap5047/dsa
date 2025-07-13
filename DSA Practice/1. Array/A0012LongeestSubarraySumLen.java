public class A0012LongeestSubarraySumLen {
    
    public static int prefixSum(int prefixArr[], int minIdx, int maxIdx){
        if (minIdx == 0) {
            return prefixArr[maxIdx];
        } else{
            return prefixArr[maxIdx] - prefixArr[minIdx - 1];
        }
    }

    public static int subarraySum(int arr[], int target){

        int prefixArr[] = new int[arr.length];
        
        prefixArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixArr[i] = arr[i] + prefixArr[i-1];
        }

        int subArrayLen = 0;
        for(int minIdx = 0; minIdx < arr.length; minIdx++){
            for(int maxIdx = minIdx; maxIdx < arr.length; maxIdx++){
                int sum = prefixSum(prefixArr, minIdx, maxIdx);
                if (sum == target) {
                    int len = maxIdx - minIdx + 1;
                    subArrayLen = Math.max(len, subArrayLen);
                }
            }
        }

        return subArrayLen;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5};

        int subArraySumLen = subarraySum(arr, 12);

        System.out.println(subArraySumLen);
    }
}
