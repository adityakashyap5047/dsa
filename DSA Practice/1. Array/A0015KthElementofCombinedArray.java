public class A0015KthElementofCombinedArray {
    
    public static int kthElement(int a[], int b[], int k){
        int n1 = a.length;
        int n2 = b.length;

        int combinedArr[] = new int[n1 + n2];

        int i = 0, j = 0, l = 0;
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                combinedArr[l] = a[i];
                i++; 
            } else {
                combinedArr[l] = b[j];
                j++;
            }
            l++;
        }

        while (i < n1) {
            combinedArr[l] = a[i];
            i++;
            l++;
        }

        while (j < n2) {
            combinedArr[l] = b[j];
            j++;
            l++;
        }

        return combinedArr[k-1];
    }

    public static void main(String[] args) {
        int a[] = {100, 112, 256, 349, 770};
        int b[] = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;

        System.out.println(kthElement(a, b, k));
    }
}
