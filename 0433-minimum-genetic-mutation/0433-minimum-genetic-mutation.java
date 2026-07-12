class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> dic = new HashSet<>(Arrays.asList(bank));
        if(!dic.contains(endGene)) return -1;
        char[] ele = {'A','C','G','T'};

        Queue<String> queue = new LinkedList<>();
        int min = 0;
        queue.offer(startGene);

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i = 0 ; i < size ; i++){
                String curr = queue.poll();
                char[] chars = curr.toCharArray();
                
                for(int j = 0; j < chars.length; j++){
                    char original = chars[j];

                    for(char c : ele){
                        if(c == original) continue;

                        chars[j] = c;
                        String next = new String(chars);
                        if(next.equals(endGene))return min + 1;
                        if(dic.contains(next)){
                            queue.offer(next);
                            dic.remove(next);
                        }
                    }  
                    chars[j]  = original;   
                }
            }
             min++;
        }
        return -1;
    }
}