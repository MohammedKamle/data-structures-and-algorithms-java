package leetcode;



public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int maxDiff = 0;
        for(int i=0; i<prices.length; i++){
            for (int j=i+1; j< prices.length; j++){
                if (maxDiff < (prices[j]-prices[i])){
                    maxDiff = prices[j]-prices[i];
                }
            }
        }
        return maxDiff;
    }

    //https://www.youtube.com/watch?v=34WE6kwq49U
    // O(n) space - O(n)
    public static int maxProfit_(int[] prices) {
        int[] aux = new int[prices.length];
        aux[prices.length-1] = prices[prices.length-1];
        for (int i=prices.length-2; i>=0; i--){
                aux[i] = Math.max(prices[i] , aux[i+1]);
        }
        int maxProfit=0;
        for(int i=0; i<prices.length; i++){
            int diff = aux[i] - prices[i];
            if (diff> maxProfit){
                maxProfit = diff;
            }
        }
        return maxProfit;
    }
    //https://www.youtube.com/watch?v=34WE6kwq49U
    //O(n) space O(1)
    public static int maxProfit__(int[] prices){
        int minSoFar = prices[0];
        int maxProfit = 0;
        for (int i=0; i<prices.length; i++){
            if (minSoFar> prices[i]){
                minSoFar = prices[i];
            }
            int profit = prices[i]-minSoFar;
            if (profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static int maxProfit___(int[] prices){
        int min = Integer.MAX_VALUE;
        int result = Integer.MIN_VALUE;
        for (int val : prices){
            min = Math.min(min,val);
            result = Math.max(result, val-min);
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(maxProfit__(new int[]{7,1,5,3,6,4}));
    }
}
