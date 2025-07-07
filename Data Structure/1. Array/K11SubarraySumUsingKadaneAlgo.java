public class K11SubarraySumUsingKadaneAlgo {
    
    public static int kadaneAlgo(int arr[]){

        int csArray[] = new int[arr.length];

        if (arr[0] < 0) {
                csArray[0] = 0;
        }else {
            csArray[0] = arr[0];
        }
        int max = csArray[0];
        for (int i = 1; i < arr.length; i++) {
            if ((csArray[i-1] + arr[i]) < 0) {
                csArray[i] = 0;
            } else{
                csArray[i] = csArray[i-1] + arr[i];
            }

            if (max < csArray[i]) {
                max = csArray[i];
            }
        }

        System.out.print("Current Sum Array: ");
        for (int i = 0; i < csArray.length; i++) {
            System.out.print(csArray[i] + " ");
        }
        System.out.println();

        return max;
    }

    public static void main(String s[]){
        int arr[] = {1, -2, 6, -1, 3};          // {1, -1, 5, 4, 7}
        System.out.println(kadaneAlgo(arr));
        int num[] = {2, 4, 6, 8, 10};           //  {2, 6, 12, 20, 30}
        System.out.println(kadaneAlgo(num));
        int arr2[] = {20, -3, -4, -1};          // {20, 17, 13, 12}
        System.out.println(kadaneAlgo(arr2));
        int num2[] = {-2, -3, 4, -1, -2, 1, 5, -3}; // {-2, -5, -1, -2, -4, -3, 2, -1}
        System.out.println(kadaneAlgo(num2)); // {0, 0, 4, 3, 1, 2, 7, 4}
    }
}