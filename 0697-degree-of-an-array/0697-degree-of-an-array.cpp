class Solution {
public:
    int findShortestSubArray(vector<int>& nums) {
        unordered_map<int,int>freq,first,last;
        for(int i =0; i< nums.size();i++){
            int x = nums[i];
            freq[x]++;
            if(!first.count(x)) first[x] = i;
            last[x] = i;
        }
        int degree = 0;
        for(auto &p : freq)
            degree = max(degree,p.second);
        int ans = nums.size();
         for(auto &p : freq){
            if(degree == p.second){
                ans = min(ans,last[p.first] - first[p.first]+1);
            }
         }
         return ans;
    }
};