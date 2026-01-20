class Solution {
public:
    int minStartValue(vector<int>& nums) {
        int mini = 0;
        int preSum = 0;
        for(int i : nums){
            preSum += i;
            mini = min(mini,preSum);
        }
        mini = abs(mini);
        if(mini > 0){
            return mini +1;
        }
        return 1;
    }
};