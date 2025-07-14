public class A0014SmallestPositiveMissing {
    
    public static int smallestPositiveMissing(int arr[]){

        boolean isMissing[] = new boolean[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < isMissing.length + 1) {
                isMissing[arr[i]-1] = true;
            }
        }

        for (int i = 0; i < isMissing.length; i++) {
            if (!isMissing[i]) {
                return i+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println(smallestPositiveMissing(arr));
    }
}
