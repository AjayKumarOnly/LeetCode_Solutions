class Solution {
    public int minScore(int n, int[][] roads) {
        List<List<int[]>> adj = new ArrayList<>();

        for(int i = 0 ; i <= n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] road : roads){
            int u = road[0];
            int v = road[1];
            int w = road[2];

            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});
        }
        boolean[] visited = new boolean[n+1];
        return dfs(1,visited,adj);
    }
    private int dfs(int node , boolean[] visited , List<List<int[]>> adj){
        visited[node] = true;
        int ans = 1000001;

        for(int[] edge : adj.get(node)){
            int nextNode = edge[0];
            int weight = edge[1];

            ans = Math.min(ans,weight);

            if(!visited[nextNode]){
                ans = Math.min(ans,dfs(nextNode,visited,adj));
            }
        }
        return ans ;
    }
}