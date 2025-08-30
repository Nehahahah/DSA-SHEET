class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxPrice=0;
        for(int price:prices){
            minPrice=Math.min(price,minPrice);
            maxPrice=Math.max(price-minPrice,maxPrice);
        }
        return maxPrice;
    }
}
