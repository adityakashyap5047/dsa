import java.util.ArrayList;

public class A0008SubarraySum{

    public static int prefixSum(int prefixArr[], int minIdx, int maxIdx){
        if (minIdx == 0) {
            return prefixArr[maxIdx];
        } else{
            return prefixArr[maxIdx] - prefixArr[minIdx - 1];
        }
    }

    public static ArrayList<Integer> subarraySum(int arr[], int target){
        ArrayList<Integer> list = new ArrayList<>();

        int prefixArr[] = new int[arr.length];
        
        prefixArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixArr[i] = arr[i] + prefixArr[i-1];
        }

        for(int minIdx = 0; minIdx < arr.length; minIdx++){
            for(int maxIdx = minIdx; maxIdx < arr.length; maxIdx++){
                int sum = prefixSum(prefixArr, minIdx, maxIdx);
                if (sum == target) {
                    list.add(minIdx + 1);
                    list.add(maxIdx + 1);
                    return list;
                }
            }
        }

        list.add(-1);
        return list;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5};

        ArrayList<Integer> list = subarraySum(arr, 12);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}