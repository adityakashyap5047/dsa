import java.util.ArrayList;

public class A0009PrimeMoney {

    public static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static ArrayList<Integer> primeMoney(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        
        int currLen = 1;
        int currSum = 0;
        int maxLen = 1; 
        int maxSum = 0;

        currSum = isPrime(arr[0]) ? arr[0] : 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                currLen++;
                if (isPrime(arr[i])) {
                    currSum += arr[i];
                }
            } else {
                if (currLen > maxLen) {
                    maxLen = currLen;
                    maxSum = currSum;
                } else if (currLen == maxLen) {
                    maxSum = Math.max(maxSum, currSum);
                }
                currLen = 1;
                currSum = isPrime(arr[i]) ? arr[i] : 0;
            }
        }

        if (currLen > maxLen) {
            maxLen = currLen;
            maxSum = currSum;
        } else if (currLen == maxLen) {
            maxSum = Math.max(maxSum, currSum);
        }
        list.add(maxLen);
        list.add(maxSum);

        return list;
    }
    
    public static void main(String[] args) {
        int arr[] = {4, 2, 3, 5, 1, 6, 7, 8, 9};

        ArrayList<Integer> list = primeMoney(arr);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
