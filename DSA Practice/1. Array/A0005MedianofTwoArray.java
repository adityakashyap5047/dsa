public class A0005MedianofTwoArray {

    public static double medianOf2(int a[], int b[]){
        int n1 = a.length;
        int n2 = b.length;

        int sortedArr[] = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                sortedArr[k] = a[i];
                i++;
            } else {
                sortedArr[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            sortedArr[k] = a[i];
            i++;
            k++;
        }

        while (j < n2) {
            sortedArr[k] = b[j];
            j++;
            k++;
        }

        int n = n1 + n2;
        if (n % 2 == 1) {
            return sortedArr[n / 2];
        } else {
            return (sortedArr[n / 2 - 1] + sortedArr[n / 2]) / 2.0;
        }
    }
    
    public static void main(String[] args) {
        int a[] = {2, 3, 5, 8};
        int b[] = {10, 12, 14, 16, 18, 20};
        System.out.println(medianOf2(a, b));
    }
}
