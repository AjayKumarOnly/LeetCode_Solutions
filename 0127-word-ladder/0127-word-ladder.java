class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> dic = new HashSet<>(wordList);
        if(!dic.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);// start with beginWord = 'hit'
        int depth = 1;

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){

                String curr = queue.poll();
                char[] chars = curr.toCharArray();

                for(int j = 0 ; j < chars.length; j++){
                    char original = chars[j];

                    for(char c = 'a' ; c <= 'z'; c++){

                        if(c == original) continue; 

                        chars[j] = c;
                        String next = new String(chars);
                        if(next.equals(endWord)) return depth + 1;

                        if(dic.contains(next)){
                            queue.offer(next);
                            dic.remove(next);
                        }
                    }
                    chars[j] = original ;
                }
            }

            depth++;
        }
        return 0;

    }
}
//tc -> O(n * length of str * 26);
// sc -> O(N); -> length 0f wordList;