class Solution {
    public int countCompleteComponents(int V, int[][] edges) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[V];

        int count = 0;

        for (int i = 0; i < V; i++) {

            if (!visited[i]) {

                ArrayList<Integer> component = new ArrayList<>();

                dfs(adjList, i, visited, component);

                int n = component.size();
                int edgeCount = 0;

                // Count edges inside this component
                for (int node : component) {
                    edgeCount += adjList.get(node).size();
                }

                // Every edge is counted twice
                edgeCount /= 2;

                int requiredEdges = n * (n - 1) / 2;

                if (edgeCount == requiredEdges) {
                    count++;
                }
            }
        }

        return count;
    }
    private void dfs(ArrayList<ArrayList<Integer>> adjList,int node, boolean[] visited,ArrayList<Integer> component) {
        visited[node] = true;
        component.add(node);

        for (int near : adjList.get(node)) {
            if (!visited[near]) {
                dfs(adjList, near, visited, component);
            }
        }
    }
}