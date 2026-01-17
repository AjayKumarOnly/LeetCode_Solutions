class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int profit = 0;
        int mini = prices[0];
        for(int i= 0; i< prices.size();i++){
            mini = min(mini, prices[i]);
            int p = prices[i]-mini;
            profit = max(profit,p);
        }
        return profit;
    }
};