public class A0003TrappingRainWater{

    public static int maxWater(int arr[]){
        int n = arr.length;

        int leftHeight[] = new int[n];
        int rightHeight[] = new int[n];
        int height[] = new int[n];
        int waterQuant = 0;

        leftHeight[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftHeight[i] = Math.max(leftHeight[i-1], arr[i-1]);
        }

        rightHeight[n-1] = arr[n-1];
        for (int i = n-2; i > 0; i--) {
            rightHeight[i] = Math.max(rightHeight[i+1], arr[i+1]);
        }

        for (int i = 0; i < height.length; i++) {
            height[i] = Math.min(leftHeight[i], rightHeight[i]);
            waterQuant += Math.max(height[i]-arr[i], 0);
        }

        return waterQuant;
    }

    public static void main(String[] args) {
        int arr[] = {3, 0, 1, 0, 4, 0, 2};
        System.out.println(maxWater(arr));
    }
}