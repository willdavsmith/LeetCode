package Files;

public class MaxProfit {
   public static int maxProfit(int[] prices) {
      int lowest = 0;
      for (int i=0; i<prices.length-1; i++) {
         if (prices[i] < prices[i+1]) {
            for (int j = i; j < prices.length; j++) {
               if (prices[j] < prices[i]) j = prices.length;
               else if (prices[j] - prices[i] > lowest)
                  lowest = prices[j] - prices[i];
            }
         }
      }
      return lowest;
   }
}
