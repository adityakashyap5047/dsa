public class L12TrappingRainWater {

    public static int calculateRainWater(int barHeight[], int barWidth){

        int n = barHeight.length;
        int leftMaxHeight[] = new int[n];
        int rightMaxHeight[] = new int[n];
        int maxWaterHeight[] = new int[n];

        int rainWater = 0;

        leftMaxHeight[0] = barHeight[0];
        for (int i = 1; i < leftMaxHeight.length; i++) {
            leftMaxHeight[i] = Math.max(leftMaxHeight[i-1], barHeight[i-1]);
        }

        rightMaxHeight[n - 1] = barHeight[n - 1];
        for (int i = n-2; i >= 0; i--) {
            rightMaxHeight[i] = Math.max(rightMaxHeight[i+1], barHeight[i+1]);
        }

        for (int i = 0; i < n; i++) {
            maxWaterHeight[i] = Math.min(leftMaxHeight[i], rightMaxHeight[i]);
        }

        for (int i = 0; i < n; i++) {
            rainWater += (Math.max(maxWaterHeight[i] - barHeight[i], 0)) * barWidth;
        }
        
        return rainWater;
    }
    
    public static void main(String[] args) {
        int barHeight[] = {4, 2, 0, 6, 3, 2, 5};
        int barWidth = 1;

        System.out.println(calculateRainWater(barHeight, barWidth));
    }
}
