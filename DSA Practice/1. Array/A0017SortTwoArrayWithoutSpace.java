public class A0017SortTwoArrayWithoutSpace {
    
    public static void mergeArrays(int a[], int b[]){
        int n1 = a.length;
        int n2 = b.length;

        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {

                // a[i]
                // combinedArr[l] = a[i];
                i++; 
            } else {

                // b[j]
                // combinedArr[l] = b[j];
                j++;
            }
            // l++;
        }

        while (i < n1) {
            // combinedArr[l] = a[i];
            i++;
            // l++;
        }

        while (j < n2) {
            // combinedArr[l] = b[j];
            j++;
            // l++;
        }

        
    }

    public static void main(String[] args) {
        
    }
}
