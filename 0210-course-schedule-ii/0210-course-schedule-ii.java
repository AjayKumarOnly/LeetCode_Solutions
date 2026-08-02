class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[] inDegree = new int[numCourses];

        for(int i = 0 ; i < numCourses; i++){
            adjList.add(new ArrayList<>());
        }

        for(int edge[] : prerequisites){
            adjList.get(edge[1]).add(edge[0]);
            inDegree[edge[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ;i < numCourses;i++){
            if(inDegree[i]==0) q.offer(i);
        }

        int[] res = new int[numCourses];
        int ind = 0;

        while(!q.isEmpty()){
            int node = q.poll();
            res[ind++] = node;

            for(int n : adjList.get(node)){
                inDegree[n]--;
                if(inDegree[n] == 0) q.offer(n);
            }
            
        }
        return ind==numCourses ? res : new int[0];
    }
} 