import java.util.ArrayList;
import java.util.HashSet;

public class A0019FindDuplicates{

    public static ArrayList<Integer> findDuplicates(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                list.add(arr[i]);
            } 
        }

        return list;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 2, 3};

        ArrayList<Integer> list = findDuplicates(arr);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}