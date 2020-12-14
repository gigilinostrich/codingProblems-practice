//Input: [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
          //   Not 7-1 = 6, as selling price needs to be larger than buying price.

class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE; // always set min to Integer.MAX_Value
        int maxProf = 0; 
        
        for (int i = 0; i < prices.length; i ++){
            if(prices[i] < min){ // set the min value from the array
                min = prices[i]; // set new min 
            }
            else if (prices[i] - min > maxProf){ // if the calculated profit is bigger than the maxProf ( 0 initially)
                maxProf = prices [i] - min; // set new Max profit
            }
        }
        return maxProf;
    }
