public class M13BuynSellStock {

    public static int maxStockProfit(int prices[]){
        int minBuyPrice = prices[0];

        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            minBuyPrice = Math.min(minBuyPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minBuyPrice);
        }

        return maxProfit;
    }
    
    public static void main(String[] args) {
        
        int prices[] = {7, 1, 5, 3, 6};
        System.out.println(maxStockProfit(prices));
    }
}
