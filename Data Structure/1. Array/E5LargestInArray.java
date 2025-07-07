public class E5LargestInArray {

    public static int largestInArray(int arr[]){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int arr[] = {12, 2, 5, 2, 9, 0, 3, 11};
        System.out.println(largestInArray(arr));
    }
}
