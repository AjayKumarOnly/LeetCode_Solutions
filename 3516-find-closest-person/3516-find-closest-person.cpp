class Solution {
public:
    int findClosest(int x, int y, int z) {
        int p2  = abs(y - z);
        int p1  = abs(z - x);

        if(p1 == p2) return 0;
        else if(p1 < p2) return 1;
        else { 
            return 2;
        }
    }
};