public class A0006Find2ndLargest{

    public static int Largest2nd(int arr[]){

        int largest = Integer.MIN_VALUE;
        int largest2nd = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest2nd = largest;
                largest = arr[i];
            } else if (largest > arr[i] && largest2nd < arr[i]) {
                largest2nd = arr[i];
            }
        }

        if (largest2nd == Integer.MIN_VALUE) return -1;
        else return largest2nd;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 9, 9, 6};

        System.out.println(Largest2nd(arr));
    }
}