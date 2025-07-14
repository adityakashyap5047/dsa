import java.util.ArrayList;

public class A00181stnlastOccurance {
    
    public static ArrayList<Integer> find(int arr[], int target){
        int si = 0;
        int ei = arr.length - 1;

        ArrayList<Integer> list = new ArrayList<>();

        while (si <= ei) {
            int mid = si + (ei - si)/2;

            if (arr[mid] == target) {
                while (mid > 0 && arr[mid - 1] == target) {
                    mid = mid - 1;
                }
                list.add(mid);
                while (mid < arr.length - 1 && arr[mid + 1] == target) {
                    mid = mid + 1;
                }
                list.add(mid);
                return list;
            } else if (arr[mid] > target) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        
        list.add(-1);
        list.add(-1);
        return list;
    }

    public static void main(String[] args) {
        
        int arr[] = {5, 7, 7, 7, 8, 8, 8};
        ArrayList<Integer> list = find(arr, 8);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
