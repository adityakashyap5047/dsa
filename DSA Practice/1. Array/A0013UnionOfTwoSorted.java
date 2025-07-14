import java.util.ArrayList;
import java.util.LinkedHashSet;

public class A0013UnionOfTwoSorted{

    public static ArrayList<Integer> findUnion(int a[], int b[]){
        int n1 = a.length;
        int n2 = b.length;

        ArrayList<Integer> list = new ArrayList<>();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                set.add(a[i]);
                i++;
            } else if(a[i] == b[j]) {
                set.add(a[i]);
                i++;
                j++;
            }
            else {
                set.add(b[j]);
                j++;
            }
        }

        while (i < n1) {
            set.add(a[i]);
            i++;
        }

        while (j < n2) {
            set.add(b[j]);
            j++;
        }

        for (Integer num : set) {
            list.add(num);
        }

        return list;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3};

        ArrayList<Integer> list = findUnion(a, b);

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}