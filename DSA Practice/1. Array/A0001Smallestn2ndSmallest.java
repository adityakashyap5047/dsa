import java.util.ArrayList;

public class A0001Smallestn2ndSmallest {
    
    public static ArrayList<Integer> smallest(int arr[]){
        ArrayList<Integer> smallestNo = new ArrayList<>();

        int smallest = Integer.MAX_VALUE, smallest2nd = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest2nd = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && smallest2nd > arr[i]) {
                smallest2nd = arr[i];
            }
        }
        if (smallest2nd == Integer.MAX_VALUE) {
            smallestNo.add(-1);
        } else {
            smallestNo.add(smallest);
            smallestNo.add(smallest2nd);
        }

        return smallestNo;
    }

    public static void main(String s[]){
        int arr[] = {2, 4, 3, 5, 6};
        ArrayList<Integer> smallestNo = smallest(arr);
        for (int i = 0; i < smallestNo.size(); i++) {
            System.out.print(smallestNo.get(i) + " ");
        }
        System.out.println();
    }
}
