class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[] inDegree = new int[numCourses];

        for(int i = 0; i < numCourses; i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] edge : prerequisites){
            adjList.get(edge[1]).add(edge[0]);
            inDegree[edge[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < numCourses; i++){
            if(inDegree[i] == 0){
                q.offer(i);
            }
        }

        int count = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            count++;
            for(int ele : adjList.get(node)){
                inDegree[ele]--;
                if(inDegree[ele] == 0){
                    q.offer(ele);
                }
            }
        }
        return count == numCourses;

    }
}