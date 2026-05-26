class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int L = 0;

        for (int R = L + 1; R < prices.length; R++) {
            if (prices[L] >= prices[R]) {
                L = R;
            }

            max = Math.max(max, prices[R] - prices[L]);
        }

        return max;
    }
}
