class Solution {
public:
    vector<int> sortArray(vector<int>& nums) {
         map<int,int>mpp;
         for(int i = 0; i < nums.size();i++){
            mpp[nums[i]]++;
         }
         vector<int>ans;
         for(auto &j : mpp){
            for(int i =0 ; i < j.second;i++){
                ans.push_back(j.first);
            }
         }
         return ans;
    }
};