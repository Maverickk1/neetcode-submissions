class Solution {
    public int maxProfit(int[] prices) {
        int[] profit = new int[prices.length];

        int min = prices[0];


        for(int i=0; i<prices.length;i++){
            min= Math.min(min,prices[i]);


            int profitToday = prices[i]-min;


            if(profitToday<0){
                min = prices[i];
                profit[i]=0;
            }
            else{
                profit[i]=profitToday;
            }
          
        }

        int maxprofit = Arrays.stream(profit).max().getAsInt();

      return maxprofit;

    }
}
