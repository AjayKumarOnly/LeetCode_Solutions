class Solution {
    public int maxNumberOfBalloons(String text) {

        Map<Character, Integer> mpp = new HashMap<>();

        for(char c : text.toCharArray()){
            mpp.put(c, mpp.getOrDefault(c, 0) + 1);
        }

        int ans = 0;

        while(
            mpp.getOrDefault('b', 0) >= 1 &&
            mpp.getOrDefault('a', 0) >= 1 &&
            mpp.getOrDefault('l', 0) >= 2 &&
            mpp.getOrDefault('o', 0) >= 2 &&
            mpp.getOrDefault('n', 0) >= 1
        ){

            mpp.put('b', mpp.get('b') - 1);
            mpp.put('a', mpp.get('a') - 1);
            mpp.put('l', mpp.get('l') - 2);
            mpp.put('o', mpp.get('o') - 2);
            mpp.put('n', mpp.get('n') - 1);

            ans++;
        }

        return ans;
    }
}