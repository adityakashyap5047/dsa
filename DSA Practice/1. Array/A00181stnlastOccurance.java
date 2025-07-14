import java.util.ArrayList;

public class A00181stnlastOccurance {
    
    public static ArrayList<Integer> find(int arr[], int target){
        int si = 0;
        int ei = arr.length - 1;

        ArrayList<Integer> list = new ArrayList<>();

        while (si <= ei) {
            int mid = si + (ei - si)/2;

            if (arr[mid] == target) {
                while (arr[mid - 1] == target) {
                    mid = mid - 1;
                }
                list.add(mid);
                while (arr[mid + 1] == target) {
                    mid = mid + 1;
                }
                list.add(mid);
                return list;
            } else if (arr[mid] > target) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        
        list.add(-1);
        return list;
    }

    public static void main(String[] args) {
        
        int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        ArrayList<Integer> list = find(arr, 5);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
